package defpackage;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
/* renamed from: arc  reason: default package */
/* compiled from: PG */
public final class arc implements ViewTreeObserver.OnWindowFocusChangeListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ arb b;

    arc(arb arb, View view) {
        this.b = arb;
        this.a = view;
    }

    @TargetApi(18)
    public final void onWindowFocusChanged(boolean z) {
        lg j = this.b.j();
        if (j != null && j.hasWindowFocus() && !this.b.n) {
            this.a.requestFocus();
            bdk.a(this.a, true);
        }
        this.a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }
}
