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
package org.activiti.engine.impl.persistence.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.identity.Group;
import org.activiti.engine.impl.db.PersistentObject;


/**
 * @author Tom Baeyens
 * @author ZHOUXU
 */
public class GroupEntity implements Group, Serializable, PersistentObject {

  private static final long serialVersionUID = 1L;

  protected String id;
  protected int revision;
  protected String name;
  protected String type;
  //20160919 ZHOUXU
  //组编号
  protected String code;
//对应组织机构ID
  protected Integer orgId;
  //业务类型
  protected String businessType;
  //业务编码
  protected String businessCode;
  
  public String getCode() {
    return code;
}

public void setCode(String code) {
    this.code = code;
}

public Integer getOrgId() {
    return orgId;
}

public void setOrgId(Integer orgId) {
    this.orgId = orgId;
}

public String getBusinessType() {
    return businessType;
}

public void setBusinessType(String businessType) {
    this.businessType = businessType;
}

public String getBusinessCode() {
    return businessCode;
}

public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
}
  
  public GroupEntity() {
  }
  
  public GroupEntity(String id) {
    this.id = id;
  }
  
  public void update(GroupEntity group) {
    this.name = group.getName();
    this.type = group.getType();
  }
  
  public Object getPersistentState() {
    Map<String, Object> persistentState = new HashMap<String, Object>();
    persistentState.put("name", name);
    persistentState.put("type", type);
    persistentState.put("code", code);
    persistentState.put("businessType", businessType);
    persistentState.put("businessCode", businessCode);
    persistentState.put("orgId", orgId);
    return persistentState;
  }
  
  public int getRevisionNext() {
    return revision+1;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public int getRevision() {
    return revision;
  }
  public void setRevision(int revision) {
    this.revision = revision;
  }
}
