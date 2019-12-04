package com.example.dogeeku.ui;

import android.content.Intent;
import android.os.Bundle;

import com.example.dogeeku.DatabaseAccess;
import com.example.dogeeku.DatabaseOpenHelper;
import com.example.dogeeku.MainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dogeeku.R;

import android.app.AppComponentFactory;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;

public class RegisterActivity extends AppCompatActivity {
    protected Cursor cursor;
    DatabaseOpenHelper dbHelper;
    Button button;
    EditText nama_lengkap, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dbHelper = new DatabaseOpenHelper(this);
        nama_lengkap = (EditText) findViewById(R.id.nama_lengkap);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        Button button_back = (Button) findViewById(R.id.button_back);
        Button button_REGISTER = (Button) findViewById(R.id.register);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(back);
            }
        });

        button_REGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();

                String namaDB = nama_lengkap.getText().toString();
                String emailDB = email.getText().toString();
                String passwordDB = password.getText().toString();
                databaseAccess.insert(namaDB, emailDB, passwordDB);

                Intent register = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(register);
            }
        });
    }

}
