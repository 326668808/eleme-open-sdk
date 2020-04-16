/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fshows.sdk.ele.api.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.sdk.ele.api.ElemeResponse;
import lombok.Data;

import java.util.List;

/**
 * 获取商户品类列表接口-出参
 *
 * @author CoderMa
 * @version ElemeShopCategoryListResponse.java, v 0.1 2020-04-03 00:00 CoderMa
 */
@Data
public class ElemeShopCategoryListResponse extends ElemeResponse {

    @JSONField(name = "total_category")
    private List<ElemeShopCategortListInfoResponse> totalCategory;

}