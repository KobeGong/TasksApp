package defpackage;

/* renamed from: cfg reason: default package */
final /* synthetic */ class cfg implements defpackage.uy {
    private final defpackage.cff a;
    private final float b;

    cfg(defpackage.cff cff, float f) {
        this.a = cff;
        this.b = f;
    }

    public final void a(android.support.v4.widget.NestedScrollView nestedScrollView, int i, int i2) {
        int color;
        int i3 = 0;
        defpackage.cff cff = this.a;
        float f = this.b;
        boolean z = ((float) i) >= f;
        android.view.View a2 = cff.a();
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            if (z) {
                color = cff.getResources().getColor(2131624092);
            } else {
                color = cff.getResources().getColor(2131624091);
            }
            a2.setBackgroundColor(color);
            defpackage.sn.a(a2, z ? f : 0.0f);
            return;
        }
        android.view.View findViewById = cff.findViewById(2131755230);
        if (findViewById != null) {
            if (!z) {
                i3 = 8;
            }
            findViewById.setVisibility(i3);
        }
    }
}
