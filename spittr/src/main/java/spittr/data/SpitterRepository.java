package spittr.data;

import spittr.Spitter;

/**
 * Created by Erling Molde on 23.02.2017.
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}