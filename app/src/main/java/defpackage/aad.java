package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: aad  reason: default package */
/* compiled from: PG */
public class aad extends ze implements SubMenu {
    public ze l;
    private zi m;

    public aad(Context context, ze zeVar, zi ziVar) {
        super(context);
        this.l = zeVar;
        this.m = ziVar;
    }

    @Override // defpackage.ze
    public void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override // defpackage.ze
    public final boolean c() {
        return this.l.c();
    }

    @Override // defpackage.ze
    public final boolean d() {
        return this.l.d();
    }

    public MenuItem getItem() {
        return this.m;
    }

    @Override // defpackage.ze
    public final void a(zf zfVar) {
        this.l.a(zfVar);
    }

    @Override // defpackage.ze
    public final ze l() {
        return this.l.l();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ze
    public final boolean a(ze zeVar, MenuItem menuItem) {
        return super.a(zeVar, menuItem) || this.l.a(zeVar, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.a(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.a(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.a(i, null, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.a(0, null, 0, null, view);
        return this;
    }

    @Override // defpackage.ze
    public final boolean a(zi ziVar) {
        return this.l.a(ziVar);
    }

    @Override // defpackage.ze
    public final boolean b(zi ziVar) {
        return this.l.b(ziVar);
    }

    @Override // defpackage.ze
    public final String a() {
        int itemId = this.m != null ? this.m.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }

    @Override // defpackage.ze
    public void setGroupDividerEnabled(boolean z) {
        this.l.setGroupDividerEnabled(z);
    }

    @Override // defpackage.ze
    public final boolean b() {
        return this.l.b();
    }
}
