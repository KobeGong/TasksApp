package defpackage;

/* renamed from: dvo reason: default package */
/* compiled from: PG */
final class dvo implements defpackage.dpa {
    dvo() {
    }

    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        if (bArr.length >= 3) {
            return java.lang.Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        java.lang.String str = "Malformed status code ";
        java.lang.String valueOf = java.lang.String.valueOf(new java.lang.String(bArr, defpackage.doh.a));
        throw new java.lang.NumberFormatException(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str));
    }

    public final /* synthetic */ byte[] a(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
