package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: vs  reason: default package */
/* compiled from: PG */
public class vs {
    vs() {
    }

    public void a(TextView textView, Drawable drawable) {
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public void b(TextView textView, Drawable drawable) {
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void a(TextView textView, int i) {
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void b(TextView textView, int i) {
        textView.setTextAppearance(textView.getContext(), i);
    }

    vs(byte b) {
        this();
    }
}
