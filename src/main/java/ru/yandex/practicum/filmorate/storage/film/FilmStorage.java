package ru.yandex.practicum.filmorate.storage.film;

import ru.yandex.practicum.filmorate.model.Film;

import java.util.Collection;
import java.util.Optional;

public interface FilmStorage {
    void addFilm(Film film);

    void deleteFilm(long id);

    Collection<Film> findAllFilms();

    Optional<Film> getFilm(long id);
}
