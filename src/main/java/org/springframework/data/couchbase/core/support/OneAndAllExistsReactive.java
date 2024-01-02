/*
 * Copyright 2020-2024 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.couchbase.core.support;

import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.Map;

/**
 * A common interface for those that support one(T), all(Collection&lt;T&gt;)
 *
 * @author Michael Reiche
 *
 */
public interface OneAndAllExistsReactive {
  Mono<Boolean> one(String id);

  Mono<Map<String,Boolean>> all(Collection<String> ids);
}
