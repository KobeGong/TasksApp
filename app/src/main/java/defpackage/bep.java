package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bep  reason: default package */
/* compiled from: PG */
final class bep implements ServiceConnection {
    public final Set a = new HashSet();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final bdo e;
    public ComponentName f;
    public /* synthetic */ beo g;

    public bep(beo beo, bdo bdo) {
        this.g = beo;
        this.e = bdo;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }

    public final void a() {
        this.b = 3;
        bew unused = this.g.d;
        this.c = bew.a(this.g.b, this.e.a(), this, this.e.c);
        if (this.c) {
            this.g.c.sendMessageDelayed(this.g.c.obtainMessage(1, this.e), this.g.f);
            return;
        }
        this.b = 2;
        try {
            bew unused2 = this.g.d;
            this.g.b.unbindService(this);
        } catch (IllegalArgumentException e2) {
        }
    }

    public final void a(ServiceConnection serviceConnection) {
        bew unused = this.g.d;
        Context unused2 = this.g.b;
        this.e.a();
        this.a.add(serviceConnection);
    }

    public final boolean b(ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }
}
