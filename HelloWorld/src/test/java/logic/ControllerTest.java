package test.java.logic;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.logic.Controller;

public class ControllerTest {
    Controller controller = new Controller();

    @Test
    public void testAdd() {
        int expected = 5;
        int actual = controller.add(2,3);
        assertEquals(actual, expected);
    }
}
