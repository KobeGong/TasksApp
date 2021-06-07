package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: tw  reason: default package */
/* compiled from: PG */
public abstract class tw implements View.OnTouchListener {
    private static final int q = ViewConfiguration.getTapTimeout();
    public final tx a = new tx();
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final Interpolator f = new AccelerateInterpolator();
    private Runnable g;
    private float[] h = {0.0f, 0.0f};
    private float[] i = {Float.MAX_VALUE, Float.MAX_VALUE};
    private int j;
    private int k;
    private float[] l = {0.0f, 0.0f};
    private float[] m = {0.0f, 0.0f};
    private float[] n = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean o;
    private boolean p;

    public tw(View view) {
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = (float) ((int) ((1575.0f * displayMetrics.density) + 0.5f));
        this.n[0] = f2 / 1000.0f;
        this.n[1] = f2 / 1000.0f;
        float f3 = (float) ((int) ((displayMetrics.density * 315.0f) + 0.5f));
        this.m[0] = f3 / 1000.0f;
        this.m[1] = f3 / 1000.0f;
        this.j = 1;
        this.i[0] = Float.MAX_VALUE;
        this.i[1] = Float.MAX_VALUE;
        this.h[0] = 0.2f;
        this.h[1] = 0.2f;
        this.l[0] = 0.001f;
        this.l[1] = 0.001f;
        this.k = q;
        this.a.a = 500;
        this.a.b = 500;
    }

    public abstract void a(int i2);

    public abstract boolean b();

    public abstract boolean b(int i2);

    public final tw a(boolean z) {
        if (this.p && !z) {
            c();
        }
        this.p = z;
        return this;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        tx txVar = this.a;
        int abs = (int) (txVar.d / Math.abs(txVar.d));
        int abs2 = (int) (txVar.c / Math.abs(txVar.c));
        if (abs != 0 && b(abs)) {
            return true;
        }
        if (abs2 != 0) {
            b();
        }
        return false;
    }

    private final void c() {
        if (this.c) {
            this.e = false;
            return;
        }
        tx txVar = this.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - txVar.e);
        int i3 = txVar.b;
        if (i2 <= i3) {
            if (i2 < 0) {
                i3 = 0;
            } else {
                i3 = i2;
            }
        }
        txVar.j = i3;
        txVar.i = txVar.a(currentAnimationTimeMillis);
        txVar.h = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float a(int r6, float r7, float r8, float r9) {
        /*
            r5 = this;
            r1 = 0
            float[] r0 = r5.h
            r0 = r0[r6]
            float[] r2 = r5.i
            r2 = r2[r6]
            float r0 = r0 * r8
            float r0 = a(r0, r1, r2)
            float r2 = r5.a(r7, r0)
            float r3 = r8 - r7
            float r0 = r5.a(r3, r0)
            float r0 = r0 - r2
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0033
            android.view.animation.Interpolator r2 = r5.f
            float r0 = -r0
            float r0 = r2.getInterpolation(r0)
            float r0 = -r0
        L_0x0025:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = a(r0, r2, r3)
        L_0x002d:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x0040
            r0 = r1
        L_0x0032:
            return r0
        L_0x0033:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x003e
            android.view.animation.Interpolator r2 = r5.f
            float r0 = r2.getInterpolation(r0)
            goto L_0x0025
        L_0x003e:
            r0 = r1
            goto L_0x002d
        L_0x0040:
            float[] r2 = r5.l
            r2 = r2[r6]
            float[] r3 = r5.m
            r3 = r3[r6]
            float[] r4 = r5.n
            r4 = r4[r6]
            float r2 = r2 * r9
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0057
            float r0 = r0 * r2
            float r0 = a(r0, r3, r4)
            goto L_0x0032
        L_0x0057:
            float r0 = -r0
            float r0 = r0 * r2
            float r0 = a(r0, r3, r4)
            float r0 = -r0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.a(int, float, float, float):float");
    }

    private final float a(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        switch (this.j) {
            case 0:
            case 1:
                if (f2 >= f3) {
                    return 0.0f;
                }
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                return (!this.e || this.j != 1) ? 0.0f : 1.0f;
            case 2:
                if (f2 < 0.0f) {
                    return f2 / (-f3);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    static float a(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        return f2 < f3 ? f3 : f2;
    }
}
