/*
 *  Copyright 2008 bbossgroups
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.frameworkset.web.token.ws;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * <p>Title: CheckTokenService.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2008</p>
 * @Date 2014年4月16日
 * @author biaoping.yin
 * @version 3.8.0
 */
@WebService(name="CheckTokenService",targetNamespace="org.frameworkset.web.token.ws.CheckTokenService")
public interface CheckTokenService {
	public  @WebResult(name = "tokenResult", partName = "partTokenResult") TokenCheckResponse checkToken(@WebParam(name = "appid", partName = "partAppid") String appid,
			@WebParam(name = "secret", partName = "partSecret") String secret,@WebParam(name = "token", partName = "partToken") String token);
	
	public  @WebResult(name = "tokenResult", partName = "partTokenResult") TokenCheckResponse checkTicket(@WebParam(name = "appid", partName = "partAppid") String appid,
			@WebParam(name = "secret", partName = "partSecret") String secret,@WebParam(name = "ticket", partName = "partTicket") String ticket);
	public @WebResult(name = "tokenResult", partName = "partTokenResult") TokenCheckResponse checkTempToken(@WebParam(name = "token", partName = "partToken") String token);
	
	

}
