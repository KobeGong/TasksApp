package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: hs  reason: default package */
/* compiled from: PG */
public final class hs {
    public final Matrix a = new Matrix();
    public final ArrayList b = new ArrayList();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public final Matrix j = new Matrix();
    public int k;
    public int[] l;
    public String m = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [qr, ri] */
    /* JADX WARN: Type inference failed for: r2v8, types: [hr] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hs(defpackage.hs r6, defpackage.qr r7) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs.<init>(hs, qr):void");
    }

    public hs() {
    }

    public final String getGroupName() {
        return this.m;
    }

    public final Matrix getLocalMatrix() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
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
