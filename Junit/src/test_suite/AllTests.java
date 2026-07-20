package test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit_with_eclipse.com.wipro.test.TestStringConcat;
import assertmethods_and_annotations.TestSort;
import assertmethods_and_annotations.TestCheckPresence;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})
public class AllTests {

}