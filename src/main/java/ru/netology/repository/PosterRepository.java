package ru.netology.repository;

import ru.netology.manager.Films;

public class PosterRepository {

    Films[] films = new Films[0];

    public void save(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] findById(int id) {
        Films[] oneFilm = new Films[1];
        int index = 1;
        int find = -1;
        for (Films film : films) {
            if (film.getId() != id) {
                index++;
            } else {
                find = index;
            }
        }
        if (find == -1) {
            return null;
        } else {
            oneFilm[0] = films[find - 1];
            return oneFilm;
        }
    }

    public Films[] findAll() {
        return films;
    }

    public void removeById(int id) {
        Films[] tmp = new Films[films.length - 1];
        int copyToIndex = 0;
        for (Films film : films) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        films = new Films[0];
    }
}
