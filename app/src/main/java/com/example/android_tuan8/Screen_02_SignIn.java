package com.example.android_tuan8;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Screen_02_SignIn extends AppCompatActivity {
    private FirebaseAuth fAuth;
//pass canh cut con
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen02);

        EditText email = findViewById(R.id.edEmail);
        EditText pass = findViewById(R.id.edPass);


        fAuth = FirebaseAuth.getInstance();

        Button btnLogin = findViewById(R.id.btnSingIn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = email.getText().toString().trim();
                String passwordFeild = pass.getText().toString().trim();
                Toast.makeText(Screen_02_SignIn.this, "Hello", Toast.LENGTH_SHORT).show();
                fAuth.signInWithEmailAndPassword(Email, passwordFeild).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            Toast.makeText(Screen_02_SignIn.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Screen_02_SignIn.this, Screen_04_Action.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(Screen_02_SignIn.this, "Error !!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
