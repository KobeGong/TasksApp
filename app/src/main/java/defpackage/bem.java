package defpackage;

/* renamed from: bem reason: default package */
/* compiled from: PG */
public final class bem implements android.os.Handler.Callback {
    public final defpackage.ben a;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public volatile boolean e = false;
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger(0);
    public boolean g = false;
    public final android.os.Handler h;
    public final java.lang.Object i = new java.lang.Object();

    public bem(android.os.Looper looper, defpackage.ben ben) {
        this.a = ben;
        this.h = new android.os.Handler(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void a(defpackage.ayr ayr) {
        defpackage.azb.b((java.lang.Object) ayr);
        synchronized (this.i) {
            if (this.b.contains(ayr)) {
                java.lang.String valueOf = java.lang.String.valueOf(ayr);
                android.util.Log.w("GmsClientEvents", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.b.add(ayr);
            }
        }
        if (this.a.f()) {
            this.h.sendMessage(this.h.obtainMessage(1, ayr));
        }
    }

    public final void a(defpackage.ays ays) {
        defpackage.azb.b((java.lang.Object) ays);
        synchronized (this.i) {
            if (this.d.contains(ays)) {
                java.lang.String valueOf = java.lang.String.valueOf(ays);
                android.util.Log.w("GmsClientEvents", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.d.add(ays);
            }
        }
    }

    public final boolean handleMessage(android.os.Message message) {
        if (message.what == 1) {
            defpackage.ayr ayr = (defpackage.ayr) message.obj;
            synchronized (this.i) {
                if (this.e && this.a.f() && this.b.contains(ayr)) {
                    this.a.a();
                    ayr.a((android.os.Bundle) null);
                }
            }
            return true;
        }
        android.util.Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new java.lang.Exception());
        return false;
    }
}
