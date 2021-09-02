package defpackage;

/* renamed from: ahe reason: default package */
/* compiled from: PG */
final class ahe implements android.view.View.OnClickListener {
    private final defpackage.yp a = new defpackage.yp(this.b.a.getContext(), this.b.d);
    private final /* synthetic */ defpackage.acr b;

    ahe(defpackage.acr acr) {
        this.b = acr;
    }

    public final void onClick(android.view.View view) {
        if (this.b.e != null && this.b.f) {
            this.b.e.onMenuItemSelected(0, this.a);
        }
    }
}
