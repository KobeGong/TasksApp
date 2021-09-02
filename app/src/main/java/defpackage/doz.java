package defpackage;

/* renamed from: doz reason: default package */
/* compiled from: PG */
final class doz extends defpackage.doy {
    private final defpackage.dpa c;

    doz(java.lang.String str, boolean z, defpackage.dpa dpa) {
        super(str, z);
        defpackage.cld.a(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", (java.lang.Object) str, (java.lang.Object) "-bin");
        this.c = (defpackage.dpa) defpackage.cld.a((java.lang.Object) dpa, (java.lang.Object) "marshaller");
    }

    /* access modifiers changed from: 0000 */
    public final byte[] a(java.lang.Object obj) {
        return this.c.a(obj);
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object a(byte[] bArr) {
        return this.c.a(bArr);
    }
}
