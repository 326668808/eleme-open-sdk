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
package com.fshows.sdk.ele.api.request;

import com.alibaba.fastjson.JSON;
import com.fshows.sdk.ele.api.ElemeRequest;
import com.fshows.sdk.ele.api.config.ElemeApiUrlConstant;
import com.fshows.sdk.ele.api.response.ElemeAuthTokenResponse;
import lombok.Data;

/**
 * 授权页获取凭证接口(AuthToken)-入参
 *
 * @author CoderMa
 * @version ElemeAuthTokenRequest.java, v 0.1 2020-03-30 16:29 CoderMa
 */
@Data
public class ElemeAuthTokenRequest extends BaseRequest implements ElemeRequest<ElemeAuthTokenResponse> {

    private String appid;

    private Long time;

    @Override
    public String getApiMethodName() {
        return ElemeApiUrlConstant.GET_AUTH_TOKEN;
    }

    @Override
    public String getBusinessParam() {
        return JSON.toJSONString(this);
    }

    @Override
    public Class<ElemeAuthTokenResponse> getResponseClass() {
        return ElemeAuthTokenResponse.class;
    }

}