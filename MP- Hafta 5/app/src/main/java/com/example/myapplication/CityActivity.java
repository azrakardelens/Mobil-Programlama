package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        TextView cityTitle = findViewById(R.id.cityTitle);
        ImageView img1 = findViewById(R.id.imageView1);
        ImageView img2 = findViewById(R.id.imageView2);
        ImageView img3 = findViewById(R.id.imageView3);
        TextView desc1 = findViewById(R.id.desc1);
        TextView desc2 = findViewById(R.id.desc2);
        TextView desc3 = findViewById(R.id.desc3);
        Button btnBack = findViewById(R.id.btnBack);

        String city = getIntent().getStringExtra("CITY_NAME");
        cityTitle.setText(city);

        if ("İstanbul".equals(city)) {
            img1.setImageResource(getResources().getIdentifier("istanbul1", "drawable", getPackageName()));
            img2.setImageResource(getResources().getIdentifier("istanbul2", "drawable", getPackageName()));
            img3.setImageResource(getResources().getIdentifier("istanbul3", "drawable", getPackageName()));
            desc1.setText("İstanbul Açıklama 1: Tarihi Yarımada'nın eşsiz manzarası.");
            desc2.setText("İstanbul Açıklama 2: Boğaz'ın serin suları ve köprüler.");
            desc3.setText("İstanbul Açıklama 3: Galata Kulesi'nden şehre bakış.");
        } else if ("Ankara".equals(city)) {
            img1.setImageResource(getResources().getIdentifier("ankara1", "drawable", getPackageName()));
            img2.setImageResource(getResources().getIdentifier("ankara2", "drawable", getPackageName()));
            img3.setImageResource(getResources().getIdentifier("ankara3", "drawable", getPackageName()));
            desc1.setText("Ankara Açıklama 1: Anıtkabir - Ata'nın huzurunda.");
            desc2.setText("Ankara Açıklama 2: Kızılay Meydanı'nın canlılığı.");
            desc3.setText("Ankara Açıklama 3: Ankara Kalesi'nin tarihi dokusu.");
        } else if ("İzmir".equals(city)) {
            img1.setImageResource(getResources().getIdentifier("izmir1", "drawable", getPackageName()));
            img2.setImageResource(getResources().getIdentifier("izmir2", "drawable", getPackageName()));
            img3.setImageResource(getResources().getIdentifier("izmir3", "drawable", getPackageName()));
            desc1.setText("İzmir Açıklama 1: Kordon Boyu'nda gün batımı.");
            desc2.setText("İzmir Açıklama 2: Saat Kulesi - Şehrin sembolü.");
            desc3.setText("İzmir Açıklama 3: Efes Antik Kenti'nin büyüleyici atmosferi.");
        }

        btnBack.setOnClickListener(v -> finish());
    }
}