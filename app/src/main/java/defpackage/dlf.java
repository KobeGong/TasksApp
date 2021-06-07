package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: dlf  reason: default package */
/* compiled from: PG */
final class dlf extends dlh {
    dlf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.dlh
    public final void a(long j, byte b) {
        Memory.pokeByte(j, b);
    }

    @Override // defpackage.dlh
    public final byte a(Object obj, long j) {
        if (dlc.e) {
            return dlc.g(obj, j);
        }
        return dlc.h(obj, j);
    }

    @Override // defpackage.dlh
    public final void a(Object obj, long j, byte b) {
        if (dlc.e) {
            dlc.a(obj, j, b);
        } else {
            dlc.b(obj, j, b);
        }
    }

    @Override // defpackage.dlh
    public final boolean b(Object obj, long j) {
        if (dlc.e) {
            return dlc.i(obj, j);
        }
        return dlc.j(obj, j);
    }

    @Override // defpackage.dlh
    public final void a(Object obj, long j, boolean z) {
        if (dlc.e) {
            dlc.b(obj, j, z);
        } else {
            dlc.c(obj, j, z);
        }
    }

    @Override // defpackage.dlh
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(e(obj, j));
    }

    @Override // defpackage.dlh
    public final void a(Object obj, long j, float f) {
        a(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.dlh
    public final double d(Object obj, long j) {
        return Double.longBitsToDouble(f(obj, j));
    }

    @Override // defpackage.dlh
    public final void a(Object obj, long j, double d) {
        a(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.dlh
    public final void a(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
    }
}
