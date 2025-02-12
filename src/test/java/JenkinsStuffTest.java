import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsStuffTest {

    @Test
    void printStuff() {
        JenkinsStuff jenkinsStuff = new JenkinsStuff();
        assertEquals("Stuff", jenkinsStuff.printStuff());
    }
}