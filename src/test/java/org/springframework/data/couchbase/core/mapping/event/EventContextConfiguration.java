/*
 * Copyright 2013-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.couchbase.core.mapping.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.UnitTestApplicationConfig;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author Michael Nitschinger
 */
@Configuration
public class EventContextConfiguration extends UnitTestApplicationConfig {

  @Bean
  public LocalValidatorFactoryBean validator() {
    return new LocalValidatorFactoryBean();
  }

  @Bean
  public ValidatingCouchbaseEventListener validatingCouchbaseEventListener() {
    return new ValidatingCouchbaseEventListener(validator());
  }

  @Bean
  public SimpleMappingEventListener simpleMappingEventListener() {
    return new SimpleMappingEventListener();
  }

}