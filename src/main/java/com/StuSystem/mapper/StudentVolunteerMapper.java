package com.StuSystem.mapper;

import com.StuSystem.pojo.StudentVolunteer;

import java.util.List;

public interface StudentVolunteerMapper {
   void add(StudentVolunteer studentVolunteer);
   List<StudentVolunteer> getall();

}
