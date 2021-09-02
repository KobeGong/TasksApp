package defpackage;

/* renamed from: ws reason: default package */
/* compiled from: PG */
final class ws extends defpackage.wx {
    ws(android.content.Context context, android.view.Window window, defpackage.wn wnVar) {
        super(context, window, wnVar);
    }

    /* access modifiers changed from: 0000 */
    public final android.view.Window.Callback a(android.view.Window.Callback callback) {
        return new defpackage.wt(this, callback);
    }
}
