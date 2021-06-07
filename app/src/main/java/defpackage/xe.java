package defpackage;

import android.view.View;

/* renamed from: xe  reason: default package */
/* compiled from: PG */
public final class xe extends ti {
    private final /* synthetic */ xz a;

    public xe(xz xzVar) {
        this.a = xzVar;
    }

    @Override // defpackage.th, defpackage.ti
    public final void b() {
        this.a.a.p.setVisibility(8);
        if (this.a.a.q != null) {
            this.a.a.q.dismiss();
        } else if (this.a.a.p.getParent() instanceof View) {
            sn.a.g((View) this.a.a.p.getParent());
        }
        this.a.a.p.removeAllViews();
        this.a.a.s.a((th) null);
        this.a.a.s = null;
    }
}
