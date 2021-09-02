package defpackage;

/* renamed from: ayd reason: default package */
/* compiled from: PG */
public final class ayd {
    public final defpackage.ayf a;
    public final java.lang.String b;
    private final defpackage.ayh c;

    public ayd(java.lang.String str, defpackage.ayf ayf, defpackage.ayh ayh) {
        defpackage.azb.b((java.lang.Object) ayf, (java.lang.Object) "Cannot construct an Api with a null ClientBuilder");
        defpackage.azb.b((java.lang.Object) ayh, (java.lang.Object) "Cannot construct an Api with a null ClientKey");
        this.b = str;
        this.a = ayf;
        this.c = ayh;
    }

    public final defpackage.ayf a() {
        defpackage.azb.a(this.a != null, (java.lang.Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }

    public final defpackage.ayh b() {
        if (this.c != null) {
            return this.c;
        }
        throw new java.lang.IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
