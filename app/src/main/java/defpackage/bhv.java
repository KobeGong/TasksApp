package defpackage;

/* renamed from: bhv reason: default package */
/* compiled from: PG */
public final class bhv extends defpackage.bhx {
    public final void handleIntent(android.content.Intent intent) {
        throw new java.lang.NoSuchMethodError();
    }

    static void a(android.content.Context context, defpackage.bij bij) {
        bij.a();
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }
}
