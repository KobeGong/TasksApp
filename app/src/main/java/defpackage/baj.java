package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: baj */
public final class baj implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    public static baj d;
    public final AtomicInteger e = new AtomicInteger(1);
    public final AtomicInteger f = new AtomicInteger(0);
    public final Handler g;
    private long h = 5000;
    private long i = 120000;
    private long j = 10000;
    private final Context k;
    private final axt l;
    private int m = -1;
    private final Map n = new ConcurrentHashMap(5, 0.75f, 1);
    private final Set o = new qt();
    private final Set p = new qt();

    public static baj a(Context context) {
        baj baj;
        synchronized (c) {
            if (d == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                d = new baj(context.getApplicationContext(), handlerThread.getLooper(), axt.a);
            }
            baj = d;
        }
        return baj;
    }

    private baj(Context context, Looper looper, axt axt) {
        this.k = context;
        this.g = new Handler(looper, this);
        this.l = axt;
        this.g.sendMessage(this.g.obtainMessage(6));
    }

    private final void a(ayn ayn) {
        bbu bbu = ayn.c;
        bak bak = (bak) this.n.get(bbu);
        if (bak == null) {
            bak = new bak(this, ayn);
            this.n.put(bbu, bak);
        }
        if (bak.j()) {
            this.p.add(bbu);
        }
        bak.h();
    }

    public final bpv a(Iterable iterable) {
        bbx bbx = new bbx(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ayn ayn = (ayn) it.next();
            bak bak = (bak) this.n.get(ayn.c);
            if (bak == null || !bak.i()) {
                this.g.sendMessage(this.g.obtainMessage(2, bbx));
                return bbx.b.a;
            }
            bbx.a(ayn.c, axq.a, bak.a.j());
        }
        return bbx.b.a;
    }

    public final void a() {
        this.g.sendMessage(this.g.obtainMessage(3));
    }

    public final boolean handleMessage(Message message) {
        Status status;
        bak bak;
        long j2;
        boolean z = false;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                } else {
                    j2 = 300000;
                }
                this.j = j2;
                this.g.removeMessages(12);
                for (bbu bbu : this.n.keySet()) {
                    this.g.sendMessageDelayed(this.g.obtainMessage(12, bbu), this.j);
                }
                break;
            case 2:
                bbx bbx = (bbx) message.obj;
                Iterator it = bbx.a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        bbu bbu2 = (bbu) it.next();
                        bak bak2 = (bak) this.n.get(bbu2);
                        if (bak2 == null) {
                            bbx.a(bbu2, new axq(13), null);
                            break;
                        } else if (bak2.i()) {
                            bbx.a(bbu2, axq.a, bak2.a.j());
                        } else if (bak2.e() != null) {
                            bbx.a(bbu2, bak2.e(), null);
                        } else {
                            azb.a(bak2.g.g);
                            bak2.c.add(bbx);
                        }
                    }
                }
            case 3:
                for (bak bak3 : this.n.values()) {
                    bak3.d();
                    bak3.h();
                }
                break;
            case 4:
            case 8:
            case 13:
                bbf bbf = (bbf) message.obj;
                bak bak4 = (bak) this.n.get(bbf.c.c);
                if (bak4 == null) {
                    a(bbf.c);
                    bak4 = (bak) this.n.get(bbf.c.c);
                }
                if (!bak4.j() || this.f.get() == bbf.b) {
                    bak4.a(bbf.a);
                    break;
                } else {
                    bbf.a.a(a);
                    bak4.c();
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                axq axq = (axq) message.obj;
                Iterator it2 = this.n.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        bak = (bak) it2.next();
                        if (bak.e == i2) {
                        }
                    } else {
                        bak = null;
                    }
                }
                if (bak != null) {
                    String b2 = axv.b(axq.b);
                    String str = axq.d;
                    bak.a(new Status(17, new StringBuilder(String.valueOf(b2).length() + 69 + String.valueOf(str).length()).append("Error resolution was canceled by the user, original error message: ").append(b2).append(": ").append(str).toString()));
                    break;
                } else {
                    Log.wtf("GoogleApiManager", new StringBuilder(76).append("Could not find API instance ").append(i2).append(" while trying to fail enqueued calls.").toString(), new Exception());
                    break;
                }
            case 6:
                if (this.k.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.k.getApplicationContext();
                    synchronized (bby.a) {
                        if (!bby.a.e) {
                            application.registerActivityLifecycleCallbacks(bby.a);
                            application.registerComponentCallbacks(bby.a);
                            bby.a.e = true;
                        }
                    }
                    bby bby = bby.a;
                    bbz bbz = new bbz(this);
                    synchronized (bby.a) {
                        bby.d.add(bbz);
                    }
                    bby bby2 = bby.a;
                    if (!bby2.c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!bby2.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            bby2.b.set(true);
                        }
                    }
                    if (!bby2.b.get()) {
                        this.j = 300000;
                        break;
                    }
                }
                break;
            case 7:
                a((ayn) message.obj);
                break;
            case 9:
                if (this.n.containsKey(message.obj)) {
                    bak bak5 = (bak) this.n.get(message.obj);
                    azb.a(bak5.g.g);
                    if (bak5.f) {
                        bak5.h();
                        break;
                    }
                }
                break;
            case 10:
                for (bbu bbu3 : this.p) {
                    ((bak) this.n.remove(bbu3)).c();
                }
                this.p.clear();
                break;
            case 11:
                if (this.n.containsKey(message.obj)) {
                    bak bak6 = (bak) this.n.get(message.obj);
                    azb.a(bak6.g.g);
                    if (bak6.f) {
                        bak6.f();
                        if (axv.a(bak6.g.k) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        bak6.a(status);
                        bak6.a.e();
                        break;
                    }
                }
                break;
            case 12:
                if (this.n.containsKey(message.obj)) {
                    bak bak7 = (bak) this.n.get(message.obj);
                    azb.a(bak7.g.g);
                    if (bak7.a.f() && bak7.d.size() == 0) {
                        aze aze = bak7.b;
                        if (!aze.a.isEmpty() || !aze.b.isEmpty()) {
                            z = true;
                        }
                        if (z) {
                            bak7.g();
                            break;
                        } else {
                            bak7.a.e();
                            break;
                        }
                    }
                }
                break;
            default:
                Log.w("GoogleApiManager", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                return false;
        }
        return true;
    }

    public final boolean a(axq axq, int i2) {
        PendingIntent a2;
        axt axt = this.l;
        Context context = this.k;
        if (axq.a()) {
            a2 = axq.c;
        } else {
            a2 = axv.a(context, axq.b, 0, null);
        }
        if (a2 == null) {
            return false;
        }
        axt.a(context, axq.b, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, a2, i2, true), 134217728));
        return true;
    }

    static /* synthetic */ azg b() {
        return null;
    }
}
