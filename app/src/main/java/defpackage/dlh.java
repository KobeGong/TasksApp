package defpackage;

/* renamed from: dlh reason: default package */
/* compiled from: PG */
abstract class dlh {
    public sun.misc.Unsafe a;

    dlh(sun.misc.Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(java.lang.Object obj, long j);

    public abstract void a(long j, byte b);

    public abstract void a(java.lang.Object obj, long j, byte b);

    public abstract void a(java.lang.Object obj, long j, double d);

    public abstract void a(java.lang.Object obj, long j, float f);

    public abstract void a(java.lang.Object obj, long j, boolean z);

    public abstract void a(byte[] bArr, long j, long j2, long j3);

    public abstract boolean b(java.lang.Object obj, long j);

    public abstract float c(java.lang.Object obj, long j);

    public abstract double d(java.lang.Object obj, long j);

    public final int e(java.lang.Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final void a(java.lang.Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final long f(java.lang.Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final void a(java.lang.Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }
}
