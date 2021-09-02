package defpackage;

/* renamed from: acn reason: default package */
/* compiled from: PG */
public final class acn {
    public long a = 0;
    public defpackage.acn b;

    acn() {
    }

    public final void a(int i) {
        while (i >= 64) {
            this.a();
            this = this.b;
            i -= 64;
        }
        this.a |= 1 << i;
    }

    private final void a() {
        if (this.b == null) {
            this.b = new defpackage.acn();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        while (i >= 64) {
            if (this.b != null) {
                this = this.b;
                i -= 64;
            } else {
                return;
            }
        }
        this.a &= (1 << i) ^ -1;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c(int i) {
        while (i >= 64) {
            this.a();
            this = this.b;
            i -= 64;
        }
        return (this.a & (1 << i)) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, boolean z) {
        while (true) {
            if (i >= 64) {
                r10.a();
                r10 = r10.b;
                i -= 64;
            } else {
                boolean z2 = (r10.a & Long.MIN_VALUE) != 0;
                long j = (1 << i) - 1;
                r10.a = (((j ^ -1) & r10.a) << 1) | (r10.a & j);
                if (z) {
                    r10.a(i);
                } else {
                    r10.b(i);
                }
                if (z2 || r10.b != null) {
                    r10.a();
                    r10 = r10.b;
                    i = 0;
                    z = z2;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean d(int i) {
        while (i >= 64) {
            this.a();
            this = this.b;
            i -= 64;
        }
        long j = 1 << i;
        boolean z = (this.a & j) != 0;
        this.a &= j ^ -1;
        long j2 = j - 1;
        this.a = java.lang.Long.rotateRight((j2 ^ -1) & this.a, 1) | (this.a & j2);
        if (this.b != null) {
            if (this.b.c(0)) {
                this.a(63);
            }
            this.b.d(0);
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final int e(int i) {
        if (this.b == null) {
            if (i >= 64) {
                return java.lang.Long.bitCount(this.a);
            }
            return java.lang.Long.bitCount(this.a & ((1 << i) - 1));
        } else if (i < 64) {
            return java.lang.Long.bitCount(this.a & ((1 << i) - 1));
        } else {
            return this.b.e(i - 64) + java.lang.Long.bitCount(this.a);
        }
    }

    public final java.lang.String toString() {
        if (this.b == null) {
            return java.lang.Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + java.lang.Long.toBinaryString(this.a);
    }
}
