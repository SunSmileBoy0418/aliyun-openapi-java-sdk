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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListHotlineRecordResponse;
import com.aliyuncs.aiccs.model.v20191015.ListHotlineRecordResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHotlineRecordResponseUnmarshaller {

	public static ListHotlineRecordResponse unmarshall(ListHotlineRecordResponse listHotlineRecordResponse, UnmarshallerContext _ctx) {
		
		listHotlineRecordResponse.setRequestId(_ctx.stringValue("ListHotlineRecordResponse.RequestId"));
		listHotlineRecordResponse.setSuccess(_ctx.booleanValue("ListHotlineRecordResponse.Success"));
		listHotlineRecordResponse.setCode(_ctx.stringValue("ListHotlineRecordResponse.Code"));
		listHotlineRecordResponse.setMessage(_ctx.stringValue("ListHotlineRecordResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHotlineRecordResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCallId(_ctx.stringValue("ListHotlineRecordResponse.Data["+ i +"].CallId"));
			dataItem.setConnectionId(_ctx.stringValue("ListHotlineRecordResponse.Data["+ i +"].ConnectionId"));
			dataItem.setUrl(_ctx.stringValue("ListHotlineRecordResponse.Data["+ i +"].Url"));
			dataItem.setStartTime(_ctx.longValue("ListHotlineRecordResponse.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.longValue("ListHotlineRecordResponse.Data["+ i +"].EndTime"));

			data.add(dataItem);
		}
		listHotlineRecordResponse.setData(data);
	 
	 	return listHotlineRecordResponse;
	}
}