package concert;

import annotations.Symphonic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Erling Molde on 21.02.2017.
 */
@Component
@Symphonic
public class Concert implements Performance {
    @Override
    public void perform() {
        System.out.println("Performing concert.");
    }
}