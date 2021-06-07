package defpackage;

import android.graphics.Paint;

/* access modifiers changed from: package-private */
/* renamed from: hr  reason: default package */
/* compiled from: PG */
public final class hr extends ht {
    public int[] a;
    public int b = 0;
    public float c = 0.0f;
    public int d = 0;
    public float e = 1.0f;
    public int f = 0;
    public float g = 1.0f;
    public float h = 0.0f;
    public float i = 1.0f;
    public float j = 0.0f;
    public Paint.Cap k = Paint.Cap.BUTT;
    public Paint.Join l = Paint.Join.MITER;
    public float m = 4.0f;

    public hr() {
    }

    public hr(hr hrVar) {
        super(hrVar);
        this.a = hrVar.a;
        this.b = hrVar.b;
        this.c = hrVar.c;
        this.e = hrVar.e;
        this.d = hrVar.d;
        this.f = hrVar.f;
        this.g = hrVar.g;
        this.h = hrVar.h;
        this.i = hrVar.i;
        this.j = hrVar.j;
        this.k = hrVar.k;
        this.l = hrVar.l;
        this.m = hrVar.m;
    }

    /* access modifiers changed from: package-private */
    public final int getStrokeColor() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final void setStrokeColor(int i2) {
        this.b = i2;
    }

    /* access modifiers changed from: package-private */
    public final float getStrokeWidth() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final void setStrokeWidth(float f2) {
        this.c = f2;
    }

    /* access modifiers changed from: package-private */
    public final float getStrokeAlpha() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final void setStrokeAlpha(float f2) {
        this.e = f2;
    }

    /* access modifiers changed from: package-private */
    public final int getFillColor() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final void setFillColor(int i2) {
        this.d = i2;
    }

    /* access modifiers changed from: package-private */
    public final float getFillAlpha() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final void setFillAlpha(float f2) {
        this.g = f2;
    }

    /* access modifiers changed from: package-private */
    public final float getTrimPathStart() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final void setTrimPathStart(float f2) {
        this.h = f2;
    }

    /* access modifiers changed from: package-private */
    public final float getTrimPathEnd() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final void setTrimPathEnd(float f2) {
        this.i = f2;
    }

    /* access modifiers changed from: package-private */
    public final float getTrimPathOffset() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final void setTrimPathOffset(float f2) {
        this.j = f2;
    }
}
