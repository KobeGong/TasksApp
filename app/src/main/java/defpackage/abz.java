package defpackage;

/* renamed from: abz reason: default package */
/* compiled from: PG */
public final class abz extends android.widget.SeekBar {
    private final defpackage.aca a;

    public abz(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private abz(android.content.Context context, android.util.AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 2130772240);
        this.a = new defpackage.aca(this);
        this.a.a(attributeSet, 2130772240);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(android.graphics.Canvas canvas) {
        int i = 1;
        synchronized (this) {
            super.onDraw(canvas);
            defpackage.aca aca = this.a;
            if (aca.c != null) {
                int max = aca.b.getMax();
                if (max > 1) {
                    int intrinsicWidth = aca.c.getIntrinsicWidth();
                    int intrinsicHeight = aca.c.getIntrinsicHeight();
                    int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                    if (intrinsicHeight >= 0) {
                        i = intrinsicHeight / 2;
                    }
                    aca.c.setBounds(-i2, -i, i2, i);
                    float width = ((float) ((aca.b.getWidth() - aca.b.getPaddingLeft()) - aca.b.getPaddingRight())) / ((float) max);
                    int save = canvas.save();
                    canvas.translate((float) aca.b.getPaddingLeft(), (float) (aca.b.getHeight() / 2));
                    for (int i3 = 0; i3 <= max; i3++) {
                        aca.c.draw(canvas);
                        canvas.translate(width, 0.0f);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.aca aca = this.a;
        android.graphics.drawable.Drawable drawable = aca.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(aca.b.getDrawableState())) {
            aca.b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        defpackage.aca aca = this.a;
        if (aca.c != null) {
            aca.c.jumpToCurrentState();
        }
    }
}
