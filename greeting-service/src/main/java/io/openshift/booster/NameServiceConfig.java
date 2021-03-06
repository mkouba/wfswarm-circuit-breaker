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

import java.net.URI;
import java.net.URISyntaxException;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.wildfly.swarm.spi.runtime.annotations.ConfigurationValue;

/**
 * See also <tt>src/main/resources/project-defaults.yml</tt>.
 *
 * @author Martin Kouba
 */
@ApplicationScoped
public class NameServiceConfig {

    @Inject
    @ConfigurationValue("name-service.uri")
    String nameServiceUri;

    @Dependent
    @Produces
    URI getNameServiceUri() {
        try {
            return new URI(nameServiceUri);
        } catch (URISyntaxException e) {
            throw new IllegalStateException();
        }
    }

}
