package defpackage;

import android.view.View;

import java.lang.ref.WeakReference;

/* renamed from: cft reason: default package */
/* compiled from: PG */
public final class cft extends defpackage.cfc {
    private java.lang.ref.WeakReference<View> viewRef;

    public final void b(android.view.View view) {
        defpackage.cky.a((java.lang.Object) view);
        if (this.V != null) {
            ((defpackage.cfm) this.V).a(view);
        } else {
            this.viewRef = new WeakReference<>(view);
        }
    }

    public final void onDestroy() {
        if (this.V != null) {
            ((defpackage.cfm) this.V).f.removeAllViews();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.cff N() {
        defpackage.cfm cfm = new defpackage.cfm(getContext());
        android.view.View view = this.viewRef != null ? (android.view.View) this.viewRef.get() : null;
        if (view != null) {
            cfm.a(view);
            this.viewRef = null;
        }
        return cfm;
    }
}
