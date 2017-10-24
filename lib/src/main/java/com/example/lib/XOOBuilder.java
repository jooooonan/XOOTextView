package com.example.lib;

import android.content.Context;

/**
 * Created by wnsgk on 2017-10-24.
 */

public class XOOBuilder {

    private Context context;
    private XOOTextView xooTextView;
    public static XOOBuilder with(Context context) {
        return new XOOBuilder(context);
    }
    XOOBuilder(Context context){
        this.context=context;
        xooTextView = new XOOTextView(context);
    }
    public XOOBuilder setText(String content){
        xooTextView.setText(content);
        return this;
    }
    public XOOBuilder setTextSize(float textSize){
        xooTextView.setTextSize(textSize);
        return this;
    }
    public XOOTextView get(){
        return xooTextView;
    }
}
