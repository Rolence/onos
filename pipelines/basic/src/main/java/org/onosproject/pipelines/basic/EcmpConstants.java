/*
 * Copyright 2017-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.pipelines.basic;

import org.onosproject.net.pi.runtime.PiTableId;

/**
 * Constants for the ecmp.p4 program.
 */
public final class EcmpConstants {

    public static final PiTableId TBL_ECMP_TABLE_ID = PiTableId.of("ecmp_table");

    private EcmpConstants() {
        // Hides constructor.
    }
}
