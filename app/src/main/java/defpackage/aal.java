package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: aal  reason: default package */
/* compiled from: PG */
public final class aal implements Runnable {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public aal(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.b();
        this.a.h = this.a.b.animate().translationY(0.0f).setListener(this.a.i);
    }
}
