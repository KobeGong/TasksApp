package defpackage;

import com.google.android.apps.tasks.common.TaskApplication;

/* renamed from: ait  reason: default package */
/* compiled from: PG */
public final class ait implements dmm {
    private aij a;
    private brg b;
    private bth c;
    private ecz d;
    private btd e;
    private bte f;
    private btg g;
    private ecz h;
    private btc i;
    private btf j;
    private ecz k;

    public ait(aiv aiv) {
        this.a = new aij(aiv.a);
        this.b = new brg(aiv.b, this.a);
        this.c = new bth(aiv.c);
        this.d = dmr.a(new ceg(aiv.d, this.b, this.c));
        this.e = new btd(aiv.c, this.a);
        this.f = new bte(aiv.c);
        this.g = new btg(aiv.c);
        this.h = dmr.a(new cef(aiv.d, this.a, this.d, this.e, this.f, this.g));
        this.i = new btc(aiv.c, this.a);
        this.j = new btf(aiv.c);
        this.k = dmr.a(new ceh(aiv.d, this.d, this.i, this.e, this.f, this.j, this.g));
    }

    @Override // defpackage.dmm
    public final /* synthetic */ void a(Object obj) {
        TaskApplication taskApplication = (TaskApplication) obj;
        dmq.a(cta.a);
        dmq.a(cta.a);
        dmq.a(cta.a);
        dmq.a(cta.a);
        dmq.a(cta.a);
        taskApplication.f = false;
        dmq.a(cta.a);
        taskApplication.d = (cdj) this.h.a();
        taskApplication.e = (cdw) this.k.a();
    }
}
