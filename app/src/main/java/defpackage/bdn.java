package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: bdn  reason: default package */
/* compiled from: PG */
public abstract class bdn {
    private static final Object a = new Object();
    private static bdn b;

    public abstract boolean a(bdo bdo, ServiceConnection serviceConnection);

    /* access modifiers changed from: protected */
    public abstract void b(bdo bdo, ServiceConnection serviceConnection);

    public static bdn a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new beo(context.getApplicationContext());
            }
        }
        return b;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection) {
        b(new bdo(str, str2, i), serviceConnection);
    }

    public final void a(ComponentName componentName, ServiceConnection serviceConnection) {
        b(new bdo(componentName), serviceConnection);
    }
}
