package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ahm  reason: default package */
/* compiled from: PG */
public final class ahm {
    public int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;

    ahm() {
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.a |= i;
    }

    private static int a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        if (i == i2) {
            return 2;
        }
        return 4;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if ((this.a & 7) != 0 && (this.a & a(this.d, this.b)) == 0) {
            return false;
        }
        if ((this.a & 112) != 0 && (this.a & (a(this.d, this.c) << 4)) == 0) {
            return false;
        }
        if ((this.a & 1792) != 0 && (this.a & (a(this.e, this.b) << 8)) == 0) {
            return false;
        }
        if ((this.a & 28672) == 0 || (this.a & (a(this.e, this.c) << 12)) != 0) {
            return true;
        }
        return false;
    }
}
