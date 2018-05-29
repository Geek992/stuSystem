package com.StuSystem.mapper;

import com.StuSystem.pojo.TeacherInfo;

import java.util.List;

public interface TeacherInfoMapper {
    List<TeacherInfo> get(TeacherInfo teacherInfo);
}
