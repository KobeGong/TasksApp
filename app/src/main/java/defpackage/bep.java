package defpackage;

/* renamed from: bep reason: default package */
/* compiled from: PG */
final class bep implements android.content.ServiceConnection {
    public final java.util.Set a = new java.util.HashSet();
    public int b = 2;
    public boolean c;
    public android.os.IBinder d;
    public final defpackage.bdo e;
    public android.content.ComponentName f;
    public /* synthetic */ defpackage.beo g;

    public bep(defpackage.beo beo, defpackage.bdo bdo) {
        this.g = beo;
        this.e = bdo;
    }

    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (android.content.ServiceConnection onServiceConnected : this.a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (android.content.ServiceConnection onServiceDisconnected : this.a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }

    public final void a() {
        this.b = 3;
        this.g.d;
        this.c = defpackage.bew.a(this.g.b, this.e.a(), this, this.e.c);
        if (this.c) {
            this.g.c.sendMessageDelayed(this.g.c.obtainMessage(1, this.e), this.g.f);
            return;
        }
        this.b = 2;
        try {
            this.g.d;
            this.g.b.unbindService(this);
        } catch (java.lang.IllegalArgumentException e2) {
        }
    }

    public final void a(android.content.ServiceConnection serviceConnection) {
        this.g.d;
        this.g.b;
        this.e.a();
        this.a.add(serviceConnection);
    }

    public final boolean b(android.content.ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }
}
