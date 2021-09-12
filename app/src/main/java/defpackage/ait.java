package defpackage;

/* renamed from: ait reason: default package */
/* compiled from: PG */
public final class ait implements defpackage.dmm {
    private final defpackage.aij a;
    private final defpackage.brg b;
    private final defpackage.bth c;
    private final defpackage.ecz d;
    private final defpackage.btd e;
    private final defpackage.bte f;
    private final defpackage.btg g;
    private final defpackage.ecz h;
    private final defpackage.btc i;
    private final defpackage.btf j;
    private final defpackage.ecz k;

    public ait(defpackage.aiv aiv) {
        this.a = new defpackage.aij(aiv.a);
        this.b = new defpackage.brg(aiv.b, this.a);
        this.c = new defpackage.bth(aiv.c);
        this.d = defpackage.dmr.a(new defpackage.ceg(aiv.d, this.b, this.c));
        this.e = new defpackage.btd(aiv.c, this.a);
        this.f = new defpackage.bte(aiv.c);
        this.g = new defpackage.btg(aiv.c);
        this.h = defpackage.dmr.a(new defpackage.cef(aiv.d, this.a, this.d, this.e, this.f, this.g));
        this.i = new defpackage.btc(aiv.c, this.a);
        this.j = new defpackage.btf(aiv.c);
        this.k = defpackage.dmr.a(new defpackage.ceh(aiv.d, this.d, this.i, this.e, this.f, this.j, this.g));
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        com.google.android.apps.tasks.common.TaskApplication taskApplication = (com.google.android.apps.tasks.common.TaskApplication) obj;
        defpackage.dmq.a(cta.a);
        defpackage.dmq.a(cta.a);
        defpackage.dmq.a(cta.a);
        defpackage.dmq.a(cta.a);
        defpackage.dmq.a(cta.a);
        taskApplication.f = false;
        defpackage.dmq.a(cta.a);
        taskApplication.d = (defpackage.cdj) this.h.a();
        taskApplication.e = (defpackage.cdw) this.k.a();
    }
}
