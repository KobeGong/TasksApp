package defpackage;

/* renamed from: dhi  reason: default package */
/* compiled from: PG */
final class dhi implements dhd {
    dhi() {
    }

    @Override // defpackage.dhd
    public final byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
