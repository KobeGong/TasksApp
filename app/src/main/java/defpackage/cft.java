package defpackage;

/* renamed from: cft reason: default package */
/* compiled from: PG */
public final class cft extends defpackage.cfc {
    private java.lang.ref.WeakReference W;

    public final void b(android.view.View view) {
        defpackage.cky.a((java.lang.Object) view);
        if (this.V != null) {
            ((defpackage.cfm) this.V).a(view);
        } else {
            this.W = new java.lang.ref.WeakReference(view);
        }
    }

    public final void u() {
        if (this.V != null) {
            ((defpackage.cfm) this.V).f.removeAllViews();
        }
        super.u();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.cff N() {
        defpackage.cfm cfm = new defpackage.cfm(getContext());
        android.view.View view = this.W != null ? (android.view.View) this.W.get() : null;
        if (view != null) {
            cfm.a(view);
            this.W = null;
        }
        return cfm;
    }
}
