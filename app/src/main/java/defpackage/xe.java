package defpackage;

/* renamed from: xe reason: default package */
/* compiled from: PG */
public final class xe extends defpackage.ti {
    private final /* synthetic */ defpackage.xz a;

    public xe(defpackage.xz xzVar) {
        this.a = xzVar;
    }

    public final void b() {
        this.a.a.p.setVisibility(8);
        if (this.a.a.q != null) {
            this.a.a.q.dismiss();
        } else if (this.a.a.p.getParent() instanceof android.view.View) {
            defpackage.sn.a.g((android.view.View) this.a.a.p.getParent());
        }
        this.a.a.p.removeAllViews();
        this.a.a.s.a((defpackage.th) null);
        this.a.a.s = null;
    }
}
