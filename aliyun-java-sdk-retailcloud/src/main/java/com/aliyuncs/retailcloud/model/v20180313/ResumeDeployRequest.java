/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ResumeDeployRequest extends RpcAcsRequest<ResumeDeployResponse> {
	   

	private Long deployOrderId;
	public ResumeDeployRequest() {
		super("retailcloud", "2018-03-13", "ResumeDeploy", "retailcloud");
		setMethod(MethodType.POST);
	}

	public Long getDeployOrderId() {
		return this.deployOrderId;
	}

	public void setDeployOrderId(Long deployOrderId) {
		this.deployOrderId = deployOrderId;
		if(deployOrderId != null){
			putQueryParameter("DeployOrderId", deployOrderId.toString());
		}
	}

	@Override
	public Class<ResumeDeployResponse> getResponseClass() {
		return ResumeDeployResponse.class;
	}

}