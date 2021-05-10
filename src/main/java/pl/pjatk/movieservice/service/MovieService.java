package pl.pjatk.movieservice.service;

import org.springframework.stereotype.Service;
import pl.pjatk.movieservice.model.Category;
import pl.pjatk.movieservice.model.Movie;

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

    public Movie addMovie(Movie movie) {
        return movie;
    }

    public Movie updateMovie(Movie movie) {
        return movie;
    }

    public boolean existMovie(Long id) {
        Movie movie = findById();

        if (movie.getId() == id) {
            return true;
        } else {
            return false;
        }
    }

    public void deleteMovie(Long id) {
        Movie movie = findById();

        if (movie.getId() == id) {
            movie = null;
        }
    }
}
