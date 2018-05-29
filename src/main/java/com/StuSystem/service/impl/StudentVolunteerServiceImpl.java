package com.StuSystem.service.impl;

import com.StuSystem.mapper.StudentVolunteerMapper;
import com.StuSystem.pojo.StudentVolunteer;
import com.StuSystem.service.StudentVolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentVolunteerServiceImpl implements StudentVolunteerService {

    @Autowired
    StudentVolunteerMapper studentVolunteerMapper;

    @Override
    public void add(StudentVolunteer studentVolunteer) {
       studentVolunteerMapper.add(studentVolunteer);
    }

    @Override
    public List<StudentVolunteer> getall() {
        return studentVolunteerMapper.getall();
    }
}
