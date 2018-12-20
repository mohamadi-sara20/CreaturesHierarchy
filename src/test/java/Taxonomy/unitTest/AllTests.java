package unitTest;

import Taxonomy.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestClone.class, TestEquals.class, TestHash.class})

public class AllTests {

}
