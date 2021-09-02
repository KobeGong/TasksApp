package defpackage;

/* renamed from: cmq reason: default package */
/* compiled from: PG */
public final class cmq implements defpackage.clt {
    private final android.content.Context a;
    private final defpackage.cmn b = new defpackage.cmn();

    public cmq(android.content.Context context) {
        this.a = context;
    }

    public final /* synthetic */ java.lang.Object a() {
        return java.lang.Boolean.valueOf(this.b.a(this.a, "primes::shutdown_primes", false));
    }
}
