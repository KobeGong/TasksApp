package defpackage;

/* renamed from: xz reason: default package */
/* compiled from: PG */
public final class xz implements defpackage.yd {
    public final /* synthetic */ defpackage.wz a;
    private defpackage.yd b;

    public xz(defpackage.wz wzVar, defpackage.yd ydVar) {
        this.a = wzVar;
        this.b = ydVar;
    }

    public final boolean a(defpackage.yc ycVar, android.view.Menu menu) {
        return this.b.a(ycVar, menu);
    }

    public final boolean b(defpackage.yc ycVar, android.view.Menu menu) {
        return this.b.b(ycVar, menu);
    }

    public final boolean a(defpackage.yc ycVar, android.view.MenuItem menuItem) {
        return this.b.a(ycVar, menuItem);
    }

    public final void a(defpackage.yc ycVar) {
        this.b.a(ycVar);
        if (this.a.q != null) {
            this.a.c.getDecorView().removeCallbacks(this.a.r);
        }
        if (this.a.p != null) {
            this.a.p();
            this.a.s = ViewCompat.b(this.a.p).a(0.0f);
            this.a.s.a((defpackage.th) new defpackage.xe(this));
        }
        if (this.a.e != null) {
            defpackage.wn wnVar = this.a.e;
            defpackage.yc ycVar2 = this.a.o;
            wnVar.e();
        }
        this.a.o = null;
    }
}
