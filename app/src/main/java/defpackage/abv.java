package defpackage;

/* renamed from: abv reason: default package */
/* compiled from: PG */
final class abv extends android.widget.PopupWindow {
    private static final boolean a = (android.os.Build.VERSION.SDK_INT < 21);
    private boolean b;

    public abv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        defpackage.agw a2 = defpackage.agw.a(context, attributeSet, defpackage.xu.bI, i, i2);
        if (a2.f(defpackage.xu.bK)) {
            boolean a3 = a2.a(defpackage.xu.bK, false);
            if (a) {
                this.b = a3;
            } else {
                defpackage.vb.a((android.widget.PopupWindow) this, a3);
            }
        }
        setBackgroundDrawable(a2.a(defpackage.xu.bJ));
        a2.b.recycle();
    }

    public final void showAsDropDown(android.view.View view, int i, int i2) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public final void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(android.view.View view, int i, int i2, int i3, int i4) {
        int i5;
        if (!a || !this.b) {
            i5 = i2;
        } else {
            i5 = i2 - view.getHeight();
        }
        super.update(view, i, i5, i3, i4);
    }
}
