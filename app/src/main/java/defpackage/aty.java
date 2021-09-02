package defpackage;

/* renamed from: aty reason: default package */
final /* synthetic */ class aty implements android.view.View.OnClickListener {
    private final defpackage.atx a;

    aty(defpackage.atx atx) {
        this.a = atx;
    }

    public final void onClick(android.view.View view) {
        boolean z = true;
        float f = 1.0f;
        defpackage.atx atx = this.a;
        boolean z2 = atx.z == 1.0f;
        com.google.android.apps.tasks.ui.components.FancyCheckboxView fancyCheckboxView = atx.t;
        if (z2) {
            f = 0.0f;
        }
        fancyCheckboxView.a(f);
        if (atx.v != null) {
            defpackage.aug aug = atx.v;
            int d = atx.d();
            if (z2) {
                z = false;
            }
            aug.a.a(d, z);
        }
    }
}
