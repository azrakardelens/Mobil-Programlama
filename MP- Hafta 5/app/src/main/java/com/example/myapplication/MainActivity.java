package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] allImages = {
            "istanbul1", "istanbul2", "istanbul3",
            "ankara1", "ankara2", "ankara3",
            "izmir1", "izmir2", "izmir3"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mainImageView = findViewById(R.id.mainImageView);
        RadioGroup cityRadioGroup = findViewById(R.id.cityRadioGroup);
        Button btnStart = findViewById(R.id.btnStart);

        // Random image selection
        int randomIndex = new Random().nextInt(allImages.length);
        String randomImageName = allImages[randomIndex];
        int resId = getResources().getIdentifier(randomImageName, "drawable", getPackageName());
        if (resId != 0) {
            mainImageView.setImageResource(resId);
        }

        btnStart.setOnClickListener(v -> {
            int selectedId = cityRadioGroup.getCheckedRadioButtonId();
            RadioButton selectedRadioButton = findViewById(selectedId);
            String selectedCity = selectedRadioButton.getText().toString();

            Intent intent = new Intent(MainActivity.this, CityActivity.class);
            intent.putExtra("CITY_NAME", selectedCity);
            startActivity(intent);
        });
    }
}