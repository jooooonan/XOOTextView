package com.example.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wnsgk on 2017-10-24.
 */

public class XOOTextView extends AppCompatTextView { //TextView를 상속받았기 때문에 기본적인 TextView의 기능을 사용 가능

    public XOOTextView(Context context) {
        super(context);
    }

    public XOOTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.XOOTextView,
                0, 0);

        try {
            switch (a.getInt(R.styleable.XOOTextView_textStyle, 0)) {
                case 1: {
                    setStyle(R.style.TextTitleStyle);
                    break;
                }
                case 2: {
                    setStyle(R.style.TextContentStyle);
                    break;
                }
                case 3: {
                    setStyle(R.style.TextCommentStyle);
                    break;
                }
            }
        } finally {
            a.recycle();
        }
    }

    public XOOTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void setStyle(int style) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            setTextAppearance(style);
        } else {
            setTextAppearance(getContext(), style);
        }
    }

    public void show(){ // 임의로 뷰의 함수를 만들 때 그냥 이런식으로 만들어주면 된다....!
        setVisibility(View.VISIBLE);
    }

    public void hide(){
        setVisibility(View.GONE);
    }
}
