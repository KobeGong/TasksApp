package defpackage;

/* renamed from: wx reason: default package */
/* compiled from: PG */
class wx extends defpackage.wu {
    private final android.app.UiModeManager v;

    wx(android.content.Context context, android.view.Window window, defpackage.wn wnVar) {
        super(context, window, wnVar);
        this.v = (android.app.UiModeManager) context.getSystemService("uimode");
    }

    /* access modifiers changed from: 0000 */
    public android.view.Window.Callback a(android.view.Window.Callback callback) {
        return new defpackage.wy(this, callback);
    }

    /* access modifiers changed from: 0000 */
    public final int f(int i) {
        if (i == 0 && this.v.getNightMode() == 0) {
            return -1;
        }
        return super.f(i);
    }
}
