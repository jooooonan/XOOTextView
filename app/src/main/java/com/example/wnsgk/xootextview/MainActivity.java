package com.example.wnsgk.xootextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.example.lib.XOOBuilder;
import com.example.lib.XOOTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        XOOTextView tv1 = (XOOTextView) findViewById(R.id.textview1);
//        tv1.show();
//        tv1.hide(); // 이런 식으로 사용가능...

        ViewGroup root = (ViewGroup) findViewById(R.id.root);
        XOOTextView tv2 = XOOBuilder.with(this)
                .setText("!Builder!")
                .setTextSize(15)
                .get();

        root.addView(tv2);
    }
}
