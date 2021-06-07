package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* renamed from: yq  reason: default package */
/* compiled from: PG */
public final class yq extends ado {
    private final /* synthetic */ ActionMenuItemView c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.c = actionMenuItemView;
    }

    @Override // defpackage.ado
    public final zz a() {
        if (this.c.d == null) {
            return null;
        }
        yr yrVar = this.c.d;
        if (yrVar.a.k != null) {
            return yrVar.a.k.a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ado
    public final boolean b() {
        zz a;
        if (this.c.c == null || !this.c.c.a(this.c.a) || (a = a()) == null || !a.f()) {
            return false;
        }
        return true;
    }
}
