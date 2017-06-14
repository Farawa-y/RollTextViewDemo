package com.android.faraway.rolltextviewdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Far-away on 17/6/14.
 */

public class MarqueeText extends android.support.v7.widget.AppCompatTextView {

    public MarqueeText(Context context) {
        super(context);
        setSingleLine(true);
    }

    public MarqueeText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setSingleLine(true);
    }

    public MarqueeText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setSingleLine(true);
    }

    @Override
    public boolean isFocused() {
        return true;
    }

    //布局中第一个TextView使用android中TextView调整属性实现，第二三通过自定义控件实现，如果多个控件通过属性实现除第一个外其他无法实现，原因是因
    //为焦点一直在第一个控件，课通过自定义控件实现。
    // 由于singleline已经过时，我想当然的使用新的方式：maxLines="1"，在行数上singleline="true"与maxLines="1"是一样的，但是在显示上有很大区别
    //maxLines会将超出文本区域的文字自动换行，而singleline则不会自动换行，超出后不换行才满足跑马灯的条件
}
