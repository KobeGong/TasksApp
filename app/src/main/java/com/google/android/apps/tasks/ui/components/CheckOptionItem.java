package com.google.android.apps.tasks.ui.components;

/* compiled from: PG */
public class CheckOptionItem extends android.widget.RelativeLayout {
    private final android.widget.TextView a;
    private final android.widget.ImageView b;

    public CheckOptionItem(android.content.Context context) {
        this(context, null);
    }

    public CheckOptionItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772248);
    }

    public CheckOptionItem(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131034150, this);
        this.a = (android.widget.TextView) inflate.findViewById(2131755269);
        this.b = (android.widget.ImageView) inflate.findViewById(2131755268);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.ail.a, i, 0);
        try {
            a(obtainStyledAttributes.getString(defpackage.ail.b));
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
        this.a.setTextAppearance(this.a.getContext(), z ? 2132017398 : 2132017397);
    }

    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setSelected(this.b.getVisibility() == 0);
    }

    public final void a(java.lang.String str) {
        this.a.setText(str);
    }
}
