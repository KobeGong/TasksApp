package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: ez  reason: default package */
/* compiled from: PG */
public final class ez extends ze {
    public ez(Context context) {
        super(context);
    }

    @Override // android.view.Menu, defpackage.ze
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        zi ziVar = (zi) a(i, i2, i3, charSequence);
        fj fjVar = new fj(this.a, this, ziVar);
        ziVar.a(fjVar);
        return fjVar;
    }
}
