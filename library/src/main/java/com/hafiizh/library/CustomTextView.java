package com.hafiizh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by HAFIIZH on 10/3/2017.
 */

public class CustomTextView extends TextView {
    public CustomTextView(Context context) {
        this(context, null);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView, 0, 0);
        String path_font = array.getString(R.styleable.CustomTextView_fontPath);

        array.recycle();

        if (path_font != null) {
            setCustomTypeFace(context, path_font);
        } else {
            setCustomTypeFace(context, "fonts/EBGaramond-Regular.ttf");
        }
    }

    private void setCustomTypeFace(Context context, String path_font) {
        Typeface typefaces = Typeface.createFromAsset(context.getAssets(), path_font);
        this.setTypeface(typefaces);
    }
}
