package com.example.elsmeusprimersintents;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PeliculaDao {
    @Query("SELECT * FROM pelicula")
    List<Pelicula> getAll();

    @Query("DELETE FROM pelicula")
    void deleteAll();

    @Insert
    void insert(Pelicula pelicula);

    @Delete
    void delete(Pelicula pelicula);

    @Update
    void update(Pelicula pelicula);
}
