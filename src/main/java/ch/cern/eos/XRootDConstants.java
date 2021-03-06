/*
 * Copyright 2014-2022 CERN IT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.cern.eos;

public final class XRootDConstants {

    /**
     * read ahead buffer size to prevent connection re-establishments.
     */
    public static final String READAHEAD_RANGE = "fs.xrootd.readahead.range";
    public static final int DEFAULT_READAHEAD_RANGE = 128 * 1024;

    // name of the environment variable that can be used to specify the read ahead sizez
    public static final String OS_ENV_VARIABLE_READAHEAD = "XROOTDHADOOP_READAHEAD_SIZE";

    private XRootDConstants() {
    }
}
