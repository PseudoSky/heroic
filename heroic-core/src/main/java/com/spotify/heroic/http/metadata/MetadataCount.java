/*
 * Copyright (c) 2015 Spotify AB.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.heroic.http.metadata;

import static java.util.Optional.ofNullable;

import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.heroic.QueryDateRange;
import com.spotify.heroic.filter.Filter;

import lombok.Data;

@Data
public class MetadataCount {
    private final Optional<Filter> filter;
    private final Optional<QueryDateRange> range;

    @JsonCreator
    public MetadataCount(@JsonProperty("filter") Filter filter,
            @JsonProperty("range") QueryDateRange range) {
        this.filter = ofNullable(filter);
        this.range = ofNullable(range);
    }

    public static MetadataCount createDefault() {
        return new MetadataCount(null, null);
    }
}
