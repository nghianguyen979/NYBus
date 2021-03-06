/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.mindorks.nybus.util;

/**
 * Created by amitshekhar on 28/08/17.
 */

/**
 * The utility class.
 */
public class Utils {

    private Utils() {
        // no instance
    }

    /**
     * To check if is UnitTest.
     *
     * @return is unit test.
     */
    public static boolean isUnitTest() {
        try {
            Class.forName("com.mindorks.nybus.UnitTest");
            return true;
        } catch (ClassNotFoundException ignore) {
            return false;
        }
    }

}
