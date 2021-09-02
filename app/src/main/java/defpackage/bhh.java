package defpackage;

/* renamed from: bhh reason: default package */
/* compiled from: PG */
public final class bhh {
    private static defpackage.bhh a;
    /* access modifiers changed from: private */
    public android.content.Context b;
    private final java.util.Map c = java.util.Collections.synchronizedMap(new defpackage.qr());
    /* access modifiers changed from: private */
    public final java.util.concurrent.BlockingQueue d = new java.util.concurrent.LinkedBlockingQueue();

    public static synchronized defpackage.bhh a(android.content.Context context) {
        defpackage.bhh bhh;
        synchronized (defpackage.bhh.class) {
            if (a == null) {
                defpackage.bhh bhh2 = new defpackage.bhh();
                a = bhh2;
                bhh2.b = context.getApplicationContext();
            }
            bhh = a;
        }
        return bhh;
    }

    public bhh() {
        new android.os.Messenger(new defpackage.bhj(this, android.os.Looper.getMainLooper()));
    }

    public static java.lang.String a(android.content.Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null ? "gcm" : stringExtra;
    }

    static /* synthetic */ boolean a(defpackage.bhh bhh, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra != null) {
            android.os.Handler handler = (android.os.Handler) bhh.c.remove(stringExtra);
            if (handler != null) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.obj = intent;
                return handler.sendMessage(obtain);
            }
        }
        return false;
    }

    static {
        new java.util.concurrent.atomic.AtomicInteger(1);
    }
}
