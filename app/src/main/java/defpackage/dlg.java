package defpackage;

import sun.misc.Unsafe;

/* renamed from: dlg  reason: default package */
/* compiled from: PG */
final class dlg extends dlh {
    dlg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.dlh
    public final void a(long j, byte b) {
        this.a.putByte(j, b);
    }

    @Override // defpackage.dlh
    public final byte a(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    @Override // defpackage.dlh
    public final void a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // defpackage.dlh
    public final boolean b(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    @Override // defpackage.dlh
    public final void a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // defpackage.dlh
    public final float c(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    @Override // defpackage.dlh
    public final void a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // defpackage.dlh
    public final double d(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    @Override // defpackage.dlh
    public final void a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // defpackage.dlh
    public final void a(byte[] bArr, long j, long j2, long j3) {
        this.a.copyMemory(bArr, dlc.d + j, (Object) null, j2, j3);
    }
}
