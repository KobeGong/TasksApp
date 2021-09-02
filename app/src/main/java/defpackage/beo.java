package defpackage;

/* renamed from: beo reason: default package */
/* compiled from: PG */
final class beo extends defpackage.bdn implements android.os.Handler.Callback {
    /* access modifiers changed from: private */
    public final java.util.HashMap a = new java.util.HashMap();
    /* access modifiers changed from: private */
    public final android.content.Context b;
    /* access modifiers changed from: private */
    public final android.os.Handler c;
    /* access modifiers changed from: private */
    public final defpackage.bew d;
    private final long e;
    /* access modifiers changed from: private */
    public final long f;

    beo(android.content.Context context) {
        this.b = context.getApplicationContext();
        this.c = new android.os.Handler(context.getMainLooper(), this);
        this.d = defpackage.bew.a();
        this.e = 5000;
        this.f = 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean a(defpackage.bdo bdo, android.content.ServiceConnection serviceConnection) {
        boolean z;
        defpackage.azb.b((java.lang.Object) serviceConnection, (java.lang.Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            defpackage.bep bep = (defpackage.bep) this.a.get(bdo);
            if (bep != null) {
                this.c.removeMessages(0, bdo);
                if (!bep.b(serviceConnection)) {
                    bep.a(serviceConnection);
                    switch (bep.b) {
                        case 1:
                            serviceConnection.onServiceConnected(bep.f, bep.d);
                            break;
                        case 2:
                            bep.a();
                            break;
                    }
                } else {
                    java.lang.String valueOf = java.lang.String.valueOf(bdo);
                    throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
                }
            } else {
                bep = new defpackage.bep(this, bdo);
                bep.a(serviceConnection);
                bep.a();
                this.a.put(bdo, bep);
            }
            z = bep.c;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final void b(defpackage.bdo bdo, android.content.ServiceConnection serviceConnection) {
        defpackage.azb.b((java.lang.Object) serviceConnection, (java.lang.Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            defpackage.bep bep = (defpackage.bep) this.a.get(bdo);
            if (bep == null) {
                java.lang.String valueOf = java.lang.String.valueOf(bdo);
                throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (!bep.b(serviceConnection)) {
                java.lang.String valueOf2 = java.lang.String.valueOf(bdo);
                throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf2).toString());
            } else {
                bep.a.remove(serviceConnection);
                if (bep.b()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, bdo), this.e);
                }
            }
        }
    }

    public final boolean handleMessage(android.os.Message message) {
        android.content.ComponentName componentName;
        switch (message.what) {
            case 0:
                synchronized (this.a) {
                    defpackage.bdo bdo = (defpackage.bdo) message.obj;
                    defpackage.bep bep = (defpackage.bep) this.a.get(bdo);
                    if (bep != null && bep.b()) {
                        if (bep.c) {
                            bep.g.c.removeMessages(1, bep.e);
                            bep.g.b.unbindService(bep);
                            bep.c = false;
                            bep.b = 2;
                        }
                        this.a.remove(bdo);
                    }
                }
                return true;
            case 1:
                synchronized (this.a) {
                    defpackage.bdo bdo2 = (defpackage.bdo) message.obj;
                    defpackage.bep bep2 = (defpackage.bep) this.a.get(bdo2);
                    if (bep2 != null && bep2.b == 3) {
                        java.lang.String valueOf = java.lang.String.valueOf(bdo2);
                        android.util.Log.wtf("GmsClientSupervisor", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 47).append("Timeout waiting for ServiceConnection callback ").append(valueOf).toString(), new java.lang.Exception());
                        android.content.ComponentName componentName2 = bep2.f;
                        if (componentName2 == null) {
                            componentName2 = bdo2.b;
                        }
                        if (componentName2 == null) {
                            componentName = new android.content.ComponentName(bdo2.a, "unknown");
                        } else {
                            componentName = componentName2;
                        }
                        bep2.onServiceDisconnected(componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
