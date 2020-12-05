package com.example.elsmeusprimersintents;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pelicula {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "titol")
    public String titol;

    @ColumnInfo(name = "director")
    public String director;

    @ColumnInfo(name = "any")
    public int any;

    Pelicula(){

    }

    Pelicula(int uid, String titol, String director, int any){
        this.id= uid;
        this.titol= titol;
        this.director = director;
        this.any= any;
    }

    Pelicula(String titol, String director, int any){
        this.titol= titol;
        this.director = director;
        this.any= any;
    }

    public int getId() {
        return id;
    }

    public void setId(int uid) {
        this.id = uid;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}