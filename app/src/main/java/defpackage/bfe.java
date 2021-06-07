package defpackage;

import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: bfe  reason: default package */
/* compiled from: PG */
public final class bfe extends bfd {
    private final byte[] a;

    bfe(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.bfd
    public final byte[] c() {
        return this.a;
    }
}
