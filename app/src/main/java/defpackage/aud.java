package defpackage;

/* renamed from: aud reason: default package */
final /* synthetic */ class aud implements android.view.View.OnClickListener {
    private final defpackage.atx a;

    aud(defpackage.atx atx) {
        this.a = atx;
    }

    public final void onClick(android.view.View view) {
        defpackage.atx atx = this.a;
        if (atx.v != null) {
            atx.v.a(atx.d(), -1, true);
        }
    }
}
