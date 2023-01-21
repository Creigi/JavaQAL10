package ru.netology.manager;

public class PosterManager {
    private int resultLength;

    public PosterManager() {
        resultLength = 10;
    }

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }

    private Films[] films = new Films[0];

    public void addFilm(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        Films[] lastFilm;

        if (films.length <= resultLength) {
            lastFilm = new Films[films.length];
            for (int i = 0; i < films.length; i++) {
                lastFilm[i] = films[films.length - i - 1];
            }
        } else {
            lastFilm = new Films[resultLength];
            for (int i = 0; i < resultLength; i++) {
                lastFilm[i] = films[films.length - i - 1];
            }
        }
        return lastFilm;
    }
}
