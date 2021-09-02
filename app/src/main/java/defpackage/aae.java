package defpackage;

/* renamed from: aae reason: default package */
/* compiled from: PG */
final class aae extends defpackage.zy implements android.view.SubMenu {
    aae(android.content.Context context, defpackage.pq pqVar) {
        super(context, pqVar);
    }

    public final android.view.SubMenu setHeaderTitle(int i) {
        ((defpackage.pq) this.d).setHeaderTitle(i);
        return this;
    }

    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        ((defpackage.pq) this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final android.view.SubMenu setHeaderIcon(int i) {
        ((defpackage.pq) this.d).setHeaderIcon(i);
        return this;
    }

    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        ((defpackage.pq) this.d).setHeaderIcon(drawable);
        return this;
    }

    public final android.view.SubMenu setHeaderView(android.view.View view) {
        ((defpackage.pq) this.d).setHeaderView(view);
        return this;
    }

    public final void clearHeader() {
        ((defpackage.pq) this.d).clearHeader();
    }

    public final android.view.SubMenu setIcon(int i) {
        ((defpackage.pq) this.d).setIcon(i);
        return this;
    }

    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        ((defpackage.pq) this.d).setIcon(drawable);
        return this;
    }

    public final android.view.MenuItem getItem() {
        return a(((defpackage.pq) this.d).getItem());
    }
}
