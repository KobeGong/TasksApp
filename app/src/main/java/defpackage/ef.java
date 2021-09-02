package defpackage;

/* renamed from: ef reason: default package */
/* compiled from: PG */
final class ef implements android.view.View.OnClickListener {
    private final /* synthetic */ defpackage.ee a;

    ef(defpackage.ee eeVar) {
        this.a = eeVar;
    }

    public final void onClick(android.view.View view) {
        if (this.a.a && this.a.isShowing()) {
            defpackage.ee eeVar = this.a;
            if (!eeVar.c) {
                android.content.res.TypedArray obtainStyledAttributes = eeVar.getContext().obtainStyledAttributes(new int[]{16843611});
                eeVar.b = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                eeVar.c = true;
            }
            if (eeVar.b) {
                this.a.cancel();
            }
        }
    }
}
