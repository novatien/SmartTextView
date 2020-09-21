package com.notin.text.util;

import android.text.TextPaint;
import android.text.style.SuperscriptSpan;

/**
 * @author NgoVanTien
 * @version 1.01
 */

public class TopAlignSuperscriptSpan extends SuperscriptSpan {
    protected int fontScale = 2;

    protected float shiftPercentage = 0;

    public TopAlignSuperscriptSpan() {}

    public TopAlignSuperscriptSpan( float shiftPercentage ) {
        if( shiftPercentage > 0.0 && shiftPercentage < 1.0 )
            this.shiftPercentage = shiftPercentage;
    }
    @Override
    public void updateDrawState( TextPaint tp ) {

        float ascent = tp.ascent();

        tp.setTextSize( tp.getTextSize() / fontScale );

        float newAscent = tp.getFontMetrics().ascent;

        tp.baselineShift += ( ascent - ascent * shiftPercentage )
                - (newAscent - newAscent * shiftPercentage );
    }
    @Override
    public void updateMeasureState( TextPaint tp ) {
        updateDrawState( tp );
    }
}

