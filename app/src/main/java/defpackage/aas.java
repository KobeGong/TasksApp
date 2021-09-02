package defpackage;

/* renamed from: aas reason: default package */
/* compiled from: PG */
final class aas extends defpackage.abt implements defpackage.aay {
    public final /* synthetic */ defpackage.aap a;

    public aas(defpackage.aap aap, android.content.Context context) {
        this.a = aap;
        super(context, null, 2130772142);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        defpackage.aaz.a((android.view.View) this, getContentDescription());
        setOnTouchListener(new defpackage.aat(this, this));
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.e();
        }
        return true;
    }

    public final boolean e_() {
        return false;
    }

    public final boolean e() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = java.lang.Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            defpackage.jd.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
