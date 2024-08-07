package com.example.uccitconnect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FacultyStaffDirectory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_staff_directory);

        LinearLayout directoryList = findViewById(R.id.directory_list);

        int[] imageResources = {
                R.drawable.natalie,
                R.drawable.sonia,
                R.drawable.tamaree,
                R.drawable.sheilah,

        };


        String[] names = {
                "Natalie Rose",
                "Sonia Davidson",
                "Tamaree Robb-Duncan",
                "Sheilah Paul",

        };

        String[] phoneNumbers = {
                "123-456-7890",
                "234-567-8901",
                "345-678-9012",
                "456-789-0123",

        };

        String[] emails = {
                "nrose@faculty.ucc.edu.jm",
                "sdavidson@faculty.ucc.edu.jm",
                "tamaree@faculty.ucc.edu.jm",
                "spaul@faculty.ucc.edu.jm",

        };


        for (int i = 0; i < 10; i++) {
            View contactView = LayoutInflater.from(this).inflate(R.layout.contact_item, directoryList, false);


            ImageView memberPhoto = contactView.findViewById(R.id.member_photo);
            TextView memberName = contactView.findViewById(R.id.member_name);
            TextView memberPhone = contactView.findViewById(R.id.member_phone);
            TextView memberEmail = contactView.findViewById(R.id.member_email);
            ImageButton callBtn = contactView.findViewById(R.id.callBtn);
            ImageButton emailBtn = contactView.findViewById(R.id.emailBtn);


            memberPhoto.setImageResource(imageResources[i % imageResources.length]);
            memberName.setText(names[i % names.length]);
            memberPhone.setText(phoneNumbers[i % phoneNumbers.length]);
            memberEmail.setText(emails[i % emails.length]);


            callBtn.setOnClickListener(v -> {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + memberPhone.getText().toString()));
                startActivity(intent);
            });

            emailBtn.setOnClickListener(v -> {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + memberEmail.getText().toString()));
                startActivity(intent);
            });


            directoryList.addView(contactView);
        }
    }
}
