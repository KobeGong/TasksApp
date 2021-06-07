package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: beo  reason: default package */
/* compiled from: PG */
public final class beo extends bdn implements Handler.Callback {
    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final bew d;
    private final long e;
    private final long f;

    beo(Context context) {
        this.b = context.getApplicationContext();
        this.c = new Handler(context.getMainLooper(), this);
        this.d = bew.a();
        this.e = 5000;
        this.f = 300000;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bdn
    public final boolean a(bdo bdo, ServiceConnection serviceConnection) {
        boolean z;
        azb.b(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            bep bep = (bep) this.a.get(bdo);
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
                    String valueOf = String.valueOf(bdo);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
                }
            } else {
                bep = new bep(this, bdo);
                bep.a(serviceConnection);
                bep.a();
                this.a.put(bdo, bep);
            }
            z = bep.c;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bdn
    public final void b(bdo bdo, ServiceConnection serviceConnection) {
        azb.b(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            bep bep = (bep) this.a.get(bdo);
            if (bep == null) {
                String valueOf = String.valueOf(bdo);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (!bep.b(serviceConnection)) {
                String valueOf2 = String.valueOf(bdo);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf2).toString());
            } else {
                bep.a.remove(serviceConnection);
                if (bep.b()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, bdo), this.e);
                }
            }
        }
    }

    public final boolean handleMessage(Message message) {
        ComponentName componentName;
        switch (message.what) {
            case 0:
                synchronized (this.a) {
                    bdo bdo = (bdo) message.obj;
                    bep bep = (bep) this.a.get(bdo);
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
                    bdo bdo2 = (bdo) message.obj;
                    bep bep2 = (bep) this.a.get(bdo2);
                    if (bep2 != null && bep2.b == 3) {
                        String valueOf = String.valueOf(bdo2);
                        Log.wtf("GmsClientSupervisor", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Timeout waiting for ServiceConnection callback ").append(valueOf).toString(), new Exception());
                        ComponentName componentName2 = bep2.f;
                        if (componentName2 == null) {
                            componentName2 = bdo2.b;
                        }
                        if (componentName2 == null) {
                            componentName = new ComponentName(bdo2.a, "unknown");
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
