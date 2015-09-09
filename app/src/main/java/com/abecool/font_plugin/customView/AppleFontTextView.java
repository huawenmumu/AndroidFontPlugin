package com.abecool.font_plugin.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by linyt on 2015/9/9.
 */
public class AppleFontTextView  extends TextView {
    String fongUrl = "fonts/pglh.ttf";
    public AppleFontTextView(Context context) {
        super(context);
        init(context);
    }

    public AppleFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public AppleFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    /***
     * 设置字体
     *
     * @return
     */
    public void init(Context context) {
        super.setTypeface(Typeface.createFromAsset(context.getAssets(), fongUrl));
    }
}
