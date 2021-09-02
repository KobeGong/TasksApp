package defpackage;

/* renamed from: aam reason: default package */
/* compiled from: PG */
public final class aam implements java.lang.Runnable {
    private final /* synthetic */ android.support.v7.widget.ActionBarOverlayLayout a;

    public aam(android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.b();
        this.a.h = this.a.b.animate().translationY((float) (-this.a.b.getHeight())).setListener(this.a.i);
    }
}
