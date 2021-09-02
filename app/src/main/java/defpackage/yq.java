package defpackage;

/* renamed from: yq reason: default package */
/* compiled from: PG */
public final class yq extends defpackage.ado {
    private final /* synthetic */ android.support.v7.view.menu.ActionMenuItemView c;

    public yq(android.support.v7.view.menu.ActionMenuItemView actionMenuItemView) {
        this.c = actionMenuItemView;
        super(actionMenuItemView);
    }

    public final defpackage.zz a() {
        if (this.c.d == null) {
            return null;
        }
        defpackage.yr yrVar = this.c.d;
        if (yrVar.a.k != null) {
            return yrVar.a.k.a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        if (this.c.c == null || !this.c.c.a(this.c.a)) {
            return false;
        }
        defpackage.zz a = a();
        if (a == null || !a.f()) {
            return false;
        }
        return true;
    }
}
