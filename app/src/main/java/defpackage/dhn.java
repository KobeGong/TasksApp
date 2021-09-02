package defpackage;

/* renamed from: dhn reason: default package */
/* compiled from: PG */
public abstract class dhn extends defpackage.dgz {
    public static final boolean a = defpackage.dlc.c;
    private static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.dhn.class.getName());
    public defpackage.dlt b = this;

    public static int a(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public abstract void a(byte b2);

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, defpackage.dha dha);

    public abstract void a(int i, defpackage.djo djo);

    /* access modifiers changed from: 0000 */
    public abstract void a(int i, defpackage.djo djo, defpackage.dkh dkh);

    public abstract void a(int i, java.lang.String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(defpackage.dha dha);

    public abstract void a(defpackage.djo djo);

    /* access modifiers changed from: 0000 */
    public abstract void a(defpackage.djo djo, defpackage.dkh dkh);

    public abstract void a(java.lang.String str);

    /* access modifiers changed from: 0000 */
    public abstract void a(byte[] bArr, int i);

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, defpackage.dha dha);

    public abstract void b(int i, defpackage.djo djo);

    public abstract void c(int i);

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void c(byte[] bArr, int i, int i2);

    public abstract void e(int i);

    public abstract void e(int i, int i2);

    public abstract void h();

    public abstract int i();

    public static defpackage.dhn a(java.io.OutputStream outputStream, int i) {
        return new defpackage.dho(outputStream, i);
    }

    public static defpackage.dhn a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static defpackage.dhn b(byte[] bArr, int i, int i2) {
        return new defpackage.dhp(bArr, i, i2);
    }

    public static defpackage.dhn a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new defpackage.dhq(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new java.lang.IllegalArgumentException("ByteBuffer is read-only");
        } else if (defpackage.dlc.b) {
            return new defpackage.dht(byteBuffer);
        } else {
            return new defpackage.dhs(byteBuffer);
        }
    }

    dhn() {
    }

    public final void d(int i, int i2) {
        c(i, s(i2));
    }

    public final void b(int i, long j) {
        a(i, g(j));
    }

    public final void a(int i, float f) {
        e(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d) {
        c(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void d(int i) {
        c(s(i));
    }

    public final void b(long j) {
        a(g(j));
    }

    public final void a(float f) {
        e(java.lang.Float.floatToRawIntBits(f));
    }

    public final void a(double d) {
        c(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void a(boolean z) {
        a((byte) (z ? 1 : 0));
    }

    public static int f(int i, int i2) {
        return o(i << 3) + n(i2);
    }

    public static int g(int i, int i2) {
        return o(i << 3) + o(i2);
    }

    public static int h(int i, int i2) {
        return o(i << 3) + o(s(i2));
    }

    public static int f(int i) {
        return o(i << 3) + 4;
    }

    public static int g(int i) {
        return o(i << 3) + 4;
    }

    public static int d(int i, long j) {
        return o(i << 3) + e(j);
    }

    public static int e(int i, long j) {
        return o(i << 3) + e(j);
    }

    public static int f(int i, long j) {
        return o(i << 3) + e(g(j));
    }

    public static int h(int i) {
        return o(i << 3) + 8;
    }

    public static int i(int i) {
        return o(i << 3) + 8;
    }

    public static int j(int i) {
        return o(i << 3) + 4;
    }

    public static int k(int i) {
        return o(i << 3) + 8;
    }

    public static int l(int i) {
        return o(i << 3) + 1;
    }

    public static int i(int i, int i2) {
        return o(i << 3) + n(i2);
    }

    public static int b(int i, java.lang.String str) {
        return o(i << 3) + b(str);
    }

    public static int c(int i, defpackage.dha dha) {
        int o = o(i << 3);
        int a2 = dha.a();
        return o + a2 + o(a2);
    }

    public static int a(int i, defpackage.dix dix) {
        int i2;
        int o = o(i << 3);
        if (dix.c != null) {
            i2 = dix.c.a();
        } else if (dix.b != null) {
            i2 = dix.b.f();
        } else {
            i2 = 0;
        }
        return i2 + o(i2) + o;
    }

    public static int c(int i, defpackage.djo djo) {
        return o(i << 3) + b(djo);
    }

    static int b(int i, defpackage.djo djo, defpackage.dkh dkh) {
        return o(i << 3) + b(djo, dkh);
    }

    public static int d(int i, defpackage.dha dha) {
        return (o(8) << 1) + g(2, i) + c(3, dha);
    }

    public static int m(int i) {
        return o(i << 3);
    }

    public static int n(int i) {
        if (i >= 0) {
            return o(i);
        }
        return 10;
    }

    public static int o(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    public static int p(int i) {
        return o(s(i));
    }

    public static int a() {
        return 4;
    }

    public static int b() {
        return 4;
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(long j) {
        long j2;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j2 = j >>> 28;
        } else {
            j2 = j;
        }
        if ((-2097152 & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        if ((j2 & -16384) != 0) {
            return i + 1;
        }
        return i;
    }

    public static int f(long j) {
        return e(g(j));
    }

    public static int c() {
        return 8;
    }

    public static int d() {
        return 8;
    }

    public static int e() {
        return 4;
    }

    public static int f() {
        return 8;
    }

    public static int g() {
        return 1;
    }

    public static int q(int i) {
        return n(i);
    }

    public static int b(java.lang.String str) {
        int length;
        try {
            length = defpackage.dli.a((java.lang.CharSequence) str);
        } catch (defpackage.dll e) {
            length = str.getBytes(defpackage.dim.a).length;
        }
        return length + o(length);
    }

    public static int a(defpackage.dix dix) {
        int i;
        if (dix.c != null) {
            i = dix.c.a();
        } else if (dix.b != null) {
            i = dix.b.f();
        } else {
            i = 0;
        }
        return i + o(i);
    }

    public static int b(defpackage.dha dha) {
        int a2 = dha.a();
        return a2 + o(a2);
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return length + o(length);
    }

    public static int b(defpackage.djo djo) {
        int f = djo.f();
        return f + o(f);
    }

    static int b(defpackage.djo djo, defpackage.dkh dkh) {
        defpackage.dgo dgo = (defpackage.dgo) djo;
        int c2 = dgo.c();
        if (c2 == -1) {
            c2 = dkh.b(dgo);
            dgo.b(c2);
        }
        return c2 + o(c2);
    }

    static int r(int i) {
        return o(i) + i;
    }

    private static int s(int i) {
        return (i << 1) ^ (i >> 31);
    }

    private static long g(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public final void j() {
        if (i() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.String str, defpackage.dll dll) {
        c.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dll);
        byte[] bytes = str.getBytes(defpackage.dim.a);
        try {
            c(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new defpackage.dhr((java.lang.Throwable) e);
        } catch (defpackage.dhr e2) {
            throw e2;
        }
    }

    @java.lang.Deprecated
    static int c(int i, defpackage.djo djo, defpackage.dkh dkh) {
        int o = o(i << 3) << 1;
        defpackage.dgo dgo = (defpackage.dgo) djo;
        int c2 = dgo.c();
        if (c2 == -1) {
            c2 = dkh.b(dgo);
            dgo.b(c2);
        }
        return c2 + o;
    }

    @java.lang.Deprecated
    public static int c(defpackage.djo djo) {
        return djo.f();
    }
}
