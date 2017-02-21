package concert;

import annotations.Guitar;
import annotations.Symphonic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Erling Molde on 21.02.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {
    @Autowired
    @Symphonic
    Performance concert;

    @Autowired
    @Guitar
    Performance guitarSolo;

    @Test
    public void performConcert() throws Exception {
        concert.perform();
    }

    @Test
    public void performGuitarSolo() throws Exception {
        guitarSolo.perform();
    }
}