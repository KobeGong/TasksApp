package defpackage;

/* renamed from: acn  reason: default package */
/* compiled from: PG */
public final class acn {
    public long a = 0;
    public acn b;

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
            this.b = new acn();
        }
    }

    /* access modifiers changed from: package-private */
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

    /* access modifiers changed from: package-private */
    public final boolean c(int i) {
        while (i >= 64) {
            this.a();
            this = this.b;
            i -= 64;
        }
        return (this.a & (1 << i)) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, boolean z) {
        while (true) {
            if (i >= 64) {
                this.a();
                this = this.b;
                i -= 64;
            } else {
                boolean z2 = (this.a & Long.MIN_VALUE) != 0;
                long j = (1 << i) - 1;
                this.a = (((j ^ -1) & this.a) << 1) | (this.a & j);
                if (z) {
                    this.a(i);
                } else {
                    this.b(i);
                }
                if (z2 || this.b != null) {
                    this.a();
                    this = this.b;
                    i = 0;
                    z = z2;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
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
        this.a = Long.rotateRight((j2 ^ -1) & this.a, 1) | (this.a & j2);
        if (this.b != null) {
            if (this.b.c(0)) {
                this.a(63);
            }
            this.b.d(0);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final int e(int i) {
        if (this.b == null) {
            if (i >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else {
            return this.b.e(i - 64) + Long.bitCount(this.a);
        }
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
