package com.example;

import com.example.student.StudentDO;
import com.example.student.StudentMapper;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {TestApplication.class})
public class StudentSQLTest {

    private static Logger log = LoggerFactory.getLogger(StudentSQLTest.class);

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void testCommon() {
        List<StudentDO> studentDOList = studentMapper.findAllStudents();
        for (StudentDO studentDO : studentDOList) {
            System.out.println(studentDO.toString());
        }
    }

    @Test
    public void testBirthdayRange() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, 0,1);
        Date from = calendar.getTime();
        Date end = DateUtils.addYears(from, 1);

        String fromDateString = DateFormatUtils.format(from, "yyyy-MM-dd");
        String endDateString = DateFormatUtils.format(end, "yyyy-MM-dd");

        log.info("from {} to {}", fromDateString, endDateString);

        List<StudentDO> studentDOList = studentMapper.findStudentsByBirthdayRange(from, end);
        for (StudentDO studentDO : studentDOList) {
            System.out.println(studentDO.toString());
        }
    }
}
