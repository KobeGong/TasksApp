package defpackage;

import android.view.View;

/* renamed from: acc  reason: default package */
/* compiled from: PG */
final class acc extends ado {
    private final /* synthetic */ ace c;
    private final /* synthetic */ acb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    acc(acb acb, View view, ace ace) {
        super(view);
        this.d = acb;
        this.c = ace;
    }

    @Override // defpackage.ado
    public final zz a() {
        return this.c;
    }

    @Override // defpackage.ado
    public final boolean b() {
        if (this.d.a.r.isShowing()) {
            return true;
        }
        this.d.a.d();
        return true;
    }
}
