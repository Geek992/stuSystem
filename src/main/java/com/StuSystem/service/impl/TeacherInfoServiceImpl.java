package com.StuSystem.service.impl;

import com.StuSystem.mapper.TeacherInfoMapper;
import com.StuSystem.pojo.TeacherInfo;
import com.StuSystem.service.TeacherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherInfoServiceImpl implements TeacherInfoService {

    @Autowired
    TeacherInfoMapper teacherInfoMapper;

    @Override
    public List<TeacherInfo> get(TeacherInfo teacherInfo) {
        return teacherInfoMapper.get(teacherInfo);
    }
}
