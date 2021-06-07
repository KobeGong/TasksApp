package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: uf  reason: default package */
/* compiled from: PG */
public final class uf {
    public final RectF a = new RectF();
    public final Paint b = new Paint();
    public final Paint c = new Paint();
    public final Paint d = new Paint();
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 5.0f;
    public int[] i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public Path n;
    public float o = 1.0f;
    public float p;
    public int q;
    public int r;
    public int s = 255;
    public int t;
    private int u;

    uf() {
        this.b.setStrokeCap(Paint.Cap.SQUARE);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        this.c.setStyle(Paint.Style.FILL);
        this.c.setAntiAlias(true);
        this.d.setColor(0);
    }

    public final void a(int i2) {
        this.u = i2;
        this.t = this.i[this.u];
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return (this.u + 1) % this.i.length;
    }

    public final void a(float f2) {
        this.h = f2;
        this.b.setStrokeWidth(f2);
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.i[this.u];
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (this.m != z) {
            this.m = z;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.j = this.e;
        this.k = this.f;
        this.l = this.g;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }
}
