package defpackage;

/* renamed from: xm reason: default package */
/* compiled from: PG */
final class xm {
    public static defpackage.xm a;
    public long b;
    public long c;
    public int d;

    xm() {
    }

    public final void a(long j, double d2, double d3) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = 6.24006f + (0.01720197f * f);
        double sin = ((double) f2) + (0.03341960161924362d * java.lang.Math.sin((double) f2)) + (3.4906598739326E-4d * java.lang.Math.sin((double) (2.0f * f2))) + (5.236000106378924E-6d * java.lang.Math.sin((double) (3.0f * f2))) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d3) / 360.0d;
        double sin2 = (java.lang.Math.sin((double) f2) * 0.0053d) + d4 + ((double) (((float) java.lang.Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + (-0.0069d * java.lang.Math.sin(2.0d * sin));
        double asin = java.lang.Math.asin(java.lang.Math.sin(sin) * java.lang.Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (java.lang.Math.sin(-0.10471975803375244d) - (java.lang.Math.sin(d5) * java.lang.Math.sin(asin))) / (java.lang.Math.cos(asin) * java.lang.Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.d = 1;
            this.b = -1;
            this.c = -1;
        } else if (sin3 <= -1.0d) {
            this.d = 0;
            this.b = -1;
            this.c = -1;
        } else {
            float acos = (float) (java.lang.Math.acos(sin3) / 6.283185307179586d);
            this.b = java.lang.Math.round((((double) acos) + sin2) * 8.64E7d) + 946728000000L;
            this.c = java.lang.Math.round((sin2 - ((double) acos)) * 8.64E7d) + 946728000000L;
            if (this.c >= j || this.b <= j) {
                this.d = 1;
            } else {
                this.d = 0;
            }
        }
    }
}
