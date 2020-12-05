package com.example.elsmeusprimersintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {
    public void explicitIntentWeb(View view){
        Intent explicitIntentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rottentomatoes.com"));
        startActivity(explicitIntentWeb);
    }

    public void activity4(View view){
        Intent activity4 = new Intent(this, MainActivity4.class);
        startActivity(activity4);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("ESTATS","Create_Activity_3");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTATS","Start_Activity_3");
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTATS","Resume_Activity_3");
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTATS","Pause_Activity_3");
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTATS","Stop_Activity_3");
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTATS","Destroy_Activity_3");
        // La actividad está a punto de ser destruida.
    }
}