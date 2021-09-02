package defpackage;

/* renamed from: bfe reason: default package */
/* compiled from: PG */
final class bfe extends defpackage.bfd {
    private final byte[] a;

    bfe(byte[] bArr) {
        super(java.util.Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    /* access modifiers changed from: 0000 */
    public final byte[] c() {
        return this.a;
    }
}
