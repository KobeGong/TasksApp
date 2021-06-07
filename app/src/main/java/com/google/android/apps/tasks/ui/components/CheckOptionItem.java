package com.google.android.apps.tasks.ui.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class CheckOptionItem extends RelativeLayout {
    private final TextView a;
    private final ImageView b;

    public CheckOptionItem(Context context) {
        this(context, null);
    }

    public CheckOptionItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.optionItemStyle);
    }

    public CheckOptionItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.check_option_item, this);
        this.a = (TextView) inflate.findViewById(R.id.option_text);
        this.b = (ImageView) inflate.findViewById(R.id.option_check);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ail.a, i, 0);
        try {
            a(obtainStyledAttributes.getString(ail.b));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
        this.b.setEnabled(z);
    }

    public final void a(boolean z) {
        this.b.setVisibility(z ? 0 : 4);
        this.a.setTextAppearance(this.a.getContext(), z ? R.style.OptionItemTextAppearanceSelected : R.style.OptionItemTextAppearance);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setSelected(this.b.getVisibility() == 0);
    }

    public final void a(String str) {
        this.a.setText(str);
    }
}
