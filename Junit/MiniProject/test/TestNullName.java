package MiniProject.test;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullNameException;
import com.mile1.service.StudentReport;

public class TestNullName {

    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {

        Student s = new Student(null, new int[] {50, 60, 70});

        StudentReport report = new StudentReport();

        report.validate(s);
    }
}