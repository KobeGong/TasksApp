package defpackage;

/* renamed from: xd reason: default package */
/* compiled from: PG */
final class xd extends defpackage.ti {
    private final /* synthetic */ defpackage.wz a;

    xd(defpackage.wz wzVar) {
        this.a = wzVar;
    }

    public final void a() {
        this.a.p.setVisibility(0);
        this.a.p.sendAccessibilityEvent(32);
        if (this.a.p.getParent() instanceof android.view.View) {
            defpackage.sn.a.g((android.view.View) this.a.p.getParent());
        }
    }

    public final void b() {
        this.a.p.setAlpha(1.0f);
        this.a.s.a((defpackage.th) null);
        this.a.s = null;
    }
}
