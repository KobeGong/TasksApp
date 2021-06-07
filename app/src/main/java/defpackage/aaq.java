package defpackage;

import android.content.Context;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aaq  reason: default package */
/* compiled from: PG */
public final class aaq extends zr {
    private final /* synthetic */ aap d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaq(aap aap, Context context, aad aad, View view) {
        super(context, aad, view, false);
        this.d = aap;
        if (!((zi) aad.getItem()).f()) {
            this.a = aap.g == null ? (View) aap.e : aap.g;
        }
        a(aap.m);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.zr
    public final void d() {
        this.d.k = null;
        this.d.n = 0;
        super.d();
    }
}
