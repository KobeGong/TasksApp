package defpackage;

/* renamed from: dlg reason: default package */
/* compiled from: PG */
final class dlg extends defpackage.dlh {
    dlg(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    public final void a(long j, byte b) {
        this.a.putByte(j, b);
    }

    public final byte a(java.lang.Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    public final void a(java.lang.Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    public final boolean b(java.lang.Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public final void a(java.lang.Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public final float c(java.lang.Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    public final void a(java.lang.Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public final double d(java.lang.Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public final void a(java.lang.Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public final void a(byte[] bArr, long j, long j2, long j3) {
        this.a.copyMemory(bArr, defpackage.dlc.d + j, null, j2, j3);
    }
}
