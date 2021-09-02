package defpackage;

/* renamed from: dw reason: default package */
/* compiled from: PG */
public final class dw extends defpackage.gc {
    public float a;
    private final float b;
    private final float c;
    private float d;

    public dw(float f, float f2, float f3) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        if (f3 < 0.0f) {
            throw new java.lang.IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.a = 0.0f;
    }

    public final void a(float f, float f2, defpackage.ge geVar) {
        float f3 = (this.b * f2) / 2.0f;
        float f4 = f2 * this.c;
        float f5 = (f / 2.0f) + this.a;
        float f6 = f2 * this.d;
        if (f6 / f3 >= 1.0f) {
            geVar.a(f);
            return;
        }
        float sqrt = (float) java.lang.Math.sqrt((double) ((f3 * f3) - (f6 * f6)));
        float f7 = f5 - sqrt;
        float f8 = f7 - f4;
        float f9 = f5 + sqrt;
        float f10 = f9 + f4;
        geVar.a(f8);
        geVar.a(f8, 0.0f, f7, f4, 270.0f, 90.0f);
        defpackage.ge geVar2 = geVar;
        geVar2.a(f5 - f3, (-f3) - f6, f3 + f5, f3 - f6, 180.0f, -180.0f);
        geVar.a(f9, 0.0f, f10, f4, 180.0f, 90.0f);
        geVar.a(f);
    }
}
