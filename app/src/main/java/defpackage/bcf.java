package defpackage;

/* renamed from: bcf reason: default package */
/* compiled from: PG */
final class bcf extends defpackage.bas {
    private /* synthetic */ android.app.Dialog a;
    private /* synthetic */ defpackage.bce b;

    bcf(defpackage.bce bce, android.app.Dialog dialog) {
        this.b = bce;
        this.a = dialog;
    }

    public final void a() {
        this.b.a.f();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
