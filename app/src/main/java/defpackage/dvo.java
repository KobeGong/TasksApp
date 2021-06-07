package defpackage;

/* renamed from: dvo  reason: default package */
/* compiled from: PG */
final class dvo implements dpa {
    dvo() {
    }

    @Override // defpackage.dpa
    public final /* synthetic */ Object a(byte[] bArr) {
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        String valueOf = String.valueOf(new String(bArr, doh.a));
        throw new NumberFormatException(valueOf.length() != 0 ? "Malformed status code ".concat(valueOf) : new String("Malformed status code "));
    }

    @Override // defpackage.dpa
    public final /* synthetic */ byte[] a(Object obj) {
        throw new UnsupportedOperationException();
    }
}
