package defpackage;

/* renamed from: bdn reason: default package */
/* compiled from: PG */
public abstract class bdn {
    private static final java.lang.Object a = new java.lang.Object();
    private static defpackage.bdn b;

    public abstract boolean a(defpackage.bdo bdo, android.content.ServiceConnection serviceConnection);

    /* access modifiers changed from: protected */
    public abstract void b(defpackage.bdo bdo, android.content.ServiceConnection serviceConnection);

    public static defpackage.bdn a(android.content.Context context) {
        synchronized (a) {
            if (b == null) {
                b = new defpackage.beo(context.getApplicationContext());
            }
        }
        return b;
    }

    public final void a(java.lang.String str, java.lang.String str2, int i, android.content.ServiceConnection serviceConnection) {
        b(new defpackage.bdo(str, str2, i), serviceConnection);
    }

    public final void a(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection) {
        b(new defpackage.bdo(componentName), serviceConnection);
    }
}
