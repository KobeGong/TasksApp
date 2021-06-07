package defpackage;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: xz  reason: default package */
/* compiled from: PG */
public final class xz implements yd {
    public final /* synthetic */ wz a;
    private yd b;

    public xz(wz wzVar, yd ydVar) {
        this.a = wzVar;
        this.b = ydVar;
    }

    @Override // defpackage.yd
    public final boolean a(yc ycVar, Menu menu) {
        return this.b.a(ycVar, menu);
    }

    @Override // defpackage.yd
    public final boolean b(yc ycVar, Menu menu) {
        return this.b.b(ycVar, menu);
    }

    @Override // defpackage.yd
    public final boolean a(yc ycVar, MenuItem menuItem) {
        return this.b.a(ycVar, menuItem);
    }

    @Override // defpackage.yd
    public final void a(yc ycVar) {
        this.b.a(ycVar);
        if (this.a.q != null) {
            this.a.c.getDecorView().removeCallbacks(this.a.r);
        }
        if (this.a.p != null) {
            this.a.p();
            this.a.s = sn.b(this.a.p).a(0.0f);
            this.a.s.a(new xe(this));
        }
        if (this.a.e != null) {
            wn wnVar = this.a.e;
            yc ycVar2 = this.a.o;
            wnVar.e();
        }
        this.a.o = null;
    }
}
