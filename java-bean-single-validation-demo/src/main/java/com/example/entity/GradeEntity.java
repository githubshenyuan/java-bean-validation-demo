package com.example.entity;

import net.sf.oval.constraint.AssertValid;
import net.sf.oval.constraint.NotNull;

import java.util.Date;
import java.util.List;

/**
 * @author sh 2018/12/16 15:59
 * @version ideaIU-2018.2.5.win
 */
public class GradeEntity {
    @NotNull(message = "uuid不能为空", profiles = {"uuid"})
    private String uuid;
    @NotNull(message = "gradeName 不能为空", profiles = {"gradeName"})
    private String gradeName;
    @NotNull(message = "createDate不能为空", profiles = {"createDate"})
    private String createDate;
    @NotNull(message = "studentEntities不能为空", profiles = {"studentEntities"})
    private  List<StudentEntity> studentEntities;
    @NotNull(message = "studentEntity 不能为空", profiles = {"studentEntity"})
    @AssertValid(profiles = {"studentEntity"})
    private StudentEntity studentEntity;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getCreatDate() {
        return createDate;
    }

    public void setCreatDate(String creatDate) {
        this.createDate = creatDate;
    }

    public List<StudentEntity> getStudentEntities() {
        return studentEntities;
    }

    public void setStudentEntities(List<StudentEntity> studentEntities) {
        this.studentEntities = studentEntities;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }
}
