package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: uc  reason: default package */
/* compiled from: PG */
public final class uc extends Drawable implements Animatable {
    public static final Interpolator a = new tt();
    private static final Interpolator g = new LinearInterpolator();
    private static final int[] h = {-16777216};
    public final uf b = new uf();
    public float c;
    public Resources d;
    public float e;
    public boolean f;
    private Animator i;

    public uc(Context context) {
        this.d = ((Context) jd.a((Object) context)).getResources();
        uf ufVar = this.b;
        ufVar.i = h;
        ufVar.a(0);
        this.b.a(2.5f);
        invalidateSelf();
        uf ufVar2 = this.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ud(this, ufVar2));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(g);
        ofFloat.addListener(new ue(this, ufVar2));
        this.i = ofFloat;
    }

    public final void a(boolean z) {
        this.b.a(z);
        invalidateSelf();
    }

    public final void a(float f2) {
        uf ufVar = this.b;
        if (f2 != ufVar.o) {
            ufVar.o = f2;
        }
        invalidateSelf();
    }

    public final void b(float f2) {
        this.b.e = 0.0f;
        this.b.f = f2;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
        uf ufVar = this.b;
        RectF rectF = ufVar.a;
        float f2 = ufVar.p + (ufVar.h / 2.0f);
        if (ufVar.p <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) ufVar.q) * ufVar.o) / 2.0f, ufVar.h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, f2 + ((float) bounds.centerY()));
        float f3 = (ufVar.e + ufVar.g) * 360.0f;
        float f4 = ((ufVar.f + ufVar.g) * 360.0f) - f3;
        ufVar.b.setColor(ufVar.t);
        ufVar.b.setAlpha(ufVar.s);
        float f5 = ufVar.h / 2.0f;
        rectF.inset(f5, f5);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ufVar.d);
        rectF.inset(-f5, -f5);
        canvas.drawArc(rectF, f3, f4, false, ufVar.b);
        if (ufVar.m) {
            if (ufVar.n == null) {
                ufVar.n = new Path();
                ufVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                ufVar.n.reset();
            }
            ufVar.n.moveTo(0.0f, 0.0f);
            ufVar.n.lineTo(((float) ufVar.q) * ufVar.o, 0.0f);
            ufVar.n.lineTo((((float) ufVar.q) * ufVar.o) / 2.0f, ((float) ufVar.r) * ufVar.o);
            ufVar.n.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) ufVar.q) * ufVar.o) / 2.0f), rectF.centerY() + (ufVar.h / 2.0f));
            ufVar.n.close();
            ufVar.c.setColor(ufVar.t);
            ufVar.c.setAlpha(ufVar.s);
            canvas.save();
            canvas.rotate(f3 + f4, rectF.centerX(), rectF.centerY());
            canvas.drawPath(ufVar.n, ufVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void setAlpha(int i2) {
        this.b.s = i2;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.b.s;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.i.isRunning();
    }

    public final void start() {
        this.i.cancel();
        this.b.c();
        if (this.b.f != this.b.e) {
            this.f = true;
            this.i.setDuration(666);
            this.i.start();
            return;
        }
        this.b.a(0);
        this.b.d();
        this.i.setDuration(1332);
        this.i.start();
    }

    public final void stop() {
        this.i.cancel();
        this.c = 0.0f;
        this.b.a(false);
        this.b.a(0);
        this.b.d();
        invalidateSelf();
    }

    static void a(float f2, uf ufVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int b2 = ufVar.b();
            int i2 = ufVar.i[ufVar.a()];
            int i3 = b2 >>> 24;
            int i4 = (b2 >> 16) & 255;
            int i5 = (b2 >> 8) & 255;
            int i6 = b2 & 255;
            int i7 = ((int) (f3 * ((float) ((i2 & 255) - i6)))) + i6;
            ufVar.t = i7 | ((i3 + ((int) (((float) ((i2 >>> 24) - i3)) * f3))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f3))) << 16) | ((((int) (((float) (((i2 >> 8) & 255) - i5)) * f3)) + i5) << 8);
            return;
        }
        ufVar.t = ufVar.b();
    }
}
