package MiniProject.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TestGradeF {

    @Test
    public void testGradeF() {

        Student s = new Student("John", new int[] {90, 20, 80});

        StudentReport report = new StudentReport();

        assertEquals("F", report.findGrades(s));
    }
}