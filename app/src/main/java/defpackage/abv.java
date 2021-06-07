package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* access modifiers changed from: package-private */
/* renamed from: abv  reason: default package */
/* compiled from: PG */
public final class abv extends PopupWindow {
    private static final boolean a = (Build.VERSION.SDK_INT < 21);
    private boolean b;

    public abv(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        agw a2 = agw.a(context, attributeSet, xu.bI, i, i2);
        if (a2.f(xu.bK)) {
            boolean a3 = a2.a(xu.bK, false);
            if (a) {
                this.b = a3;
            } else {
                vb.a(this, a3);
            }
        }
        setBackgroundDrawable(a2.a(xu.bJ));
        a2.b.recycle();
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        int i5;
        if (!a || !this.b) {
            i5 = i2;
        } else {
            i5 = i2 - view.getHeight();
        }
        super.update(view, i, i5, i3, i4);
    }
}
