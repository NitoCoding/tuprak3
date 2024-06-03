package com.example.tuprak3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class StatusActivity extends AppCompatActivity {

    private ImageView iv_profile;
    private ImageView iv_story;
    private TextView tv_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        Intent intent = getIntent();
        Data data = intent.getParcelableExtra("data"); // Gunakan kunci yang sama


        iv_profile = findViewById(R.id.iv_profile2);
        iv_story = findViewById(R.id.imageStory);
        tv_nama = findViewById(R.id.tv_profile2);

        iv_profile.setImageResource(data.getFotoProfile());
        iv_story.setImageResource(data.getFotoStory());
        tv_nama.setText(data.getUsername());

        tv_nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatusActivity.this, ProfileActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });
    }
}