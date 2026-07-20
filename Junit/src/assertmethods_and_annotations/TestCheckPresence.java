package assertmethods_and_annotations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import junit_with_eclipse.com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks obj = new DailyTasks();

        assertTrue(obj.checkPresence("Wipro TalentNext", "Talent"));

        assertFalse(obj.checkPresence("Wipro TalentNext", "Java"));
    }
}