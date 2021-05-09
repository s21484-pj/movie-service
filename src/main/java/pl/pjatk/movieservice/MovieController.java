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

    @GetMapping("/list")
    public ResponseEntity<List<Movie>> getMovies() {
        return ResponseEntity.ok(List.of(new Movie(1, "Example", Category.HORROR),
                new Movie(2, "AnotherExample", Category.THRILLER)));
    }


}
