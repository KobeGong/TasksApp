package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: bak  reason: default package */
/* compiled from: PG */
public final class bak implements ayr, ays, bci {
    public final ayj a;
    public final aze b;
    public final Set c = new HashSet();
    public final Map d = new HashMap();
    public final int e;
    public boolean f;
    public final /* synthetic */ baj g;
    private final Queue h = new LinkedList();
    private final bbu i;
    private final bbi j;
    private axq k = null;

    public bak(baj baj, ayn ayn) {
        this.g = baj;
        this.a = ayn.a(baj.g.getLooper(), this);
        if (this.a instanceof bef) {
            bef.q();
        }
        this.i = ayn.c;
        this.b = new aze();
        this.e = ayn.e;
        if (this.a.h()) {
            this.j = ayn.a(baj.k, baj.g);
        } else {
            this.j = null;
        }
    }

    @Override // defpackage.ayr
    public final void a(Bundle bundle) {
        if (Looper.myLooper() == this.g.g.getLooper()) {
            a();
        } else {
            this.g.g.post(new bal(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        d();
        b(axq.a);
        f();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next();
            jn jnVar = null;
            try {
                new bpw();
                jnVar.a();
            } catch (DeadObjectException e2) {
                a(1);
                this.a.e();
            } catch (RemoteException e3) {
            }
        }
        while (this.a.f() && !this.h.isEmpty()) {
            b((aza) this.h.remove());
        }
        g();
    }

    @Override // defpackage.ayr
    public final void a(int i2) {
        if (Looper.myLooper() == this.g.g.getLooper()) {
            b();
        } else {
            this.g.g.post(new bam(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        d();
        this.f = true;
        this.b.a(true, bbr.a);
        this.g.g.sendMessageDelayed(Message.obtain(this.g.g, 9, this.i), this.g.h);
        this.g.g.sendMessageDelayed(Message.obtain(this.g.g, 11, this.i), this.g.i);
        this.g.m = -1;
    }

    @Override // defpackage.bci
    public final void a(axq axq, ayd ayd, boolean z) {
        if (Looper.myLooper() == this.g.g.getLooper()) {
            a(axq);
        } else {
            this.g.g.post(new ban(this, axq));
        }
    }

    @Override // defpackage.ays
    public final void a(axq axq) {
        azb.a(this.g.g);
        if (this.j != null) {
            bbi bbi = this.j;
            if (bbi.f != null) {
                bbi.f.e();
            }
        }
        d();
        this.g.m = -1;
        b(axq);
        if (axq.b == 4) {
            a(baj.b);
        } else if (this.h.isEmpty()) {
            this.k = axq;
        } else {
            synchronized (baj.c) {
                baj.b();
            }
            if (!this.g.a(axq, this.e)) {
                if (axq.b == 18) {
                    this.f = true;
                }
                if (this.f) {
                    this.g.g.sendMessageDelayed(Message.obtain(this.g.g, 9, this.i), this.g.h);
                    return;
                }
                String str = this.i.a.b;
                a(new Status(17, new StringBuilder(String.valueOf(str).length() + 38).append("API: ").append(str).append(" is not available on this device.").toString()));
            }
        }
    }

    public final void a(aza aza) {
        azb.a(this.g.g);
        if (this.a.f()) {
            b(aza);
            g();
            return;
        }
        this.h.add(aza);
        if (this.k == null || !this.k.a()) {
            h();
        } else {
            a(this.k);
        }
    }

    public final void c() {
        azb.a(this.g.g);
        a(baj.a);
        this.b.a(false, baj.a);
        for (bbc bbc : (bbc[]) this.d.keySet().toArray(new bbc[this.d.size()])) {
            a(new bbt(bbc, new bpw()));
        }
        b(new axq(4));
        if (this.a.f()) {
            this.a.a(new bdb(this));
        }
    }

    public final void d() {
        azb.a(this.g.g);
        this.k = null;
    }

    public final axq e() {
        azb.a(this.g.g);
        return this.k;
    }

    private final void b(aza aza) {
        aza.a(this.b, j());
        try {
            aza.a(this);
        } catch (DeadObjectException e2) {
            a(1);
            this.a.e();
        }
    }

    public final void a(Status status) {
        azb.a(this.g.g);
        for (aza aza : this.h) {
            aza.a(status);
        }
        this.h.clear();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (this.f) {
            this.g.g.removeMessages(11, this.i);
            this.g.g.removeMessages(9, this.i);
            this.f = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.g.g.removeMessages(12, this.i);
        this.g.g.sendMessageDelayed(this.g.g.obtainMessage(12, this.i), this.g.j);
    }

    public final void h() {
        azb.a(this.g.g);
        if (!this.a.f() && !this.a.g()) {
            this.a.i();
            if (this.g.m != 0) {
                baj baj = this.g;
                axt unused = this.g.l;
                baj.m = axv.a(this.g.k);
                if (this.g.m != 0) {
                    a(new axq(this.g.m, null));
                    return;
                }
            }
            bbl bbl = new bbl(this.g, this.a, this.i);
            if (this.a.h()) {
                bbi bbi = this.j;
                if (bbi.f != null) {
                    bbi.f.e();
                }
                bbi.e.h = Integer.valueOf(System.identityHashCode(bbi));
                bbi.f = (bps) bbi.c.a(bbi.a, bbi.b.getLooper(), bbi.e, bbi.e.g, bbi, bbi);
                bbi.g = bbl;
                if (bbi.d == null || bbi.d.isEmpty()) {
                    bbi.b.post(new bbj(bbi));
                } else {
                    bbi.f.r();
                }
            }
            this.a.a(bbl);
        }
    }

    private final void b(axq axq) {
        for (bbx bbx : this.c) {
            String str = null;
            if (axq == axq.a) {
                str = this.a.j();
            }
            bbx.a(this.i, axq, str);
        }
        this.c.clear();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.a.f();
    }

    public final boolean j() {
        return this.a.h();
    }
}
