package com.example.fujimiya.farmmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    Firebase ref;
    EditText FUser_txt,FPassword_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Firebase.setAndroidContext(this);
        FUser_txt = (EditText) findViewById(R.id.FUser);
        FPassword_txt = (EditText) findViewById(R.id.FPassword);
    }

    public void login(View view) {
       // Toast.makeText(getApplicationContext(),"Anda berhasil login "+FPassword_txt.getText(),Toast.LENGTH_LONG).show();
        Intent i = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(i);
        /*
        ref = new Firebase("https://farmart-8d3e5.firebaseio.com/login");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot child : dataSnapshot.getChildren()){

                    String nama = (String) child.child("nama").getValue();
                    String password = (String) child.child("password").getValue();



                    if (child.child("nama").getValue().toString().equals(FUser_txt.getText().toString()) && child.child("password").getValue().toString().equals(FPassword_txt.getText().toString()) ){
                        //Toast.makeText(getApplicationContext(),"Anda berhasil login "+nama,Toast.LENGTH_LONG).show();

                    }

                    //Toast.makeText(getApplicationContext(),"Anda berhasil login "+password,Toast.LENGTH_LONG).show();

                }


            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });*/

        //Toast.makeText(getApplicationContext(),"Ditekan",Toast.LENGTH_LONG).show();

    }
}
