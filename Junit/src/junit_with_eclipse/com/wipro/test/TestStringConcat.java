package junit_with_eclipse.com.wipro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit_with_eclipse.com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {

        DailyTasks obj = new DailyTasks();

        String actual = obj.doStringConcat("Hello", "World");

        assertEquals("Hello World", actual);
    }
}