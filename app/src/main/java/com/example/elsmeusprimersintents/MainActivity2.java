package com.example.elsmeusprimersintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    EditText etUserName, etEmail, etNom, etCognom, etBiografia;
    CheckBox chConfirmar;
    Spinner sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("ESTATS","Create_Activity_2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sp = (Spinner) findViewById(R.id.spinner);
        chConfirmar = (CheckBox) findViewById(R.id.chConfirmar);
        etUserName =(EditText) findViewById(R.id.etUserName);
        etEmail =(EditText) findViewById(R.id.etEmail);
        etNom =(EditText) findViewById(R.id.etNom);
        etCognom =(EditText) findViewById(R.id.etCognom);
        etBiografia =(EditText) findViewById(R.id.etBiografia);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        etUserName.setText(preferences.getString("userName",""));
        etEmail.setText(preferences.getString("Email",""));
        etNom.setText(preferences.getString("Nom",""));
        etCognom.setText(preferences.getString("Cognom",""));
        etBiografia.setText(preferences.getString("Biografia",""));
        String[] generes = {preferences.getString("Genere","Gènere"),"Masculí", "Femení"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generes);
        sp.setAdapter(adapter);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTATS","Start_Activity_2");
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTATS","Resume_Activity_2");
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTATS","Pause_Activity_2");
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        if(chConfirmar.isChecked()){
            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor Obj_editor = preferencias.edit();
            Obj_editor.putString("userName",etUserName.getText().toString());
            Obj_editor.putString("Email",etEmail.getText().toString());
            Obj_editor.putString("Nom",etNom.getText().toString());
            Obj_editor.putString("Cognom",etCognom.getText().toString());
            Obj_editor.putString("Biografia",etBiografia.getText().toString());
            Obj_editor.putString("Genere",sp.getSelectedItem().toString());
            Obj_editor.commit();

        }
        Log.d("ESTATS","Stop_Activity_2");
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTATS","Destroy_Activity_2");
        // La actividad está a punto de ser destruida.
    }
}