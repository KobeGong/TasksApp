package defpackage;

/* renamed from: vs reason: default package */
/* compiled from: PG */
public class vs {
    vs() {
    }

    public void a(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public void b(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
    }

    public void a(android.widget.TextView textView, int i) {
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void b(android.widget.TextView textView, int i) {
        textView.setTextAppearance(textView.getContext(), i);
    }

    vs(byte b) {
        this();
    }
}
