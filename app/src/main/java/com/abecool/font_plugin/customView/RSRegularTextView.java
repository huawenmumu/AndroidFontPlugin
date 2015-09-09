package com.abecool.font_plugin.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by linyt on 2015/9/8.
 */
public class RSRegularTextView extends TextView {
    String fongUrl = "fonts/RobotoSlab-Regular.ttf";

    public RSRegularTextView(Context context) {
        super(context);
        init(context);
    }

    public RSRegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public RSRegularTextView(Context context, AttributeSet attrs, int defSyle) {
        super(context, attrs, defSyle);
        init(context);
    }

    /***
     * 设置字体
     *
     * @return
     */
    public void init(Context context) {
        setTypeface(setFont(fongUrl, context));
    }

    public Typeface setFont(String ttf,Context context) {
        return Typeface.createFromAsset(context.getAssets(), ttf);
    }
}
