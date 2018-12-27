/*
 * Copyright (C) 2011 The Libphonenumber Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.i18n.phonenumbers.prefixmapper;

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

import java.io.InputStream;

/**
 * A helper class doing file handling and lookup of phone number prefix mappings.
 *
 * @author Shaopeng Jia
 */
public class PrefixFileReader {


    public PrefixFileReader(String phonePrefixDataDirectory) {

    }

    private void loadMappingFileProvider() {

    }

    private PhonePrefixMap getPhonePrefixDescriptions() {
        return null;
    }

    private void loadPhonePrefixMapFromFile(String fileName) {

    }

    private static void close(InputStream in) {

    }


    public String getDescriptionForNumber(
            PhoneNumber number, String language, String script, String region) {
        return "";
    }

    private boolean mayFallBackToEnglish(String lang) {
        // Don't fall back to English if the requested language is among the following:
        // - Chinese
        // - Japanese
        // - Korean
        return !lang.equals("zh") && !lang.equals("ja") && !lang.equals("ko");
    }
}
