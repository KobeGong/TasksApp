package defpackage;

import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: bh  reason: default package */
/* compiled from: PG */
public final class bh implements az, Serializable {
    public static final long serialVersionUID = 1;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final be g;

    bh(int i, boolean z, be beVar, boolean z2, double d2, double d3, long[] jArr) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = d2;
        this.e = d3;
        this.f = jArr;
        this.g = beVar;
    }

    @Override // defpackage.az
    public final boolean a(bb bbVar) {
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
        if ((this.c && d2 - ((double) ((long) d2)) != 0.0d) || (this.g == be.j && bbVar.b != 0)) {
            return !this.b;
        }
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
        return this.b == z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        if (this.a != 0) {
            sb.append(" % ").append(this.a);
        }
        if (!(this.d != this.e)) {
            str = this.b ? " = " : " != ";
        } else if (this.c) {
            str = this.b ? " = " : " != ";
        } else {
            str = this.b ? " within " : " not within ";
        }
        sb.append(str);
        if (this.f != null) {
            for (int i = 0; i < this.f.length; i += 2) {
                av.b(sb, (double) this.f[i], (double) this.f[i + 1], i != 0);
            }
        } else {
            av.b(sb, this.d, this.e, false);
        }
        return sb.toString();
    }
}
