package com.example.elsmeusprimersintents;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Pelicula.class}, version = 2)
public abstract class PeliculaDatabase extends RoomDatabase {
    public abstract PeliculaDao getPeliculaDao();
}