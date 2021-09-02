package defpackage;

/* renamed from: cgm reason: default package */
/* compiled from: PG */
final class cgm implements defpackage.cgk {
    public final /* synthetic */ android.app.Application a;
    private final /* synthetic */ defpackage.cli b;
    private final /* synthetic */ defpackage.cjw c;
    private final /* synthetic */ defpackage.clt d;
    private final /* synthetic */ defpackage.clt e;
    private final /* synthetic */ defpackage.clt f;

    cgm(android.app.Application application, defpackage.cli cli, defpackage.cjw cjw, defpackage.clt clt, defpackage.clt clt2, defpackage.clt clt3) {
        this.a = application;
        this.b = cli;
        this.c = cjw;
        this.d = clt;
        this.e = clt2;
        this.f = clt3;
    }

    public final defpackage.cjh a() {
        defpackage.cji cji = new defpackage.cji(this.a, new defpackage.cke(null, 0, this.b.d));
        defpackage.cjj cjj = new defpackage.cjj(cji, java.util.concurrent.Executors.newSingleThreadExecutor(new defpackage.ckg("Primes-init", 0)), this.c, this.d, this.e, this.f, new defpackage.cgq(defpackage.cha.a(cji.a)), new defpackage.cjm(defpackage.cha.a(cji.a), cji.b), true);
        defpackage.cha.a(this.a);
        new defpackage.cgn(this);
        cjj.run();
        return cji;
    }
}
