package defpackage;

import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: cwn  reason: default package */
/* compiled from: PG */
public class cwn extends cwl {
    public final int a = 3;
    public final int b;
    public final double c;

    cwn(int i, double d, int i2) {
        cld.a(true);
        cld.a(true);
        this.b = 2000;
        cld.a(true);
        this.c = 2.0d;
    }

    @Override // defpackage.cwl
    public final boolean a(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z);
        return i < this.a;
    }

    @Override // defpackage.cwl
    public final int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (!a(i)) {
            return -1;
        }
        return cub.a((long) (((double) this.b) * Math.pow(this.c, (double) (i - 1))));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cwn)) {
            return false;
        }
        cwn cwn = (cwn) obj;
        if (this.b == cwn.b && this.c == cwn.c && this.a == cwn.a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Double.valueOf(this.c)});
    }
}
