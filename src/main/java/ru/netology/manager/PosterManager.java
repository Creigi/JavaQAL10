package ru.netology.manager;

import ru.netology.repository.PosterRepository;

public class PosterManager {
    private PosterRepository repo;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }
    public void addFilm(Films film) {
        repo.save(film);
    }

    public Films[] showAll() {
        return repo.findAll();
    }


    public Films[] findLast() {
        Films[] lastFilm;
        Films[] all = repo.findAll();

        if (all.length <= 10) {
            lastFilm = new Films[all.length];
            for (int i = 0; i < all.length; i++) {
                lastFilm[i] = all[all.length - i - 1];
            }
        } else {
            lastFilm = new Films[10];
            for (int i = 0; i < 10; i++) {
                lastFilm[i] = all[all.length - i - 1];
            }
        }
        return lastFilm;
    }

    public Films[] findLast(int resultLength) {
        Films[] lastFilm;
        Films[] all = repo.findAll();

        if (all.length <= resultLength) {
            lastFilm = new Films[all.length];
            for (int i = 0; i < all.length; i++) {
                lastFilm[i] = all[all.length - i - 1];
            }
        } else {
            lastFilm = new Films[resultLength];
            for (int i = 0; i < resultLength; i++) {
                lastFilm[i] = all[all.length - i - 1];
            }
        }
        return lastFilm;
    }
}
