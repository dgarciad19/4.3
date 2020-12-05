package com.example.elsmeusprimersintents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    EditText titol, director, date;
    RatingBar ratingBar;
    private PeliculaLab mPeliculaLab;

    public void send(View view){
        Pelicula p= new Pelicula(titol.getText().toString(),director.getText().toString(),Integer.valueOf(date.getText().toString()));
        mPeliculaLab.addPelicula(p);

        List<Pelicula> pelis= mPeliculaLab.getPeliculas();
        for (Pelicula pop:pelis){
            System.out.println("ID:\t"+ pop.id);
            System.out.println("Nombre:\t"+ pop.titol);
            System.out.println("Director:\t"+ pop.director);
            System.out.println("Any:\t"+ pop.any);

            Intent activity3 = new Intent(this, MainActivity3.class);
            startActivity(activity3);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("ESTATS","Create_Activity_4");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mPeliculaLab = PeliculaLab.get(this);
        ratingBar =(RatingBar) findViewById(R.id.rb);
        titol =(EditText) findViewById(R.id.ptTitol);
        director =(EditText) findViewById(R.id.ptDirector);
        date =(EditText) findViewById(R.id.ptDate);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTATS","Start_Activity_4");
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTATS","Resume_Activity_4");
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTATS","Pause_Activity_4");
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTATS","Stop_Activity_4");
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTATS","Destroy_Activity_4");
        // La actividad está a punto de ser destruida.
    }
}