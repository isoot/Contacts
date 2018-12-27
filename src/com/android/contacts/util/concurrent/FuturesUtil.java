// Copyright 2016 Google Inc. All Rights Reserved.
package com.android.contacts.util.concurrent;

import android.os.Handler;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Has utility methods for operating on ListenableFutures
 */
public class FuturesUtil {

    /**
     * See
     * {@link FuturesUtil#withTimeout(ListenableFuture, long, TimeUnit, ScheduledExecutorService)}
     */
    public static <V> ListenableFuture<V> withTimeout(final ListenableFuture<V> future, long time,
            TimeUnit unit, Handler handler) {
        return withTimeout(future, time, unit, ContactsExecutors.newHandlerExecutor(handler));
    }

    /**
     * Returns a future that completes with the result from the input future unless the specified
     * time elapses before it finishes in which case the result will contain a TimeoutException and
     * the input future will be canceled.
     *
     * <p>Guava has Futures.withTimeout but it isn't available until v19.0 and we depend on v14.0
     * right now. Replace usages of this method if we upgrade our dependency.</p>
     */
    public static <V> ListenableFuture<V> withTimeout(final ListenableFuture<V> future, long time,
            TimeUnit unit, ScheduledExecutorService executor) {
        return Futures.withTimeout(future,time,unit,executor);
    }
}
