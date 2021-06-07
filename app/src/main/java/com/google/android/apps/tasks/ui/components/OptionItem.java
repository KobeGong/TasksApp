package com.google.android.apps.tasks.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class OptionItem extends TextView {
    public OptionItem(Context context) {
        this(context, null);
    }

    public OptionItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.optionItemStyle);
    }

    public OptionItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
