package com.notin.text.util;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

       /**
        * @author NgoVanTien
        * @version 1.01
        */

public class CustomTypefaceSpan extends TypefaceSpan {
    private final TypefaceSmart type;
    public CustomTypefaceSpan(String family,TypefaceSmart type) {
        super(family);
        this.type = type;
    }
    @Override
    public void updateDrawState(TextPaint ds) {
        applyCustomTypeFace(ds,type);
    }
    @Override
    public void updateMeasureState(TextPaint paint) {
        applyCustomTypeFace(paint,type);
    }
    private static void applyCustomTypeFace(Paint paint,TypefaceSmart type) {

        switch (type){
            case BOLD:
            {
                paint.setFakeBoldText(true);
                break;
            }
            case ITALIC:
            {
                paint.setTextSkewX(-0.25f);
                break;
            }
            case UNDERLINE:
            {
                paint.setUnderlineText(true);
                break;
            }
            case BOLD_UNDERLINE:
            {
                paint.setFakeBoldText(true);
                paint.setUnderlineText(true);
                break;
            }
            case BOLD_ITALIC:
            {
                paint.setFakeBoldText(true);
                paint.setTextSkewX(-0.25f);
                break;
            }
            case ITALIC_UNDERLINE:
            {
                paint.setTextSkewX(-0.25f);
                paint.setUnderlineText(true);
                break;
            }
            case BOLD_ITALIC_UNDERLINE:{
                paint.setFakeBoldText(true);
                paint.setTextSkewX(-0.25f);
                paint.setUnderlineText(true);
                break;
            }
        }
    }
}

