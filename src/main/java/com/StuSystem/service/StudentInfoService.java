package com.StuSystem.service;


import com.StuSystem.pojo.StudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentInfoService {

    List<StudentInfo> get(StudentInfo studentInfo);

    void update(StudentInfo studentInfo);

    int updatePsw(String stu_no,String newPsw);
}
