package defpackage;

/* renamed from: dlf reason: default package */
/* compiled from: PG */
final class dlf extends defpackage.dlh {
    dlf(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    public final void a(long j, byte b) {
        libcore.io.Memory.pokeByte(j, b);
    }

    public final byte a(java.lang.Object obj, long j) {
        if (defpackage.dlc.e) {
            return defpackage.dlc.g(obj, j);
        }
        return defpackage.dlc.h(obj, j);
    }

    public final void a(java.lang.Object obj, long j, byte b) {
        if (defpackage.dlc.e) {
            defpackage.dlc.a(obj, j, b);
        } else {
            defpackage.dlc.b(obj, j, b);
        }
    }

    public final boolean b(java.lang.Object obj, long j) {
        if (defpackage.dlc.e) {
            return defpackage.dlc.i(obj, j);
        }
        return defpackage.dlc.j(obj, j);
    }

    public final void a(java.lang.Object obj, long j, boolean z) {
        if (defpackage.dlc.e) {
            defpackage.dlc.b(obj, j, z);
        } else {
            defpackage.dlc.c(obj, j, z);
        }
    }

    public final float c(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(e(obj, j));
    }

    public final void a(java.lang.Object obj, long j, float f) {
        a(obj, j, java.lang.Float.floatToIntBits(f));
    }

    public final double d(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(f(obj, j));
    }

    public final void a(java.lang.Object obj, long j, double d) {
        a(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    public final void a(byte[] bArr, long j, long j2, long j3) {
        libcore.io.Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
    }
}
