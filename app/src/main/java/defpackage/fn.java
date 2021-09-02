package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: fn  reason: default package */
/* compiled from: PG */
/* compiled from: ScrimInsetsFrameLayout */
public class fn extends FrameLayout {
    public Drawable a;
    public Rect b;
    private Rect c;

    public fn(Context context) {
        this(context, null);
    }

    public fn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        TypedArray a2 = fp.a(context, attributeSet, fm.e, i, 2132017720);
        this.a = a2.getDrawable(fm.f);
        a2.recycle();
        setWillNotDraw(true);
        sn.a(this, new fo(this));
    }

    public void draw(Canvas canvas) {
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

    public void a(tk tkVar) {
    }
}
