package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.view.Window;

/* access modifiers changed from: package-private */
/* renamed from: wx  reason: default package */
/* compiled from: PG */
public class wx extends wu {
    private final UiModeManager v;

    wx(Context context, Window window, wn wnVar) {
        super(context, window, wnVar);
        this.v = (UiModeManager) context.getSystemService("uimode");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wp, defpackage.wu
    public Window.Callback a(Window.Callback callback) {
        return new wy(this, callback);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wu
    public final int f(int i) {
        if (i == 0 && this.v.getNightMode() == 0) {
            return -1;
        }
        return super.f(i);
    }
}
