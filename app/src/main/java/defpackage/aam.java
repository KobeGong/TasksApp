package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: aam  reason: default package */
/* compiled from: PG */
public final class aam implements Runnable {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public aam(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.b();
        this.a.h = this.a.b.animate().translationY((float) (-this.a.b.getHeight())).setListener(this.a.i);
    }
}
