package defpackage;

import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: wt  reason: default package */
/* compiled from: PG */
final class wt extends wy {
    private final /* synthetic */ ws a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    wt(ws wsVar, Window.Callback callback) {
        super(wsVar, callback);
        this.a = wsVar;
    }

    @Override // defpackage.yo, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        zx g = this.a.g(0);
        if (g == null || g.h == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, g.h, i);
        }
    }
}
