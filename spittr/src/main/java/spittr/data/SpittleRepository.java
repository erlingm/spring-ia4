package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by Erling Molde on 21.02.2017.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}