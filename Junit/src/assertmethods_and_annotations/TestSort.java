package assertmethods_and_annotations;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import junit_with_eclipse.com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {

        DailyTasks obj = new DailyTasks();

        int[] input = {5, 2, 4, 1, 3};
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, obj.sortValues(input));
    }
}