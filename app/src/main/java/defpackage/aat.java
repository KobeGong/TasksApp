package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aat  reason: default package */
/* compiled from: PG */
public final class aat extends ado {
    private final /* synthetic */ aas c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aat(aas aas, View view) {
        super(view);
        this.c = aas;
    }

    @Override // defpackage.ado
    public final zz a() {
        if (this.c.a.j == null) {
            return null;
        }
        return this.c.a.j.a();
    }

    @Override // defpackage.ado
    public final boolean b() {
        this.c.a.e();
        return true;
    }

    @Override // defpackage.ado
    public final boolean c() {
        if (this.c.a.l != null) {
            return false;
        }
        this.c.a.f();
        return true;
    }
}
