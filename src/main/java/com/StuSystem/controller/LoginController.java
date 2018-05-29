package com.StuSystem.controller;

import com.StuSystem.pojo.StudentInfo;
import com.StuSystem.pojo.StudentVolunteer;
import com.StuSystem.pojo.TeacherInfo;
import com.StuSystem.service.StudentInfoService;
import com.StuSystem.service.StudentVolunteerService;
import com.StuSystem.service.TeacherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {


    @Autowired
    StudentInfoService studentInfoService;

    @Autowired
    StudentVolunteerService studentVolunteerService;

    @Autowired
    TeacherInfoService teacherInfoService;

    //登陆
    @RequestMapping("login")
    public ModelAndView handleRequest2(HttpSession session, HttpServletRequest request) throws Exception {
        String stu_no = request.getParameter("stuNo");
        String stuPwd = request.getParameter("stuPwd");
        ModelAndView mav = new ModelAndView();
        StudentInfo studentInfo = new StudentInfo();
        TeacherInfo teacherInfo = new TeacherInfo();
        teacherInfo.setTch_no(stu_no);
        studentInfo.setStu_no(stu_no);
        List<StudentInfo> studentInfoList = studentInfoService.get(studentInfo);
        List<TeacherInfo> teacherInfoList = teacherInfoService.get(teacherInfo);
        if (!studentInfoList.isEmpty()) {
            String getpwd = studentInfoList.get(0).getStu_pwd();
            if (stuPwd.equals(getpwd)) {
                session.setAttribute("studentinfolist", studentInfoList);
                mav.setViewName("startView");
                mav.addObject("studentinfo", studentInfoList);
                return mav;
            } else {
                mav.setViewName("error");
                return mav;
            }


        }

        if (!teacherInfoList.isEmpty()) {
            String tch_pwd = teacherInfoList.get(0).getTch_pwd();
            List<StudentVolunteer> studentVolunteerList = studentVolunteerService.getall();
            if (stuPwd.equals(tch_pwd))

            {
                mav.addObject("studentvolunteer", studentVolunteerList);
                mav.setViewName("tchManager");
                return mav;
            } else {
                mav.setViewName("error");
                return mav;
            }
        }
        mav.setViewName("error");
        return mav;

    }


    //提交专业
    @RequestMapping("volunteer/{stu_no}")
    public ModelAndView handleRequest1(HttpServletRequest request,
                                       @PathVariable("stu_no") String stu_no) throws Exception {
        String course = request.getParameter("course");
        ModelAndView mav = new ModelAndView();
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStu_no(stu_no);
        List<StudentInfo> studentInfoList = studentInfoService.get(studentInfo);
        StudentVolunteer studentVolunteer = new StudentVolunteer();

        if (!studentInfoList.isEmpty()) {
            studentVolunteer.setStu_no(stu_no);
            studentVolunteer.setStu_volunteer(course);
            studentVolunteer.setSelection_result("1");
            studentInfo.setSelection_result("1");
            studentInfoService.update(studentInfo);
            studentVolunteer.setStu_name(studentInfoList.get(0).getStu_name());
            studentVolunteer.setStu_class(studentInfoList.get(0).getStu_class());
            studentVolunteerService.add(studentVolunteer);
            mav.setViewName("success");
        } else {
            mav.setViewName("failure");
        }
        return mav;
    }

    /**
     * 跳转
     */
    @RequestMapping("/fun")
    public ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("stuManger");
        return modelAndView;
    }

    /**
     * 修改密码
     * @param stu_no
     * @param newPsw
     * @return
     */
    @RequestMapping("/updatePsw")

    public ModelAndView updatePsw(HttpSession session,String stu_no,
                                         @RequestParam("newPsw") String newPsw) {
        ModelAndView mav = new ModelAndView();
        List<StudentInfo> list=( List<StudentInfo>)session.getAttribute("studentinfolist");
        if(!list.isEmpty()) {
            stu_no = list.get(0).getStu_no();
            studentInfoService.updatePsw(stu_no, newPsw);
            mav.setViewName("startView");
            mav.addObject("studentinfo",list);
        }
        return mav;
    }
}
