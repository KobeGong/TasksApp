package defpackage;

/* renamed from: hs reason: default package */
/* compiled from: PG */
final class hs {
    public final android.graphics.Matrix a = new android.graphics.Matrix();
    public final java.util.ArrayList b = new java.util.ArrayList();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public final android.graphics.Matrix j = new android.graphics.Matrix();
    public int k;
    public int[] l;
    public java.lang.String m = null;

    public hs(defpackage.hs hsVar, defpackage.qr qrVar) {
        defpackage.ht hqVar;
        this.c = hsVar.c;
        this.d = hsVar.d;
        this.e = hsVar.e;
        this.f = hsVar.f;
        this.g = hsVar.g;
        this.h = hsVar.h;
        this.i = hsVar.i;
        this.l = hsVar.l;
        this.m = hsVar.m;
        this.k = hsVar.k;
        if (this.m != null) {
            qrVar.put(this.m, this);
        }
        this.j.set(hsVar.j);
        java.util.ArrayList arrayList = hsVar.b;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < arrayList.size()) {
                java.lang.Object obj = arrayList.get(i3);
                if (obj instanceof defpackage.hs) {
                    this.b.add(new defpackage.hs((defpackage.hs) obj, qrVar));
                } else {
                    if (obj instanceof defpackage.hr) {
                        hqVar = new defpackage.hr((defpackage.hr) obj);
                    } else if (obj instanceof defpackage.hq) {
                        hqVar = new defpackage.hq((defpackage.hq) obj);
                    } else {
                        throw new java.lang.IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(hqVar);
                    if (hqVar.o != null) {
                        qrVar.put(hqVar.o, hqVar);
                    }
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    public hs() {
    }

    public final java.lang.String getGroupName() {
        return this.m;
    }

    public final android.graphics.Matrix getLocalMatrix() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public final float getRotation() {
        return this.c;
    }

    public final void setRotation(float f2) {
        if (f2 != this.c) {
            this.c = f2;
            a();
        }
    }

    public final float getPivotX() {
        return this.d;
    }

    public final void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            a();
        }
    }

    public final float getPivotY() {
        return this.e;
    }

    public final void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            a();
        }
    }

    public final float getScaleX() {
        return this.f;
    }

    public final void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            a();
        }
    }

    public final float getScaleY() {
        return this.g;
    }

    public final void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            a();
        }
    }

    public final float getTranslateX() {
        return this.h;
    }

    public final void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            a();
        }
    }

    public final float getTranslateY() {
        return this.i;
    }

    public final void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            a();
        }
    }
}
