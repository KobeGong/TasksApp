package defpackage;

/* renamed from: bh reason: default package */
/* compiled from: PG */
final class bh implements defpackage.az, java.io.Serializable {
    public static final long serialVersionUID = 1;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final defpackage.be g;

    bh(int i, boolean z, defpackage.be beVar, boolean z2, double d2, double d3, long[] jArr) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = d2;
        this.e = d3;
        this.f = jArr;
        this.g = beVar;
    }

    public final boolean a(defpackage.bb bbVar) {
        double d2;
        switch (this.g.ordinal()) {
            case 1:
                d2 = (double) bbVar.f;
                break;
            case 2:
                d2 = (double) bbVar.d;
                break;
            case 3:
                d2 = (double) bbVar.e;
                break;
            case 4:
                d2 = (double) bbVar.b;
                break;
            case 5:
                d2 = (double) bbVar.c;
                break;
            default:
                d2 = bbVar.a;
                break;
        }
        if ((!this.c || d2 - ((double) ((long) d2)) == 0.0d) && (this.g != defpackage.be.j || bbVar.b == 0)) {
            if (this.a != 0) {
                d2 %= (double) this.a;
            }
            boolean z = d2 >= this.d && d2 <= this.e;
            if (z && this.f != null) {
                int i = 0;
                z = false;
                while (!z && i < this.f.length) {
                    if (d2 < ((double) this.f[i]) || d2 > ((double) this.f[i + 1])) {
                        z = false;
                    } else {
                        z = true;
                    }
                    i += 2;
                }
            }
            if (this.b != z) {
                return false;
            }
            return true;
        } else if (!this.b) {
            return true;
        } else {
            return false;
        }
    }

    public final java.lang.String toString() {
        boolean z;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.g);
        if (this.a != 0) {
            sb.append(" % ").append(this.a);
        }
        java.lang.String str = !((this.d > this.e ? 1 : (this.d == this.e ? 0 : -1)) != 0) ? this.b ? " = " : " != " : this.c ? this.b ? " = " : " != " : this.b ? " within " : " not within ";
        sb.append(str);
        if (this.f != null) {
            for (int i = 0; i < this.f.length; i += 2) {
                double d2 = (double) this.f[i];
                double d3 = (double) this.f[i + 1];
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                defpackage.av.b(sb, d2, d3, z);
            }
        } else {
            defpackage.av.b(sb, this.d, this.e, false);
        }
        return sb.toString();
    }
}
