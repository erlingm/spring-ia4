package concert;

import annotations.Guitar;
import org.springframework.stereotype.Component;

/**
 * Created by Erling Molde on 21.02.2017.
 */
@Component
@Guitar
public class GuitarSolo implements Performance {
    @Override
    public void perform() {
        System.out.println("Playing guitar solo.");
    }
}