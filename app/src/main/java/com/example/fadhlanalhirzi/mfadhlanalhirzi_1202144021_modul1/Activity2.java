package com.example.fadhlanalhirzi.mfadhlanalhirzi_1202144021_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by User on 04/02/2018.
 */

public class Activity2 extends AppCompatActivity {
        TextView namaMakanan, porsi, namaRestoran, totalHarga;

        @Override
        protected void onCreate (Bundle savedInstanceStats) {
            super.onCreate(savedInstanceStats);
            setContentView(R.layout.eatbus);
            namaMakanan = (TextView) findViewById(R.id.nasiud);
            porsi = (TextView) findViewById(R.id.porsi1);
            totalHarga = (TextView) findViewById(R.id.harga1);
            namaRestoran = (TextView) findViewById(R.id.eatbus1);

            Intent a = getIntent();
            String restoran = a.getStringExtra("nama_restoran");
            String makanan = a.getStringExtra("nama_makanan");
            String porsiiii = a.getStringExtra("porsi");
            int w = a.getIntExtra("total_harga");
            String totalHargaa = String.valueOf(w);

            namaRestoran.setText(restoran);
            namaMakanan.setText(makanan);
            porsi.setText(porsiiii);
            totalHarga.setText(totalHargaa);

        }
}
