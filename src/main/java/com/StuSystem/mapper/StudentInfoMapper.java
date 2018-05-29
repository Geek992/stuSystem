package com.StuSystem.mapper;


import com.StuSystem.pojo.StudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentInfoMapper {

   List<StudentInfo> get(StudentInfo studentInfo);
   void update(StudentInfo studentInfo);

   int updatePsw(@Param("stu_no")String stu_no, @Param("newPsw")String newPsw);

}
