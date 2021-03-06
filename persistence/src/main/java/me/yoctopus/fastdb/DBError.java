/*
 * Copyright 2017, Solutech RMS
 * Licensed under the Apache License, Version 2.0, "Solutech Limited".
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.yoctopus.fastdb;

/**
 * Created by yoctopus on 2/21/17.
 */
public  final class DBError extends Exception {
    public DBError() {
    }

    public DBError(String message) {
        super(message);
    }

    public DBError(Throwable cause) {
        super(cause);
    }
}
