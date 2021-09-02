package defpackage;

@android.annotation.SuppressLint({"HandlerLeak"})
/* renamed from: axu reason: default package */
/* compiled from: PG */
final class axu extends android.os.Handler {
    private final android.content.Context a;
    private /* synthetic */ defpackage.axt b;

    public axu(defpackage.axt axt, android.content.Context context) {
        this.b = axt;
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper());
        this.a = context.getApplicationContext();
    }

    public final void handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                int a2 = defpackage.axv.a(this.a);
                if (defpackage.axv.a(a2)) {
                    defpackage.axt axt = this.b;
                    android.content.Context context = this.a;
                    axt.a(context, a2, defpackage.axv.a(context, a2, 0, "n"));
                    return;
                }
                return;
            default:
                android.util.Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
                return;
        }
    }
}
