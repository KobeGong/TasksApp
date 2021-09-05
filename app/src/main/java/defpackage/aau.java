package defpackage;

/* renamed from: aau reason: default package */
/* compiled from: PG */
final class aau extends defpackage.zr {
    private final /* synthetic */ defpackage.aap d;

    public aau(defpackage.aap aap, android.content.Context context, MenuBuilder zeVar, android.view.View view) {
        this.d = aap;
        super(context, zeVar, view, true);
        a((MenuPresenter_Callback) aap.m);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.d.c != null) {
            this.d.c.close();
        }
        this.d.j = null;
        super.d();
    }
}
