package com.filipebarretto.androidhelloworld;

// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppcompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
