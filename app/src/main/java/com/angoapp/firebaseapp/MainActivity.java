package com.angoapp.firebaseapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference userReference = databaseReference.child("Usuario");
    private DatabaseReference produtoReference = databaseReference.child("Produto").child("001");

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        firebaseAuth.createUserWithEmailAndPassword("dollar2@gmail.com", "654321").addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                    Toast.makeText(MainActivity.this, "User registered", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Regitration failed", Toast.LENGTH_SHORT).show();
            }
        });

//        Usuario usuario = new Usuario("Mauricio", "Ambrosio", "Masculino", 23);
//        userReference.child("006").setValue(usuario);


//        firebaseAuth.signInWithEmailAndPassword("mau@gmail.com", "654321").addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful())
//                    Toast.makeText(MainActivity.this, "Logged in", Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
//            }
//        });



//
//
//        Usuario usuario = new Usuario("Mateus", "Jose", "Masculino", 25);
//        userReference.child("004").setValue(usuario);

        /*
        Produto produto = new Produto("iPhone", "Gold", "Apple");
        Produto produto2 = new Produto("Nexus 5", "Black", "Google");

        databaseReference.child("Produto").child("001").setValue(produto);
        databaseReference.child("Produto").child("002").setValue(produto2);
*/

//        userReference.child("001").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                Log.i("FIREBASE", dataSnapshot.getValue().toString());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
    }
}
