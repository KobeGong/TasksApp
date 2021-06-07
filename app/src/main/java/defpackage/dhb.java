package defpackage;

import java.util.Arrays;

/* renamed from: dhb  reason: default package */
/* compiled from: PG */
final class dhb implements dhd {
    dhb() {
    }

    @Override // defpackage.dhd
    public final byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i + i2);
    }
}
