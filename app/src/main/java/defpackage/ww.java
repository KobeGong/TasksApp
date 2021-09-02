package defpackage;

/* renamed from: ww reason: default package */
/* compiled from: PG */
final class ww extends android.content.BroadcastReceiver {
    private final /* synthetic */ defpackage.xl a;

    ww(defpackage.xl xlVar) {
        this.a = xlVar;
    }

    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.xl xlVar = this.a;
        boolean a2 = xlVar.a.a();
        if (a2 != xlVar.b) {
            xlVar.b = a2;
            xlVar.e.k();
        }
    }
}
