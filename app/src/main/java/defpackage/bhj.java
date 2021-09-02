package defpackage;

/* renamed from: bhj reason: default package */
/* compiled from: PG */
final class bhj extends android.os.Handler {
    private /* synthetic */ defpackage.bhh a;

    bhj(defpackage.bhh bhh, android.os.Looper looper) {
        this.a = bhh;
        super(looper);
    }

    public final void handleMessage(android.os.Message message) {
        if (message == null || !(message.obj instanceof android.content.Intent)) {
            android.util.Log.w("GCM", "Dropping invalid message");
        }
        android.content.Intent intent = (android.content.Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            this.a.d.add(intent);
        } else if (!defpackage.bhh.a(this.a, intent)) {
            intent.setPackage(this.a.b.getPackageName());
            this.a.b.sendBroadcast(intent);
        }
    }
}
