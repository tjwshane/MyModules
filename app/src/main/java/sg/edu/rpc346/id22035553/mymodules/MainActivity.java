package sg.edu.rpc346.id22035553.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv01;
    TextView tv02;
    TextView tv03;
    TextView tv04;
    TextView tv05;
    TextView tv06;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv01 = findViewById(R.id.textView01);
        tv02 = findViewById(R.id.textView02);
        tv03 = findViewById(R.id.textView03);
        tv04 = findViewById(R.id.textView04);
        tv05 = findViewById(R.id.textView05);
        tv06 = findViewById(R.id.textView06);

        tv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "E63A");
                startActivity(intent);
            }
        });

        tv02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C206");
                intent.putExtra("Module Name", "Software Development Process");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tv03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C203");
                intent.putExtra("Module Name", "Web Appln Development in php");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tv04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C218");
                intent.putExtra("Module Name", "UI/UX Design For Apps");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tv05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "G953");
                intent.putExtra("Module Name", "Life Skills III");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "HB02");
                startActivity(intent);
            }
        });

        tv06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C235");
                intent.putExtra("Module Name", "IT Security and Management");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

    }
}