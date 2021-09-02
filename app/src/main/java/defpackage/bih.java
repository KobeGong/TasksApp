package defpackage;

/* renamed from: bih reason: default package */
/* compiled from: PG */
final class bih extends android.os.Handler {
    private /* synthetic */ defpackage.bhw a;

    bih(defpackage.bhw bhw, android.os.Looper looper) {
        this.a = bhw;
        super(looper);
    }

    public final void handleMessage(android.os.Message message) {
        defpackage.bhw bhw = this.a;
        if (message == null) {
            return;
        }
        if (message.obj instanceof android.content.Intent) {
            android.content.Intent intent = (android.content.Intent) message.obj;
            intent.setExtrasClassLoader(com.google.android.gms.iid.MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                android.os.Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof com.google.android.gms.iid.MessengerCompat) {
                    bhw.b = (com.google.android.gms.iid.MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof android.os.Messenger) {
                    bhw.a = (android.os.Messenger) parcelableExtra;
                }
            }
            bhw.a((android.content.Intent) message.obj);
            return;
        }
        android.util.Log.w("InstanceID/Rpc", "Dropping invalid message");
    }
}
