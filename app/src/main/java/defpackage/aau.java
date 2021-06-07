package defpackage;

import android.content.Context;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aau  reason: default package */
/* compiled from: PG */
public final class aau extends zr {
    private final /* synthetic */ aap d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aau(aap aap, Context context, ze zeVar, View view) {
        super(context, zeVar, view, true);
        this.d = aap;
        this.b = 8388613;
        a(aap.m);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.zr
    public final void d() {
        if (this.d.c != null) {
            this.d.c.close();
        }
        this.d.j = null;
        super.d();
    }
}
