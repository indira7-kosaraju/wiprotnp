package MiniProject.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class TestFindNumberOfNullMarks {

    @Test
    public void testFindNumberOfNullMarks() {

        Student[] s = new Student[3];

        s[0] = new Student("A", null);
        s[1] = new Student("B", new int[] {50});
        s[2] = new Student("C", null);

        StudentService service = new StudentService();

        assertEquals(2, service.findNumberOfNullMarksArray(s));
    }
}