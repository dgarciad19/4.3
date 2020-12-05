package com.example.elsmeusprimersintents;


import android.annotation.SuppressLint;
import android.content.Context;
import androidx.room.Room;
import java.util.List;

public class PeliculaLab {
    @SuppressLint("StaticFieldLeak")
    private static PeliculaLab sPeliculaLab;

    private PeliculaDao mPeliculaDao;

    private PeliculaLab(Context context) {
        Context appContext = context.getApplicationContext();
        PeliculaDatabase database = Room.databaseBuilder(appContext, PeliculaDatabase.class, "Peliculas")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries().build();
        mPeliculaDao = database.getPeliculaDao();
    }

    public static PeliculaLab get(Context context) {
        if (sPeliculaLab == null) {
            sPeliculaLab = new PeliculaLab(context);
        }
        return sPeliculaLab;
    }

    public List<Pelicula> getPeliculas() {
        return mPeliculaDao.getAll();
    }

    public void deletePeliculas() {
        mPeliculaDao.deleteAll();
    }

    public void addPelicula(Pelicula pelicula) {
        mPeliculaDao.insert(pelicula);
    }

    public void updatePelicula(Pelicula pelicula) { mPeliculaDao.update(pelicula); }

    public void deletePelicula(Pelicula pelicula) { mPeliculaDao.delete(pelicula); }
}