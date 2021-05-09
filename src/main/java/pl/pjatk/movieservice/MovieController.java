package pl.pjatk.movieservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Movie>> getMovies() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Movie> getMovieByID(@PathVariable long id) {
        if (movieService.findById().getId() == id) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
