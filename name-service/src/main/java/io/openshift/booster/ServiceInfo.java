/*
 *
 *  Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package io.openshift.booster;

public class ServiceInfo {

    static final String OK = "ok";
    static final String FAIL = "fail";

    static final ServiceInfo INFO_OK = new ServiceInfo(OK);
    static final ServiceInfo INFO_FAIL = new ServiceInfo(FAIL);

    private final String state;

    public ServiceInfo() {
        this.state = null;
    }

    public ServiceInfo(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    boolean isOn() {
        return OK.equals(state);
    }

}
