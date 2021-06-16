package pl.pjatk.movieservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.movieservice.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
