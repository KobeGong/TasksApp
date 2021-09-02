package defpackage;

/* renamed from: fn reason: default package */
/* compiled from: PG */
public class fn extends android.widget.FrameLayout {
    public android.graphics.drawable.Drawable a;
    public android.graphics.Rect b;
    private android.graphics.Rect c;

    public fn(android.content.Context context) {
        this(context, null);
    }

    public fn(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fn(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new android.graphics.Rect();
        android.content.res.TypedArray a2 = defpackage.fp.a(context, attributeSet, defpackage.fm.e, i, 2132017720);
        this.a = a2.getDrawable(defpackage.fm.f);
        a2.recycle();
        setWillNotDraw(true);
        defpackage.sn.a((android.view.View) this, (defpackage.sl) new defpackage.fo(this));
    }

    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b != null && this.a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.c.set(0, 0, width, this.b.top);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(0, height - this.b.bottom, width, height);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(0, this.b.top, this.b.left, height - this.b.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(width - this.b.right, this.b.top, width, height - this.b.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            this.a.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            this.a.setCallback(null);
        }
    }

    public void a(defpackage.tk tkVar) {
    }
}
