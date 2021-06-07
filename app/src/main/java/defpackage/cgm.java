package defpackage;

import android.app.Application;
import java.util.concurrent.Executors;

/* access modifiers changed from: package-private */
/* renamed from: cgm  reason: default package */
/* compiled from: PG */
public final class cgm implements cgk {
    public final /* synthetic */ Application a;
    private final /* synthetic */ cli b;
    private final /* synthetic */ cjw c;
    private final /* synthetic */ clt d;
    private final /* synthetic */ clt e;
    private final /* synthetic */ clt f;

    cgm(Application application, cli cli, cjw cjw, clt clt, clt clt2, clt clt3) {
        this.a = application;
        this.b = cli;
        this.c = cjw;
        this.d = clt;
        this.e = clt2;
        this.f = clt3;
    }

    @Override // defpackage.cgk
    public final cjh a() {
        cji cji = new cji(this.a, new cke(null, 0, this.b.d));
        cjj cjj = new cjj(cji, Executors.newSingleThreadExecutor(new ckg("Primes-init", 0)), this.c, this.d, this.e, this.f, new cgq(cha.a(cji.a)), new cjm(cha.a(cji.a), cji.b), true);
        cha.a(this.a);
        new cgn(this);
        cjj.run();
        return cji;
    }
}
