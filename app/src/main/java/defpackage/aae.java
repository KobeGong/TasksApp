package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aae  reason: default package */
/* compiled from: PG */
public final class aae extends zy implements SubMenu {
    aae(Context context, pq pqVar) {
        super(context, pqVar);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        ((pq) this.d).setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((pq) this.d).setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        ((pq) this.d).setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((pq) this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((pq) this.d).setHeaderView(view);
        return this;
    }

    public final void clearHeader() {
        ((pq) this.d).clearHeader();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        ((pq) this.d).setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        ((pq) this.d).setIcon(drawable);
        return this;
    }

    public final MenuItem getItem() {
        return a(((pq) this.d).getItem());
    }
}
