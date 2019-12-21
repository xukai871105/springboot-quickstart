package com.example.student;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    /**
     * 查找所有的学生
     * @return
     */
    List<StudentDO> findAllStudents();
}
