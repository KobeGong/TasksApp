package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: cft  reason: default package */
/* compiled from: PG */
public final class cft extends cfc {
    private WeakReference W;

    public final void b(View view) {
        cky.a((Object) view);
        if (this.V != null) {
            ((cfm) this.V).a(view);
        } else {
            this.W = new WeakReference(view);
        }
    }

    @Override // defpackage.cfc, defpackage.lc
    public final void u() {
        if (this.V != null) {
            ((cfm) this.V).f.removeAllViews();
        }
        super.u();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cfc
    public final /* synthetic */ cff N() {
        cfm cfm = new cfm(i());
        View view = this.W != null ? (View) this.W.get() : null;
        if (view != null) {
            cfm.a(view);
            this.W = null;
        }
        return cfm;
    }
}
