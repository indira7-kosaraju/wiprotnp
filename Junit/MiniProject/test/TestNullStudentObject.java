package MiniProject.test;

import org.junit.Test;

import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

public class TestNullStudentObject {

    @Test(expected = NullStudentObjectException.class)
    public void testNullStudentObject() throws Exception {

        StudentReport report = new StudentReport();

        report.validate(null);
    }
}