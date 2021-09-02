package defpackage;

/* renamed from: wt reason: default package */
/* compiled from: PG */
final class wt extends defpackage.wy {
    private final /* synthetic */ defpackage.ws a;

    wt(defpackage.ws wsVar, android.view.Window.Callback callback) {
        this.a = wsVar;
        super(wsVar, callback);
    }

    public final void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i) {
        defpackage.zx g = this.a.g(0);
        if (g == null || g.h == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, g.h, i);
        }
    }
}
