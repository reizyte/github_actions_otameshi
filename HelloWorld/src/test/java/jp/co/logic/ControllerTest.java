package jp.co.logic;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import jp.co.logic.Controller;

public class ControllerTest {
    Controller controller = new Controller();

    @Test
    public void testAdd() {
        int expected = 5;
        int actual = controller.add(2,3);
        System.out.println("わん");
        assertEquals(actual, expected);
    }
}
