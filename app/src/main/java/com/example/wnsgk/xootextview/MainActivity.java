package com.example.wnsgk.xootextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lib.XOOTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XOOTextView tv1 = (XOOTextView) findViewById(R.id.textview1);

        tv1.show();
        tv1.hide(); // 이런 식으로 사용가능...
    }
}
