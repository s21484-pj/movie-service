package pl.pjatk.movieservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> findAll() {
        return List.of(new Movie(1L, "Example", Category.HORROR),
                new Movie(2L, "AnotherExample", Category.THRILLER));
    }

    public Movie findById() {
        return new Movie(3L, "FunnyFilm", Category.ACTION);
    }
}
