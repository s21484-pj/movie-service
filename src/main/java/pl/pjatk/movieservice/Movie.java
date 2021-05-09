package pl.pjatk.movieservice;

public class Movie {

    private final long id;
    private final String name;
    private final Category category;

    public Movie(long id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }
}
