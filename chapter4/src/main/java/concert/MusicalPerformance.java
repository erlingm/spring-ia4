package concert;

/**
 * Created by Erling Molde on 21.02.2017.
 */
public class MusicalPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("Performing guitar solo.");
    }
}