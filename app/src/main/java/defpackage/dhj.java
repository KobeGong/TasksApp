package defpackage;

/* renamed from: dhj reason: default package */
/* compiled from: PG */
public abstract class dhj {
    private static volatile boolean e = false;
    public int a;
    public int b = 100;
    public int c = Integer.MAX_VALUE;
    public defpackage.dhm d;

    public static defpackage.dhj a(java.io.InputStream inputStream) {
        if (inputStream != null) {
            return new defpackage.dhl(inputStream);
        }
        byte[] bArr = defpackage.dim.b;
        return a(bArr, 0, bArr.length, false);
    }

    public abstract int a();

    public abstract defpackage.djo a(defpackage.djx djx, defpackage.dhw dhw);

    public abstract void a(int i);

    public abstract double b();

    public abstract boolean b(int i);

    public abstract float c();

    public abstract int c(int i);

    public abstract long d();

    public abstract void d(int i);

    public abstract long e();

    public abstract void e(int i);

    public abstract int f();

    public abstract long g();

    public abstract int h();

    public abstract boolean i();

    public abstract java.lang.String j();

    public abstract java.lang.String k();

    public abstract defpackage.dha l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    /* access modifiers changed from: 0000 */
    public abstract long s();

    public abstract boolean t();

    public abstract int u();

    public static defpackage.dhj a(byte[] bArr, int i, int i2, boolean z) {
        defpackage.dhk dhk = new defpackage.dhk(bArr, i, i2);
        try {
            dhk.c(i2);
            return dhk;
        } catch (defpackage.dir e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    dhj() {
    }

    public static int f(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}
