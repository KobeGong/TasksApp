package defpackage;

/* renamed from: dou reason: default package */
/* compiled from: PG */
final class dou extends defpackage.doy {
    private final defpackage.dov c;

    dou(java.lang.String str, defpackage.dov dov) {
        boolean z = false;
        super(str, false);
        if (!str.endsWith("-bin")) {
            z = true;
        }
        defpackage.cld.a(z, "ASCII header is named %s.  Only binary headers may end with %s", (java.lang.Object) str, (java.lang.Object) "-bin");
        this.c = (defpackage.dov) defpackage.cld.a((java.lang.Object) dov, (java.lang.Object) "marshaller");
    }

    /* access modifiers changed from: 0000 */
    public final byte[] a(java.lang.Object obj) {
        return this.c.a(obj).getBytes(defpackage.crp.a);
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object a(byte[] bArr) {
        return this.c.a(new java.lang.String(bArr, defpackage.crp.a));
    }
}
