import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.manager.Films;
import ru.netology.manager.PosterManager;
import ru.netology.repository.PosterRepository;
import static org.mockito.Mockito.*;

public class FilmsTestWithMock {
    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager films = new PosterManager(repo);

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
    public void showAllFilms(){
        Films[] movies = {film1, film2, film3};
        doReturn(movies).when(repo).findAll();

        Films[] expected = movies;
        Films[] actual = films.showAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
