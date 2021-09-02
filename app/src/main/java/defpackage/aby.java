package defpackage;

/* renamed from: aby reason: default package */
/* compiled from: PG */
public final class aby extends android.widget.RatingBar {
    private final defpackage.abw a;

    public aby(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private aby(android.content.Context context, android.util.AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 2130772237);
        this.a = new defpackage.abw(this);
        this.a.a(attributeSet, 2130772237);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.graphics.Bitmap bitmap = this.a.a;
        if (bitmap != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
