package spitter.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erling Molde on 21.02.2017.
 */
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }
}