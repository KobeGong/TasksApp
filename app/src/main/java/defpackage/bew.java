package defpackage;

/* renamed from: bew reason: default package */
/* compiled from: PG */
public final class bew {
    private static final java.lang.Object a = new java.lang.Object();
    private static volatile defpackage.bew b;

    public static defpackage.bew a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new defpackage.bew();
                }
            }
        }
        return b;
    }

    private bew() {
    }

    public static boolean a(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        boolean a2;
        android.content.ComponentName component = intent.getComponent();
        if (component == null) {
            a2 = false;
        } else {
            a2 = defpackage.azb.a(context, component.getPackageName());
        }
        if (!a2) {
            return context.bindService(intent, serviceConnection, i);
        }
        android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
