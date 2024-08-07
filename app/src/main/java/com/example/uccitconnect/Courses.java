package com.example.uccitconnect;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.uccitconnect.models.Course;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_courses);

        // Initialize Firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference coursesRef = database.getReference("courses");

        // Create and push the course data
        Course course1 = new Course("ENG109", "Academic Writing I", "None", 3);
        Course course2 = new Course("UCC101", "Orientation to University Life", "None", 1);
        Course course3 = new Course("ITT107", "Computer Information Essentials", "None", 3);
        Course course4 = new Course("PSY100", "Introduction to Psychology", "None", 3);
        Course course5 = new Course("SPA101", "Introduction to Spanish", "None", 3);
        Course course6 = new Course("MTH101", "College Algebra", "CSEC Math", 3);
        Course course7 = new Course("ENG111", "Public Speaking", "Academic Writing I", 3);
        Course course8 = new Course("ITT103", "Programming Techniques", "Computer Information Essentials", 3);
        Course course9 = new Course("ENG110", "Academic Writing II", "Academic Writing I", 3);
        Course course10 = new Course("ITT200", "Object Oriented Programming", "Programming Techniques", 3);
        Course course11 = new Course("POL100", "Introduction to Politics", "Academic Writing I", 3);

        coursesRef.push().setValue(course1);
        coursesRef.push().setValue(course2);
        coursesRef.push().setValue(course3);
        coursesRef.push().setValue(course4);
        coursesRef.push().setValue(course5);
        coursesRef.push().setValue(course6);
        coursesRef.push().setValue(course7);
        coursesRef.push().setValue(course8);
        coursesRef.push().setValue(course9);
        coursesRef.push().setValue(course10);
        coursesRef.push().setValue(course11);
    }
}
