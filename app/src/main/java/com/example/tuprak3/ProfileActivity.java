package com.example.tuprak3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tuprak3.Data;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvProfile = findViewById(R.id.Tv_profile);
        TextView tvAngkaFollowers = findViewById(R.id.Tv_followers);
        TextView tvAngkaFollowing = findViewById(R.id.Tv_following);
        ImageView ivPost = findViewById(R.id.iv_post);

        Intent intent = getIntent();
        Data data = intent.getParcelableExtra("data");

        ivProfile.setImageResource(data.getFotoProfile());
        ivPost.setImageResource(data.getFotoPostingan());
        tvProfile.setText(data.getUsername());
        tvAngkaFollowers.setText(String.valueOf(data.getFollowers()));
        tvAngkaFollowing.setText(String.valueOf(data.getFollowing()));



        // Set click listener for ivProfile
        ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storyIntent = new Intent(ProfileActivity.this, StatusActivity.class);
                storyIntent.putExtra("data", data);
                startActivity(storyIntent);
            }
        });

        ivPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, PostActivity.class);
                intent.putExtra("data",data);
                startActivity(intent);
            }
        });
    }
}
