package MiniProject.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TestGradeD {

    @Test
    public void testGradeD() {

        Student s = new Student("John", new int[] {40, 50, 45});

        StudentReport report = new StudentReport();

        assertEquals("C", report.findGrades(s));
    }
}