package concert;

import org.springframework.stereotype.Component;

/**
 * Created by Erling Molde on 21.02.2017.
 */
@Component
public class Concert implements Performance {
    @Override
    public void perform() {
        System.out.println("Performing concert.");
    }
}