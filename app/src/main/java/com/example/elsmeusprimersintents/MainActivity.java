package com.example.elsmeusprimersintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void profile(View view){
         Intent activity2 = new Intent(this, MainActivity2.class);
         startActivity(activity2);
    }

    public void myRates(View view){
        Intent activity3 = new Intent(this, MainActivity3.class);
        startActivity(activity3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("ESTATS","Create_Activity_1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTATS","Start_Activity_1");
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTATS","Resume_Activity_1");
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTATS","Pause_Activity_1");
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTATS","Stop_Activity_1");
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTATS","Destroy_Activity_1");
        // La actividad está a punto de ser destruida.
    }

}