package com.example.android_tuan8;

import android.content.Intent;
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

public class Screen_03_Register extends AppCompatActivity {
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen03);

        fAuth = FirebaseAuth.getInstance();

        Button btn_register = findViewById(R.id.btnRes);
        EditText edtName = findViewById(R.id.edName);
        EditText edtEmail = findViewById(R.id.edMailRes);
        EditText edtPass = findViewById(R.id.edPassRes);
        EditText edtRePass = findViewById(R.id.edPassRepeatRes);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString().trim();
                String email = edtEmail.getText().toString().trim();
                String pass = edtPass.getText().toString().trim();
                String rePass = edtRePass.getText().toString().trim();

                if(pass.equals(rePass)) {
                    Toast.makeText(Screen_03_Register.this, "SOS", Toast.LENGTH_SHORT).show();

                    fAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()) {
                                Toast.makeText(Screen_03_Register.this, "create success" , Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Screen_03_Register.this, Screen_02_SignIn.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(Screen_03_Register.this, "create Fail" , Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                } else {
                    Toast.makeText(Screen_03_Register.this, "Pass không giống nhau", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
