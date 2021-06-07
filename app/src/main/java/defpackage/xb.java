package defpackage;

/* renamed from: xb  reason: default package */
/* compiled from: PG */
final class xb implements Runnable {
    public final /* synthetic */ wz a;

    xb(wz wzVar) {
        this.a = wzVar;
    }

    public final void run() {
        this.a.q.showAtLocation(this.a.p, 55, 0, 0);
        this.a.p();
        if (this.a.o()) {
            this.a.p.setAlpha(0.0f);
            this.a.s = sn.b(this.a.p).a(1.0f);
            this.a.s.a(new xc(this));
            return;
        }
        this.a.p.setAlpha(1.0f);
        this.a.p.setVisibility(0);
    }
}
