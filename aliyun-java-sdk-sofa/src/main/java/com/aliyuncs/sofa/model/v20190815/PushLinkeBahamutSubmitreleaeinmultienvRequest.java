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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushLinkeBahamutSubmitreleaeinmultienvRequest extends RpcAcsRequest<PushLinkeBahamutSubmitreleaeinmultienvResponse> {
	   

	private String tenantId;

	private List<String> multiEnvConfigsRepeatLists;

	private String releaseId;

	private String iterationId;
	public PushLinkeBahamutSubmitreleaeinmultienvRequest() {
		super("SOFA", "2019-08-15", "PushLinkeBahamutSubmitreleaeinmultienv", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public List<String> getMultiEnvConfigsRepeatLists() {
		return this.multiEnvConfigsRepeatLists;
	}

	public void setMultiEnvConfigsRepeatLists(List<String> multiEnvConfigsRepeatLists) {
		this.multiEnvConfigsRepeatLists = multiEnvConfigsRepeatLists;	
		if (multiEnvConfigsRepeatLists != null) {
			for (int i = 0; i < multiEnvConfigsRepeatLists.size(); i++) {
				putBodyParameter("MultiEnvConfigsRepeatList." + (i + 1) , multiEnvConfigsRepeatLists.get(i));
			}
		}	
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	@Override
	public Class<PushLinkeBahamutSubmitreleaeinmultienvResponse> getResponseClass() {
		return PushLinkeBahamutSubmitreleaeinmultienvResponse.class;
	}

}
