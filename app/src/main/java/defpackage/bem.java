package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bem  reason: default package */
/* compiled from: PG */
public final class bem implements Handler.Callback {
    public final ben a;
    public final ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Handler h;
    public final Object i = new Object();

    public bem(Looper looper, ben ben) {
        this.a = ben;
        this.h = new Handler(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void a(ayr ayr) {
        azb.b(ayr);
        synchronized (this.i) {
            if (this.b.contains(ayr)) {
                String valueOf = String.valueOf(ayr);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.b.add(ayr);
            }
        }
        if (this.a.f()) {
            this.h.sendMessage(this.h.obtainMessage(1, ayr));
        }
    }

    public final void a(ays ays) {
        azb.b(ays);
        synchronized (this.i) {
            if (this.d.contains(ays)) {
                String valueOf = String.valueOf(ays);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.d.add(ays);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ayr ayr = (ayr) message.obj;
            synchronized (this.i) {
                if (this.e && this.a.f() && this.b.contains(ayr)) {
                    this.a.a();
                    ayr.a((Bundle) null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
        return false;
    }
}
