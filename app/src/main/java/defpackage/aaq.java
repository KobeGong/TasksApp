package defpackage;

/* renamed from: aaq reason: default package */
/* compiled from: PG */
final class aaq extends defpackage.zr {
    private final /* synthetic */ defpackage.aap d;

    public aaq(defpackage.aap aap, android.content.Context context, SubMenuBuilder aad, android.view.View view) {
        this.d = aap;
        super(context, aad, view, false);
        if (!((MenuItemImpl) aad.getItem()).f()) {
            this.a = aap.g == null ? (android.view.View) aap.e : aap.g;
        }
        a((MenuPresenter_Callback) aap.m);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.d.k = null;
        this.d.n = 0;
        super.d();
    }
}
