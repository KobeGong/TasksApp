package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;

/* renamed from: bew  reason: default package */
/* compiled from: PG */
public final class bew {
    private static final Object a = new Object();
    private static volatile bew b;

    public static bew a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new bew();
                }
            }
        }
        return b;
    }

    private bew() {
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean a2;
        ComponentName component = intent.getComponent();
        if (component == null) {
            a2 = false;
        } else {
            a2 = azb.a(context, component.getPackageName());
        }
        if (!a2) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
