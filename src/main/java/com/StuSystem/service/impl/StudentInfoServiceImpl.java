package com.StuSystem.service.impl;

import com.StuSystem.mapper.StudentInfoMapper;
import com.StuSystem.pojo.StudentInfo;
import com.StuSystem.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired(required = false)
    StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentInfo> get(StudentInfo studentInfo) {
        return studentInfoMapper.get(studentInfo);
    }

    @Override
    public void update(StudentInfo studentInfo) {
        studentInfoMapper.update(studentInfo);
    }

    @Override
    public int updatePsw(String stu_no, String newPsw) {
        return studentInfoMapper.updatePsw(stu_no,newPsw);
    }
}
