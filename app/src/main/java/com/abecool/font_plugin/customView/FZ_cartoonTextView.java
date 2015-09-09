package com.abecool.font_plugin.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by linyt on 2015/9/9.
 */
public class FZ_cartoonTextView extends TextView{
    String fongUrl = "fonts/fzktjt.ttf";
    public FZ_cartoonTextView(Context context) {
        super(context);
        init(context);
    }

    public FZ_cartoonTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public FZ_cartoonTextView(Context context, AttributeSet attrs, int defStyle) {
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
