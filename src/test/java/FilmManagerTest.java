import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    Film film1 = new Film("Бладшот");
    Film film2 = new Film("Вперед");
    Film film3 = new Film("Отель Белград");
    Film film4 = new Film("Джентльмены");
    Film film5 = new Film("Человек-невидимка");
    Film film6 = new Film("Тролли. Мировой тур");
    Film film7 = new Film("Номер один");


    @Test
    public void shouldAddFilm() {
        FilmManager filmManager = new FilmManager();

        filmManager.addFilm(film1);
        filmManager.addFilm(film2);
        filmManager.addFilm(film3);

        Film[] expected = {film1, film2, film3};
        Film[] actual = filmManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilm() {
        FilmManager filmManager = new FilmManager();

        filmManager.addFilm(film1);
        filmManager.addFilm(film2);
        filmManager.addFilm(film3);
        filmManager.addFilm(film4);
        filmManager.addFilm(film5);
        filmManager.addFilm(film6);
        filmManager.addFilm(film7);

        Film[] expected = {film7, film6, film5, film4, film3};
        Film[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilm2() {
        FilmManager filmManager = new FilmManager();

        filmManager.addFilm(film1);
        filmManager.addFilm(film2);


        Film[] expected = {film2, film1};
        Film[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilm2Of7() {
        FilmManager filmManager = new FilmManager(3);

        filmManager.addFilm(film1);
        filmManager.addFilm(film2);
        filmManager.addFilm(film3);
        filmManager.addFilm(film4);
        filmManager.addFilm(film5);
        filmManager.addFilm(film6);
        filmManager.addFilm(film7);


        Film[] expected = {film7, film6, film5};
        Film[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
