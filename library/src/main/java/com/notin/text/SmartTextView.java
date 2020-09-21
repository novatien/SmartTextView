package com.notin.text;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.notin.text.util.CustomTypefaceSpan;
import com.notin.text.util.TopAlignSuperscriptSpan;
import com.notin.text.util.TypefaceSmart;

/**
 * @author NgoVanTien
 * @version 1.01
 */

@SuppressLint("AppCompatCustomView")
public class SmartTextView extends TextView {

    private Spannable span;
    public SmartTextView(Context context) {
        super(context);
        init();
    }

    public SmartTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SmartTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @SuppressLint("NewApi")
    public SmartTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
    //Append
    public void textAppend(String text)
    {
        this.setText(this.getText().toString()+text);
        span=null;
        span=new SpannableString(this.getText());
    }
    //Color Text
    public void setTextColor(String colorString) {
        this.setTextColor(Color.parseColor(colorString));
    }

    public void setTextColor(int color, int startPos, int endPos){
        if(span==null)
        span=new SpannableString(this.getText());
        span.setSpan(new ForegroundColorSpan(color),startPos,endPos,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        this.setText(span);
    }

    public void setTextColor(String colorString, int startPos, int endPos){
        if(span==null)
            span=new SpannableString(this.getText());
        span.setSpan(new ForegroundColorSpan(Color.parseColor(colorString)),startPos,endPos,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        this.setText(span);
    }


    //Text Top
    public void setTextTop(float shiftPercentage,int startPos,int endPos)
    {
        if(span==null)
        span=new SpannableString(this.getText());
        span.setSpan(new TopAlignSuperscriptSpan(shiftPercentage),startPos,endPos, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        this.setText(span);
    }
    //Strike Text
    public void setStrikethrough()
    {
        this.setPaintFlags(this.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }
    public void setStrikethrough(int startPos,int endPos)
    {
        if(span==null)
        span=new SpannableString(this.getText());
        span.setSpan(new StrikethroughSpan(),startPos,endPos,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        this.setText(span);
    }
    //Typeface


    public void setTypeface(TypefaceSmart type)
    {
        switch (type)
        {
            case BOLD:
            {
                this.setTypeface(null, Typeface.BOLD);
                break;
            }
            case ITALIC:
            {
                this.setTypeface(null, Typeface.ITALIC);
                break;
            }
            case UNDERLINE:
            {
                this.setPaintFlags(this.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                break;
            }
            case BOLD_ITALIC:
            {
                this.setTypeface(null, Typeface.BOLD_ITALIC);
                break;
            }
            case BOLD_UNDERLINE:
            {
                this.setTypeface(null, Typeface.BOLD);;
                this.setPaintFlags(this.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                break;
            }
            case ITALIC_UNDERLINE:
            {
                this.setTypeface(null, Typeface.ITALIC);
                this.setPaintFlags(this.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                break;
            }
            case BOLD_ITALIC_UNDERLINE:{
                this.setTypeface(null, Typeface.BOLD_ITALIC);
                this.setPaintFlags(this.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                break;
            }
        }
    }

    public void setTypeface(TypefaceSmart type,int startPos,int endPos)
    {

        if(span==null)
            span=new SpannableString(this.getText());
        switch (type)
        {
            case BOLD:
            {
                span.setSpan(new CustomTypefaceSpan(null,TypefaceSmart.BOLD),startPos,endPos,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                break;
            }
            case ITALIC:
            {
                span.setSpan(new CustomTypefaceSpan(null,TypefaceSmart.ITALIC),startPos,endPos,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                break;
            }
            case UNDERLINE:
            {
                span.setSpan(new CustomTypefaceSpan(null,TypefaceSmart.UNDERLINE),startPos,endPos,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                break;
            }
            case BOLD_UNDERLINE:
            {
                span.setSpan(new CustomTypefaceSpan(null,TypefaceSmart.BOLD_UNDERLINE),startPos,endPos,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                break;
            }
            case BOLD_ITALIC:
            {
                span.setSpan(new CustomTypefaceSpan(null,TypefaceSmart.BOLD_ITALIC),startPos,endPos,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                break;
            }
            case ITALIC_UNDERLINE:
            {
                span.setSpan(new CustomTypefaceSpan(null,TypefaceSmart.ITALIC_UNDERLINE),startPos,endPos,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                break;
            }
            case BOLD_ITALIC_UNDERLINE:
            {
                span.setSpan(new CustomTypefaceSpan(null,TypefaceSmart.BOLD_ITALIC_UNDERLINE),startPos,endPos,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                break;
            }
        }
        this.setText(span);

    }
    public void init()
    {
        span=null;
        this.setTextColor(Color.BLACK);
        this.setTextSize(16f);
    }



}

