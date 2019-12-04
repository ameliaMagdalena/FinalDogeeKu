package com.example.dogeeku.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dogeeku.DatabaseAccess;
import com.example.dogeeku.MainActivity;
import com.example.dogeeku.R;

import java.util.List;

public class ShopActivity extends AppCompatActivity {
    private ListView listView;
    private ListView listView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        Button button_back = (Button) findViewById(R.id.button_back);


        this.listView = (ListView) findViewById(R.id.list_nama);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        List<String> nama_barang = databaseAccess.getNama_Barang();
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nama_barang);
        this.listView.setAdapter(adapter1);

        this.listView2 = (ListView) findViewById(R.id.list_harga);
        List<String> harga_barang = databaseAccess.getHarga_Barang();
        databaseAccess.close();

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, harga_barang);
        this.listView2.setAdapter(adapter2);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(back);
            }
        });

    }
}

