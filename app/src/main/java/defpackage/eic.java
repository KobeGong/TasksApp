package defpackage;

/* renamed from: eic reason: default package */
/* compiled from: PG */
final class eic extends android.content.BroadcastReceiver {
    private final /* synthetic */ android.content.Context a;
    private final /* synthetic */ defpackage.eib b;

    eic(defpackage.eib eib, android.content.Context context) {
        this.b = eib;
        this.a = context;
    }

    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.unregisterReceiver(this);
        this.b.a.b.getAuthToken(this.b.a.e, this.b.a.d, this.b.a.c, true, new defpackage.eib(this.b.b, this.b.a), null);
    }
}
