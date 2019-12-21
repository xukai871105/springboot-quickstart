package com.example;

import com.example.student.StudentDO;
import com.example.student.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {TestApplication.class})
public class StudentSQLTest {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void testCommon() {
        List<StudentDO> studentDOList = studentMapper.findAllStudents();
        for (StudentDO studentDO : studentDOList) {
            System.out.println(studentDO.toString());
        }
    }
}
