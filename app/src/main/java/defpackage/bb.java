package defpackage;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Deprecated
/* renamed from: bb  reason: default package */
/* compiled from: PG */
public final class bb extends Number implements Comparable {
    public static final long serialVersionUID = -4756200506571685661L;
    @Deprecated
    public final double a;
    @Deprecated
    public final int b;
    @Deprecated
    public final int c;
    @Deprecated
    public final long d;
    @Deprecated
    public final long e;
    @Deprecated
    public final long f;
    @Deprecated
    private final boolean g;

    @Deprecated
    private bb(double d2, int i, long j) {
        double d3;
        long j2;
        this.g = d2 < 0.0d;
        if (this.g) {
            d3 = -d2;
        } else {
            d3 = d2;
        }
        this.a = d3;
        this.b = i;
        this.d = j;
        if (d2 > 1.0E18d) {
            j2 = 1000000000000000000L;
        } else {
            j2 = (long) d2;
        }
        this.f = j2;
        if (j == 0) {
            this.e = 0;
            this.c = 0;
        } else {
            int i2 = i;
            while (j % 10 == 0) {
                j /= 10;
                i2--;
            }
            this.e = j;
            this.c = i2;
        }
        Math.pow(10.0d, (double) i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bb(double r8, int r10) {
        /*
            r7 = this;
            if (r10 != 0) goto L_0x000b
            r0 = 0
        L_0x0003:
            long r4 = (long) r0
            r0 = r7
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r4)
            return
        L_0x000b:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            double r0 = -r8
        L_0x0012:
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r4 = (double) r10
            double r2 = java.lang.Math.pow(r2, r4)
            int r2 = (int) r2
            double r4 = (double) r2
            double r0 = r0 * r4
            long r0 = java.lang.Math.round(r0)
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
            goto L_0x0003
        L_0x0024:
            r0 = r8
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.<init>(double, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bb(double r12) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.<init>(double):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bb(java.lang.String r5) {
        /*
            r4 = this;
            double r2 = java.lang.Double.parseDouble(r5)
            java.lang.String r0 = r5.trim()
            r1 = 46
            int r1 = r0.indexOf(r1)
            int r1 = r1 + 1
            if (r1 != 0) goto L_0x0017
            r0 = 0
        L_0x0013:
            r4.<init>(r2, r0)
            return
        L_0x0017:
            int r0 = r0.length()
            int r0 = r0 - r1
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.<init>(java.lang.String):void");
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.a == bbVar.a && this.b == bbVar.b && this.d == bbVar.d;
    }

    @Deprecated
    public final int hashCode() {
        return (int) (this.d + ((long) ((this.b + ((int) (37.0d * this.a))) * 37)));
    }

    @Deprecated
    public final String toString() {
        return String.format(new StringBuilder(14).append("%.").append(this.b).append("f").toString(), Double.valueOf(this.a));
    }

    @Deprecated
    public final int intValue() {
        return (int) this.f;
    }

    @Deprecated
    public final long longValue() {
        return this.f;
    }

    @Deprecated
    public final float floatValue() {
        return (float) this.a;
    }

    @Deprecated
    public final double doubleValue() {
        return this.g ? -this.a : this.a;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        throw new NotSerializableException();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new NotSerializableException();
    }

    @Override // java.lang.Comparable
    @Deprecated
    public final /* synthetic */ int compareTo(Object obj) {
        bb bbVar = (bb) obj;
        if (this.f != bbVar.f) {
            return this.f < bbVar.f ? -1 : 1;
        }
        if (this.a != bbVar.a) {
            return this.a >= bbVar.a ? 1 : -1;
        }
        if (this.b != bbVar.b) {
            return this.b >= bbVar.b ? 1 : -1;
        }
        long j = this.d - bbVar.d;
        if (j != 0) {
            return j >= 0 ? 1 : -1;
        }
        return 0;
    }
}
