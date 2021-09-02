package defpackage;

/* renamed from: aad reason: default package */
/* compiled from: PG */
public class aad extends defpackage.ze implements android.view.SubMenu {
    public defpackage.ze l;
    private defpackage.zi m;

    public aad(android.content.Context context, defpackage.ze zeVar, defpackage.zi ziVar) {
        super(context);
        this.l = zeVar;
        this.m = ziVar;
    }

    public void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    public final boolean c() {
        return this.l.c();
    }

    public final boolean d() {
        return this.l.d();
    }

    public android.view.MenuItem getItem() {
        return this.m;
    }

    public final void a(defpackage.zf zfVar) {
        this.l.a(zfVar);
    }

    public final defpackage.ze l() {
        return this.l.l();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.ze zeVar, android.view.MenuItem menuItem) {
        return super.a(zeVar, menuItem) || this.l.a(zeVar, menuItem);
    }

    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }

    public android.view.SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        super.a(0, null, 0, drawable, null);
        return this;
    }

    public android.view.SubMenu setHeaderIcon(int i) {
        super.a(0, null, i, null, null);
        return this;
    }

    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        super.a(0, charSequence, 0, null, null);
        return this;
    }

    public android.view.SubMenu setHeaderTitle(int i) {
        super.a(i, null, 0, null, null);
        return this;
    }

    public android.view.SubMenu setHeaderView(android.view.View view) {
        super.a(0, null, 0, null, view);
        return this;
    }

    public final boolean a(defpackage.zi ziVar) {
        return this.l.a(ziVar);
    }

    public final boolean b(defpackage.zi ziVar) {
        return this.l.b(ziVar);
    }

    public final java.lang.String a() {
        int i = this.m != null ? this.m.getItemId() : 0;
        if (i == 0) {
            return null;
        }
        return super.a() + ":" + i;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.l.setGroupDividerEnabled(z);
    }

    public final boolean b() {
        return this.l.b();
    }
}
