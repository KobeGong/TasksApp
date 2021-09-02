package defpackage;

/* renamed from: dow reason: default package */
/* compiled from: PG */
final class dow extends defpackage.doy {
    private final defpackage.dox c;

    dow(java.lang.String str, defpackage.dox dox) {
        boolean z = false;
        super(str, false);
        defpackage.cld.a(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", (java.lang.Object) str, (java.lang.Object) "-bin");
        if (str.length() > 4) {
            z = true;
        }
        defpackage.cld.a(z, (java.lang.Object) "empty key name");
        this.c = (defpackage.dox) defpackage.cld.a((java.lang.Object) dox, (java.lang.Object) "marshaller is null");
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
