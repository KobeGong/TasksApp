package defpackage;

/* renamed from: bar reason: default package */
/* compiled from: PG */
public final class bar extends android.content.BroadcastReceiver {
    public android.content.Context a;
    private final defpackage.bas b;

    public bar(defpackage.bas bas) {
        this.b = bas;
    }

    public final synchronized void a() {
        if (this.a != null) {
            this.a.unregisterReceiver(this);
        }
        this.a = null;
    }

    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        java.lang.String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(str)) {
            this.b.a();
            a();
        }
    }
}
