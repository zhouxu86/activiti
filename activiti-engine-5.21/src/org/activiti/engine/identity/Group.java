/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.engine.identity;

import java.io.Serializable;

import org.activiti.engine.IdentityService;


/**
 * Represents a group, used in {@link IdentityService}.
 * 
 * @author Tom Baeyens
 */
public interface Group extends Serializable {

  String getId();
  void setId(String id);
  
  String getName();
  void setName(String name);
  
  String getType();
  void setType(String string);
  
   String getCode();

   void setCode(String code);

  public Integer getOrgId();

  public void setOrgId(Integer orgId);

  public String getBusinessType();

  public void setBusinessType(String businessType);
  

  public String getBusinessCode();

  public void setBusinessCode(String businessCode);
}
