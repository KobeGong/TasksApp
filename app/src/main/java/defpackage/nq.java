package defpackage;

/* renamed from: nq reason: default package */
/* compiled from: PG */
final class nq implements android.content.ServiceConnection, android.os.Handler.Callback {
    public final android.os.Handler a;
    private final android.content.Context b;
    private final android.os.HandlerThread c;
    private final java.util.Map d = new java.util.HashMap();
    private java.util.Set e = new java.util.HashSet();

    nq(android.content.Context context) {
        this.b = context;
        this.c = new android.os.HandlerThread("NotificationManagerCompat");
        this.c.start();
        this.a = new android.os.Handler(this.c.getLooper(), this);
    }

    public final boolean handleMessage(android.os.Message message) {
        defpackage.mz mzVar;
        switch (message.what) {
            case 0:
                defpackage.ns nsVar = (defpackage.ns) message.obj;
                java.util.Set b2 = defpackage.nm.b(this.b);
                if (!b2.equals(this.e)) {
                    this.e = b2;
                    java.util.List<android.content.pm.ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new android.content.Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    java.util.HashSet<android.content.ComponentName> hashSet = new java.util.HashSet<>();
                    for (android.content.pm.ResolveInfo resolveInfo : queryIntentServices) {
                        if (b2.contains(resolveInfo.serviceInfo.packageName)) {
                            android.content.ComponentName componentName = new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                android.util.Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (android.content.ComponentName componentName2 : hashSet) {
                        if (!this.d.containsKey(componentName2)) {
                            this.d.put(componentName2, new defpackage.nr(componentName2));
                        }
                    }
                    java.util.Iterator it = this.d.entrySet().iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        if (!hashSet.contains(entry.getKey())) {
                            a((defpackage.nr) entry.getValue());
                            it.remove();
                        }
                    }
                }
                for (defpackage.nr nrVar : this.d.values()) {
                    nrVar.d.add(nsVar);
                    c(nrVar);
                }
                return true;
            case 1:
                defpackage.np npVar = (defpackage.np) message.obj;
                android.content.ComponentName componentName3 = npVar.a;
                android.os.IBinder iBinder = npVar.b;
                defpackage.nr nrVar2 = (defpackage.nr) this.d.get(componentName3);
                if (nrVar2 != null) {
                    if (iBinder == null) {
                        mzVar = null;
                    } else {
                        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof defpackage.mz)) {
                            mzVar = new defpackage.mz(iBinder);
                        } else {
                            mzVar = (defpackage.mz) queryLocalInterface;
                        }
                    }
                    nrVar2.c = mzVar;
                    nrVar2.e = 0;
                    c(nrVar2);
                }
                return true;
            case 2:
                defpackage.nr nrVar3 = (defpackage.nr) this.d.get((android.content.ComponentName) message.obj);
                if (nrVar3 != null) {
                    a(nrVar3);
                }
                return true;
            case 3:
                defpackage.nr nrVar4 = (defpackage.nr) this.d.get((android.content.ComponentName) message.obj);
                if (nrVar4 != null) {
                    c(nrVar4);
                }
                return true;
            default:
                return false;
        }
    }

    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.a.obtainMessage(1, new defpackage.np(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }

    private final void a(defpackage.nr nrVar) {
        if (nrVar.b) {
            this.b.unbindService(this);
            nrVar.b = false;
        }
        nrVar.c = null;
    }

    private final void b(defpackage.nr nrVar) {
        if (!this.a.hasMessages(3, nrVar.a)) {
            nrVar.e++;
            if (nrVar.e > 6) {
                android.util.Log.w("NotifManCompat", "Giving up on delivering " + nrVar.d.size() + " tasks to " + nrVar.a + " after " + nrVar.e + " retries");
                nrVar.d.clear();
                return;
            }
            int i = (1 << (nrVar.e - 1)) * 1000;
            this.a.sendMessageDelayed(this.a.obtainMessage(3, nrVar.a), (long) i);
        }
    }

    private final void c(defpackage.nr nrVar) {
        boolean z;
        if (!nrVar.d.isEmpty()) {
            if (nrVar.b) {
                z = true;
            } else {
                nrVar.b = this.b.bindService(new android.content.Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(nrVar.a), this, 33);
                if (nrVar.b) {
                    nrVar.e = 0;
                } else {
                    android.util.Log.w("NotifManCompat", "Unable to bind to listener " + nrVar.a);
                    this.b.unbindService(this);
                }
                z = nrVar.b;
            }
            if (!z || nrVar.c == null) {
                b(nrVar);
                return;
            }
            while (true) {
                defpackage.ns nsVar = (defpackage.ns) nrVar.d.peek();
                if (nsVar == null) {
                    break;
                }
                try {
                    nsVar.a(nrVar.c);
                    nrVar.d.remove();
                } catch (android.os.DeadObjectException e2) {
                } catch (android.os.RemoteException e3) {
                    android.util.Log.w("NotifManCompat", "RemoteException communicating with " + nrVar.a, e3);
                }
            }
            if (!nrVar.d.isEmpty()) {
                b(nrVar);
            }
        }
    }
}
