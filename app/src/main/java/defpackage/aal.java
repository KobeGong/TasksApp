package defpackage;

/* renamed from: aal reason: default package */
/* compiled from: PG */
public final class aal implements java.lang.Runnable {
    private final /* synthetic */ android.support.v7.widget.ActionBarOverlayLayout a;

    public aal(android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.b();
        this.a.h = this.a.b.animate().translationY(0.0f).setListener(this.a.i);
    }
}
