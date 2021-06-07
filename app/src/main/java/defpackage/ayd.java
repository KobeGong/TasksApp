package defpackage;

/* renamed from: ayd  reason: default package */
/* compiled from: PG */
public final class ayd {
    public final ayf a;
    public final String b;
    private final ayh c;

    public ayd(String str, ayf ayf, ayh ayh) {
        azb.b(ayf, "Cannot construct an Api with a null ClientBuilder");
        azb.b(ayh, "Cannot construct an Api with a null ClientKey");
        this.b = str;
        this.a = ayf;
        this.c = ayh;
    }

    public final ayf a() {
        azb.a(this.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }

    public final ayh b() {
        if (this.c != null) {
            return this.c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
