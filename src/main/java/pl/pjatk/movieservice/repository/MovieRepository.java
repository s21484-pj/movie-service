package pl.pjatk.movieservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.movieservice.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Override
    List<Movie> findAll();

    @Override
    Optional<Movie> findById(Long aLong);

    @Override
    <S extends Movie> S save(S s);

    @Override
    boolean existsById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
