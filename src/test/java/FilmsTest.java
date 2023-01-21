import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;
import ru.netology.manager.Films;
import ru.netology.manager.PosterManager;

public class FilmsTest {

    Films film1 = new Films(1, "111", 2000);
    Films film2 = new Films(2, "222", 2001);
    Films film3 = new Films(3, "333", 2002);
    Films film4 = new Films(4, "444", 2003);
    Films film5 = new Films(5, "555", 2004);
    Films film6 = new Films(6, "666", 2005);
    Films film7 = new Films(7, "777", 2006);
    Films film8 = new Films(8, "888", 2007);
    Films film9 = new Films(9, "999", 2008);
    Films film10 = new Films(10, "000", 2007);
    Films film11 = new Films(11, "131", 2008);
    Films film12 = new Films(12, "213", 2007);
    Films film13 = new Films(13, "446", 2008);


    @Test
    public void showAllAddedFilms() {
        PosterManager film = new PosterManager();

        film.addFilm(film1);
        film.addFilm(film2);
        film.addFilm(film3);
        film.addFilm(film4);
        film.addFilm(film5);
        film.addFilm(film6);
        film.addFilm(film7);
        film.addFilm(film8);
        film.addFilm(film9);
        film.addFilm(film10);
        film.addFilm(film11);
        film.addFilm(film12);
        film.addFilm(film13);

        Films[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12, film13};
        Films[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedFilmsDefault() {
        PosterManager film = new PosterManager();

        film.addFilm(film1);
        film.addFilm(film2);
        film.addFilm(film3);
        film.addFilm(film4);
        film.addFilm(film5);
        film.addFilm(film6);
        film.addFilm(film7);
        film.addFilm(film8);
        film.addFilm(film9);
        film.addFilm(film10);
        film.addFilm(film11);
        film.addFilm(film12);
        film.addFilm(film13);

        Films[] expected = {film13, film12, film11, film10, film9, film8, film7, film6, film5, film4};
        Films[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedFilmsDefaultFew() {
        PosterManager film = new PosterManager();

        film.addFilm(film11);
        film.addFilm(film12);
        film.addFilm(film13);

        Films[] expected = {film13, film12, film11};
        Films[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedFilmsParameters() {
        PosterManager film = new PosterManager(4);

        film.addFilm(film1);
        film.addFilm(film2);
        film.addFilm(film3);
        film.addFilm(film4);
        film.addFilm(film5);
        film.addFilm(film6);
        film.addFilm(film7);
        film.addFilm(film8);
        film.addFilm(film9);
        film.addFilm(film10);
        film.addFilm(film11);
        film.addFilm(film12);
        film.addFilm(film13);

        Films[] expected = {film13, film12, film11, film10};
        Films[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedFilmsParametersFew() {
        PosterManager film = new PosterManager(4);

        film.addFilm(film1);
        film.addFilm(film2);
        film.addFilm(film3);


        Films[] expected = {film3, film2, film1};
        Films[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedFilmsParametersEmpty() {
        PosterManager film = new PosterManager(4);

        Films[] expected = new Films[0];
        Films[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedFilmsDefaultEmpty() {
        PosterManager film = new PosterManager();

        Films[] expected = new Films[0];
        Films[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
