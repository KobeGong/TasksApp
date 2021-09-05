package defpackage;

/* renamed from: xb reason: default package */
/* compiled from: PG */
final class xb implements java.lang.Runnable {
    public final /* synthetic */ defpackage.wz a;

    xb(defpackage.wz wzVar) {
        this.a = wzVar;
    }

    public final void run() {
        this.a.q.showAtLocation(this.a.p, 55, 0, 0);
        this.a.p();
        if (this.a.o()) {
            this.a.p.setAlpha(0.0f);
            this.a.s = ViewCompat.b(this.a.p).a(1.0f);
            this.a.s.a((defpackage.th) new defpackage.xc(this));
            return;
        }
        this.a.p.setAlpha(1.0f);
        this.a.p.setVisibility(0);
    }
}
