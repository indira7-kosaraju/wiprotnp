package MiniProject.test;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.service.StudentReport;

public class TestNullMarksArray {

    @Test(expected = NullMarksArrayException.class)
    public void testNullMarksArray() throws Exception {

        Student s = new Student("John", null);

        StudentReport report = new StudentReport();

        report.validate(s);
    }
}