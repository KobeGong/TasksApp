package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* renamed from: azx  reason: default package */
/* compiled from: PG */
public final class azx extends ayp implements bav {
    public final Lock b;
    public final Queue c = new LinkedList();
    public final Map d;
    public Set e = new HashSet();
    public Set f = null;
    public final bbr g;
    private final bem h;
    private bau i = null;
    private final int j;
    private final Context k;
    private final Looper l;
    private volatile boolean m;
    private long n = 120000;
    private long o = 5000;
    private final bac p;
    private final axt q;
    private bar r;
    private bdj s;
    private Map t;
    private ayf u;
    private final bbe v = new bbe();
    private final ArrayList w;
    private Integer x = null;
    private final ben y = new azy(this);

    public azx(Context context, Lock lock, Looper looper, bdj bdj, axt axt, ayf ayf, Map map, List list, List list2, Map map2, int i2, int i3, ArrayList arrayList) {
        this.k = context;
        this.b = lock;
        this.h = new bem(looper, this.y);
        this.l = looper;
        this.p = new bac(this, looper);
        this.q = axt;
        this.j = i2;
        if (this.j >= 0) {
            this.x = Integer.valueOf(i3);
        }
        this.t = map;
        this.d = map2;
        this.w = arrayList;
        this.g = new bbr(this.d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.h.a((ayr) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.h.a((ays) it2.next());
        }
        this.s = bdj;
        this.u = ayf;
    }

    @Override // defpackage.ayp
    public final bca a(bca bca) {
        String str;
        azb.b(bca.c != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.d.containsKey(bca.c);
        if (bca.d != null) {
            str = bca.d.b;
        } else {
            str = "the API";
        }
        azb.b(containsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.b.lock();
        try {
            if (this.i == null) {
                this.c.add(bca);
                return bca;
            }
            bca a = this.i.a(bca);
            this.b.unlock();
            return a;
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ayp
    public final bca b(bca bca) {
        String str;
        azb.b(bca.c != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.d.containsKey(bca.c);
        if (bca.d != null) {
            str = bca.d.b;
        } else {
            str = "the API";
        }
        azb.b(containsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.b.lock();
        try {
            if (this.i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.m) {
                this.c.add(bca);
                while (!this.c.isEmpty()) {
                    bca bca2 = (bca) this.c.remove();
                    this.g.a(bca2);
                    bca2.c(Status.c);
                }
                return bca;
            } else {
                bca b2 = this.i.b(bca);
                this.b.unlock();
                return b2;
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ayp
    public final bba a(Object obj) {
        this.b.lock();
        try {
            bbe bbe = this.v;
            Looper looper = this.l;
            azb.b(obj, "Listener must not be null");
            azb.b(looper, "Looper must not be null");
            azb.b("NO_TYPE", "Listener type must not be null");
            bba bba = new bba(looper, obj, "NO_TYPE");
            bbe.a.add(bba);
            return bba;
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ayp
    public final ayj a(ayh ayh) {
        ayj ayj = (ayj) this.d.get(ayh);
        azb.b(ayj, "Appropriate Api was not requested.");
        return ayj;
    }

    @Override // defpackage.ayp
    public final void e() {
        boolean z = false;
        this.b.lock();
        try {
            if (this.j >= 0) {
                if (this.x != null) {
                    z = true;
                }
                azb.a(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = Integer.valueOf(a((Iterable) this.d.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.x.intValue());
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ayp
    public final void a(int i2) {
        boolean z = true;
        this.b.lock();
        if (!(i2 == 3 || i2 == 1 || i2 == 2)) {
            z = false;
        }
        try {
            azb.b(z, new StringBuilder(33).append("Illegal sign-in mode: ").append(i2).toString());
            b(i2);
            n();
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ayp
    public final axq f() {
        boolean z = true;
        azb.a(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.b.lock();
        try {
            if (this.j >= 0) {
                if (this.x == null) {
                    z = false;
                }
                azb.a(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = Integer.valueOf(a((Iterable) this.d.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.x.intValue());
            this.h.e = true;
            return this.i.b();
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ayp
    public final void g() {
        this.b.lock();
        try {
            bbr bbr = this.g;
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) bbr.c.toArray(bbr.b);
            for (BasePendingResult basePendingResult : basePendingResultArr) {
                basePendingResult.a((bbs) null);
                if (basePendingResult.c()) {
                    bbr.c.remove(basePendingResult);
                }
            }
            if (this.i != null) {
                this.i.c();
            }
            bbe bbe = this.v;
            for (bba bba : bbe.a) {
                bba.b = null;
            }
            bbe.a.clear();
            for (bca bca : this.c) {
                bca.a((bbs) null);
                bca.a();
            }
            this.c.clear();
            if (this.i != null) {
                l();
                this.h.a();
                this.b.unlock();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ayp
    public final void h() {
        g();
        e();
    }

    @Override // defpackage.ayp
    public final ayt i() {
        azb.a(j(), "GoogleApiClient is not connected yet.");
        azb.a(this.x.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        bbn bbn = new bbn(this);
        if (this.d.containsKey(bir.a)) {
            a((ayp) this, bbn, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            azz azz = new azz(this, atomicReference, bbn);
            baa baa = new baa(bbn);
            ayq a = new ayq(this.k).a(bir.b);
            azb.b(azz, "Listener must not be null");
            a.e.add(azz);
            azb.b(baa, "Listener must not be null");
            a.f.add(baa);
            bac bac = this.p;
            azb.b(bac, "Handler must not be null");
            a.d = bac.getLooper();
            ayp a2 = a.a();
            atomicReference.set(a2);
            a2.e();
        }
        return bbn;
    }

    /* access modifiers changed from: private */
    public final void a(ayp ayp, bbn bbn, boolean z) {
        ayp.b(new biv(ayp, (byte) 0)).a((ayx) new bab(this, bbn, z, ayp));
    }

    @Override // defpackage.ayp
    public final boolean j() {
        return this.i != null && this.i.d();
    }

    @Override // defpackage.ayp
    public final boolean k() {
        return this.i != null && this.i.e();
    }

    private final void b(int i2) {
        if (this.x == null) {
            this.x = Integer.valueOf(i2);
        } else if (this.x.intValue() != i2) {
            String c2 = c(i2);
            String c3 = c(this.x.intValue());
            throw new IllegalStateException(new StringBuilder(String.valueOf(c2).length() + 51 + String.valueOf(c3).length()).append("Cannot use sign-in mode: ").append(c2).append(". Mode was already set to ").append(c3).toString());
        }
        if (this.i == null) {
            boolean z = false;
            boolean z2 = false;
            for (ayj ayj : this.d.values()) {
                if (ayj.h()) {
                    z2 = true;
                }
                if (ayj.c()) {
                    z = true;
                } else {
                    z = z;
                }
            }
            switch (this.x.intValue()) {
                case 1:
                    if (!z2) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z2) {
                        Context context = this.k;
                        Lock lock = this.b;
                        Looper looper = this.l;
                        axt axt = this.q;
                        Map map = this.d;
                        bdj bdj = this.s;
                        Map map2 = this.t;
                        ayf ayf = this.u;
                        ArrayList arrayList = this.w;
                        ayj ayj2 = null;
                        qr qrVar = new qr();
                        qr qrVar2 = new qr();
                        for (Map.Entry entry : map.entrySet()) {
                            ayj ayj3 = (ayj) entry.getValue();
                            if (ayj3.c()) {
                                ayj2 = ayj3;
                            }
                            if (ayj3.h()) {
                                qrVar.put((ayh) entry.getKey(), ayj3);
                            } else {
                                qrVar2.put((ayh) entry.getKey(), ayj3);
                            }
                        }
                        azb.a(!qrVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        qr qrVar3 = new qr();
                        qr qrVar4 = new qr();
                        for (ayd ayd : map2.keySet()) {
                            ayh b2 = ayd.b();
                            if (qrVar.containsKey(b2)) {
                                qrVar3.put(ayd, (Boolean) map2.get(ayd));
                            } else if (qrVar2.containsKey(b2)) {
                                qrVar4.put(ayd, (Boolean) map2.get(ayd));
                            } else {
                                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = arrayList;
                        int size = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            bch bch = (bch) obj;
                            if (qrVar3.containsKey(bch.a)) {
                                arrayList2.add(bch);
                            } else if (qrVar4.containsKey(bch.a)) {
                                arrayList3.add(bch);
                            } else {
                                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            }
                        }
                        this.i = new bcj(context, this, lock, looper, axt, qrVar, qrVar2, bdj, ayf, ayj2, arrayList2, arrayList3, qrVar3, qrVar4);
                        return;
                    }
                    break;
            }
            this.i = new baf(this.k, this, this.b, this.l, this.q, this.d, this.s, this.t, this.u, this.w, this);
        }
    }

    private final void n() {
        this.h.e = true;
        this.i.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        if (!this.m) {
            return false;
        }
        this.m = false;
        this.p.removeMessages(2);
        this.p.removeMessages(1);
        if (this.r != null) {
            this.r.a();
            this.r = null;
        }
        return true;
    }

    @Override // defpackage.ayp
    public final void a(ayr ayr) {
        this.h.a(ayr);
    }

    @Override // defpackage.ayp
    public final void b(ayr ayr) {
        bem bem = this.h;
        azb.b(ayr);
        synchronized (bem.i) {
            if (!bem.b.remove(ayr)) {
                String valueOf = String.valueOf(ayr);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 52).append("unregisterConnectionCallbacks(): listener ").append(valueOf).append(" not found").toString());
            } else if (bem.g) {
                bem.c.add(ayr);
            }
        }
    }

    @Override // defpackage.ayp
    public final void a(ays ays) {
        this.h.a(ays);
    }

    @Override // defpackage.ayp
    public final void b(ays ays) {
        bem bem = this.h;
        azb.b(ays);
        synchronized (bem.i) {
            if (!bem.d.remove(ays)) {
                String valueOf = String.valueOf(ays);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(valueOf).append(" not found").toString());
            }
        }
    }

    @Override // defpackage.bav
    public final void a(Bundle bundle) {
        boolean z;
        boolean z2 = true;
        int i2 = 0;
        while (!this.c.isEmpty()) {
            b((bca) this.c.remove());
        }
        bem bem = this.h;
        azb.a(Looper.myLooper() == bem.h.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (bem.i) {
            if (!bem.g) {
                z = true;
            } else {
                z = false;
            }
            azb.a(z);
            bem.h.removeMessages(1);
            bem.g = true;
            if (bem.c.size() != 0) {
                z2 = false;
            }
            azb.a(z2);
            ArrayList arrayList = new ArrayList(bem.b);
            int i3 = bem.f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                ayr ayr = (ayr) obj;
                if (!bem.e || !bem.a.f() || bem.f.get() != i3) {
                    break;
                } else if (!bem.c.contains(ayr)) {
                    ayr.a(bundle);
                }
            }
            bem.c.clear();
            bem.g = false;
        }
    }

    @Override // defpackage.bav
    public final void a(axq axq) {
        int i2 = 0;
        if (!axv.a(this.k, axq.b)) {
            l();
        }
        if (!this.m) {
            bem bem = this.h;
            azb.a(Looper.myLooper() == bem.h.getLooper(), "onConnectionFailure must only be called on the Handler thread");
            bem.h.removeMessages(1);
            synchronized (bem.i) {
                ArrayList arrayList = new ArrayList(bem.d);
                int i3 = bem.f.get();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ays ays = (ays) obj;
                    if (bem.e && bem.f.get() == i3) {
                        if (bem.d.contains(ays)) {
                            ays.a(axq);
                        }
                    }
                }
            }
            this.h.a();
        }
    }

    @Override // defpackage.bav
    public final void a(int i2, boolean z) {
        int i3 = 0;
        if (i2 == 1 && !z && !this.m) {
            this.m = true;
            if (this.r == null) {
                this.r = axt.a(this.k.getApplicationContext(), new bad(this));
            }
            this.p.sendMessageDelayed(this.p.obtainMessage(1), this.n);
            this.p.sendMessageDelayed(this.p.obtainMessage(2), this.o);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.g.c.toArray(bbr.b)) {
            basePendingResult.b(bbr.a);
        }
        bem bem = this.h;
        azb.a(Looper.myLooper() == bem.h.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
        bem.h.removeMessages(1);
        synchronized (bem.i) {
            bem.g = true;
            ArrayList arrayList = new ArrayList(bem.b);
            int i4 = bem.f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ayr ayr = (ayr) obj;
                if (!bem.e || bem.f.get() != i4) {
                    break;
                } else if (bem.b.contains(ayr)) {
                    ayr.a(i2);
                }
            }
            bem.c.clear();
            bem.g = false;
        }
        this.h.a();
        if (i2 == 2) {
            n();
        }
    }

    @Override // defpackage.ayp
    public final Context b() {
        return this.k;
    }

    @Override // defpackage.ayp
    public final Looper c() {
        return this.l;
    }

    @Override // defpackage.ayp
    public final boolean a(bbh bbh) {
        return this.i != null && this.i.a(bbh);
    }

    @Override // defpackage.ayp
    public final void d() {
        if (this.i != null) {
            this.i.f();
        }
    }

    /* access modifiers changed from: package-private */
    public final String m() {
        StringWriter stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // defpackage.ayp
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.k);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.m);
        printWriter.append(" mWorkQueue.size()=").print(this.c.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.g.c.size());
        if (this.i != null) {
            this.i.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static int a(Iterable iterable, boolean z) {
        boolean z2;
        Iterator it = iterable.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            ayj ayj = (ayj) it.next();
            if (ayj.h()) {
                z4 = true;
            }
            if (ayj.c()) {
                z2 = true;
            } else {
                z2 = z3;
            }
            z3 = z2;
        }
        if (!z4) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    private static String c(int i2) {
        switch (i2) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    static /* synthetic */ void a(azx azx) {
        azx.b.lock();
        try {
            if (azx.m) {
                azx.n();
            }
        } finally {
            azx.b.unlock();
        }
    }

    static /* synthetic */ void b(azx azx) {
        azx.b.lock();
        try {
            if (azx.l()) {
                azx.n();
            }
        } finally {
            azx.b.unlock();
        }
    }
}
