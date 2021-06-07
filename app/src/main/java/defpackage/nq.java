package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: nq  reason: default package */
/* compiled from: PG */
public final class nq implements ServiceConnection, Handler.Callback {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    nq(Context context) {
        this.b = context;
        this.c = new HandlerThread("NotificationManagerCompat");
        this.c.start();
        this.a = new Handler(this.c.getLooper(), this);
    }

    public final boolean handleMessage(Message message) {
        mz mzVar;
        switch (message.what) {
            case 0:
                ns nsVar = (ns) message.obj;
                Set b2 = nm.b(this.b);
                if (!b2.equals(this.e)) {
                    this.e = b2;
                    List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (b2.contains(resolveInfo.serviceInfo.packageName)) {
                            ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet) {
                        if (!this.d.containsKey(componentName2)) {
                            this.d.put(componentName2, new nr(componentName2));
                        }
                    }
                    Iterator it = this.d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!hashSet.contains(entry.getKey())) {
                            a((nr) entry.getValue());
                            it.remove();
                        }
                    }
                }
                for (nr nrVar : this.d.values()) {
                    nrVar.d.add(nsVar);
                    c(nrVar);
                }
                return true;
            case 1:
                np npVar = (np) message.obj;
                ComponentName componentName3 = npVar.a;
                IBinder iBinder = npVar.b;
                nr nrVar2 = (nr) this.d.get(componentName3);
                if (nrVar2 != null) {
                    if (iBinder == null) {
                        mzVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof mz)) {
                            mzVar = new mz(iBinder);
                        } else {
                            mzVar = (mz) queryLocalInterface;
                        }
                    }
                    nrVar2.c = mzVar;
                    nrVar2.e = 0;
                    c(nrVar2);
                }
                return true;
            case 2:
                nr nrVar3 = (nr) this.d.get((ComponentName) message.obj);
                if (nrVar3 != null) {
                    a(nrVar3);
                }
                return true;
            case 3:
                nr nrVar4 = (nr) this.d.get((ComponentName) message.obj);
                if (nrVar4 != null) {
                    c(nrVar4);
                }
                return true;
            default:
                return false;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new np(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }

    private final void a(nr nrVar) {
        if (nrVar.b) {
            this.b.unbindService(this);
            nrVar.b = false;
        }
        nrVar.c = null;
    }

    private final void b(nr nrVar) {
        if (!this.a.hasMessages(3, nrVar.a)) {
            nrVar.e++;
            if (nrVar.e > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + nrVar.d.size() + " tasks to " + nrVar.a + " after " + nrVar.e + " retries");
                nrVar.d.clear();
                return;
            }
            this.a.sendMessageDelayed(this.a.obtainMessage(3, nrVar.a), (long) ((1 << (nrVar.e - 1)) * 1000));
        }
    }

    private final void c(nr nrVar) {
        boolean z;
        if (!nrVar.d.isEmpty()) {
            if (nrVar.b) {
                z = true;
            } else {
                nrVar.b = this.b.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(nrVar.a), this, 33);
                if (nrVar.b) {
                    nrVar.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + nrVar.a);
                    this.b.unbindService(this);
                }
                z = nrVar.b;
            }
            if (!z || nrVar.c == null) {
                b(nrVar);
                return;
            }
            while (true) {
                ns nsVar = (ns) nrVar.d.peek();
                if (nsVar == null) {
                    break;
                }
                try {
                    nsVar.a(nrVar.c);
                    nrVar.d.remove();
                } catch (DeadObjectException e2) {
                } catch (RemoteException e3) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + nrVar.a, e3);
                }
            }
            if (!nrVar.d.isEmpty()) {
                b(nrVar);
            }
        }
    }
}
