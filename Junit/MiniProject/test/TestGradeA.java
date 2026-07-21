package MiniProject.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TestGradeA {

    @Test
    public void testGradeA() {

        Student s = new Student("John", new int[] {80, 85, 90});

        StudentReport report = new StudentReport();

        assertEquals("A+", report.findGrades(s));
    }
}