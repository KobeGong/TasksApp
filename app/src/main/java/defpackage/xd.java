package defpackage;

import android.view.View;

/* renamed from: xd  reason: default package */
/* compiled from: PG */
final class xd extends ti {
    private final /* synthetic */ wz a;

    xd(wz wzVar) {
        this.a = wzVar;
    }

    @Override // defpackage.th, defpackage.ti
    public final void a() {
        this.a.p.setVisibility(0);
        this.a.p.sendAccessibilityEvent(32);
        if (this.a.p.getParent() instanceof View) {
            sn.a.g((View) this.a.p.getParent());
        }
    }

    @Override // defpackage.th, defpackage.ti
    public final void b() {
        this.a.p.setAlpha(1.0f);
        this.a.s.a((th) null);
        this.a.s = null;
    }
}
