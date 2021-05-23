package pl.pjatk.movieservice.service;

import org.springframework.stereotype.Service;
import pl.pjatk.movieservice.model.Movie;
import pl.pjatk.movieservice.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie findById(Long id) {
        return movieRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovieById(Long id, Movie movie) {
        if (existMovie(id)) {
            return movieRepository.save(movie);
        } else {
            throw new RuntimeException();
        }
    }

    public boolean existMovie(Long id) {
        return movieRepository.existsById(id);
    }

    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }
}
