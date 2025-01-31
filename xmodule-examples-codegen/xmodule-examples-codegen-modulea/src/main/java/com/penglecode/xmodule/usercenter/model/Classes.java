package com.penglecode.xmodule.usercenter.model;

import com.penglecode.xmodule.common.codegen.Id;
import com.penglecode.xmodule.common.codegen.Model;
import com.penglecode.xmodule.common.support.BaseModel;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 班级
 * 
 * @author Customized-Mybatis-Generator
 * @date	2021年01月10日 下午 22:33:11
 */
@Model(name="班级信息", alias="Classes")
public class Classes implements BaseModel<Classes> {
     
    private static final long serialVersionUID = 1L;

    /** id */
    @Id
    private Long id;

    /** 年级uuid */
    private String gradeUuid;

    /** uuid */
    private String uuid;

    /** 名称 */
    private String name;

    /** 状态 : 0:无效
1:有效 */
    private Integer status;

    /** 创建时间 */
    private String createdTime;

    /** 更新时间 */
    private String modifiedTime;

    /** 对应海康班级ID */
    private String hikclassid;

    /** 对应云痕班级名称 */
    private String yhclassname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGradeUuid() {
        return gradeUuid;
    }

    public void setGradeUuid(String gradeUuid) {
        this.gradeUuid = gradeUuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getHikclassid() {
        return hikclassid;
    }

    public void setHikclassid(String hikclassid) {
        this.hikclassid = hikclassid;
    }

    public String getYhclassname() {
        return yhclassname;
    }

    public void setYhclassname(String yhclassname) {
        this.yhclassname = yhclassname;
    }

    public MapBuilder mapBuilder() {
        return new MapBuilder();
    }

    /**
     * Auto generated by Mybatis Generator
     */
    public class MapBuilder {
         
        private final Map<String, Object> modelProperties = new LinkedHashMap<>();

        MapBuilder() {
            super();
        }

        public MapBuilder withId(Long ... id) {
            modelProperties.put("id", BaseModel.first(id, getId()));
            return this;
        }

        public MapBuilder withGradeUuid(String ... gradeUuid) {
            modelProperties.put("gradeUuid", BaseModel.first(gradeUuid, getGradeUuid()));
            return this;
        }

        public MapBuilder withUuid(String ... uuid) {
            modelProperties.put("uuid", BaseModel.first(uuid, getUuid()));
            return this;
        }

        public MapBuilder withName(String ... name) {
            modelProperties.put("name", BaseModel.first(name, getName()));
            return this;
        }

        public MapBuilder withStatus(Integer ... status) {
            modelProperties.put("status", BaseModel.first(status, getStatus()));
            return this;
        }

        public MapBuilder withCreatedTime(String ... createdTime) {
            modelProperties.put("createdTime", BaseModel.first(createdTime, getCreatedTime()));
            return this;
        }

        public MapBuilder withModifiedTime(String ... modifiedTime) {
            modelProperties.put("modifiedTime", BaseModel.first(modifiedTime, getModifiedTime()));
            return this;
        }

        public MapBuilder withHikclassid(String ... hikclassid) {
            modelProperties.put("hikclassid", BaseModel.first(hikclassid, getHikclassid()));
            return this;
        }

        public MapBuilder withYhclassname(String ... yhclassname) {
            modelProperties.put("yhclassname", BaseModel.first(yhclassname, getYhclassname()));
            return this;
        }

        public Map<String, Object> build() {
            return modelProperties;
        }
    }
}