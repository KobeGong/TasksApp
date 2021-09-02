package defpackage;

/* renamed from: cwn reason: default package */
/* compiled from: PG */
class cwn extends defpackage.cwl {
    public final int a = 3;
    public final int b;
    public final double c;

    cwn(int i, double d, int i2) {
        defpackage.cld.a(true);
        defpackage.cld.a(true);
        this.b = 2000;
        defpackage.cld.a(true);
        this.c = 2.0d;
    }

    public final boolean a(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z);
        if (i < this.a) {
            return true;
        }
        return false;
    }

    public final int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (!a(i)) {
            return -1;
        }
        return defpackage.cub.a((long) (((double) this.b) * java.lang.Math.pow(this.c, (double) (i - 1))));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cwn)) {
            return false;
        }
        defpackage.cwn cwn = (defpackage.cwn) obj;
        if (this.b == cwn.b && this.c == cwn.c && this.a == cwn.a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Double.valueOf(this.c)});
    }
}
