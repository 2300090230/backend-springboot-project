package com.klef.service;

import com.klef.model.Student;

public interface StudentService 
{
   public Student checkStudentLogin(String email,String pwd);
}
