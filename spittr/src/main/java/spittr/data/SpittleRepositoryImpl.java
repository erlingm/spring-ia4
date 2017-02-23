package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Erling Molde on 22.02.2017.
 */
@Repository
public class SpittleRepositoryImpl implements SpittleRepository {

    private List<Spittle> spittles;

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        if (spittles == null)
            spittles = IntStream.rangeClosed(1, count).mapToObj(i -> new Spittle("Spittle " + i, new Date())).collect(Collectors.toList());
        else if (spittles.size() < count)
            IntStream.rangeClosed(spittles.size() + 1, count).forEach(i -> spittles.add(new Spittle("Spittle " + i, new Date())));
        else if (count < spittles.size())
            return new ArrayList<>(spittles.subList(0, count));
        return spittles;
    }

    @Override
    public Spittle findOne(long spittleId) {
        if (spittles == null)
            return null;
        return spittles.stream()
                .filter(s -> s.getId() != null && s.getId() == spittleId)
                .findFirst()
                .orElse(spittles.stream()
                        .findFirst()
                        .orElse(null));
    }
}
