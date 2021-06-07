package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* renamed from: cxo  reason: default package */
/* compiled from: PG */
abstract class cxo extends cxq implements Runnable {
    public csn a;
    public final boolean b;
    public final /* synthetic */ cxn c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    cxo(cxn cxn, csn csn, boolean z) {
        super(csn.size());
        this.c = cxn;
        this.a = (csn) cld.a(csn);
        this.b = z;
    }

    /* access modifiers changed from: package-private */
    public abstract void c();

    public final void run() {
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a(Throwable th) {
        boolean z;
        boolean z2;
        String str;
        boolean z3 = true;
        cld.a((Object) th);
        if (this.b) {
            z2 = this.c.a(th);
            if (z2) {
                b();
                z = true;
            } else {
                Set set = this.seenExceptions;
                if (set == null) {
                    Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                    a(newSetFromMap);
                    cxq.d.a(this, newSetFromMap);
                    set = this.seenExceptions;
                }
                z = cxn.a(set, th);
            }
        } else {
            z = true;
            z2 = false;
        }
        boolean z4 = th instanceof Error;
        boolean z5 = this.b;
        if (z2) {
            z3 = false;
        }
        if ((z & z3 & z5) || z4) {
            if (th instanceof Error) {
                str = "Input Future failed with Error";
            } else {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            cxn.e.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture$RunningState", "handleException", str, th);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxq
    public final void a(Set set) {
        if (!this.c.isCancelled()) {
            cxn.a(set, ((cxc) this.c.value).b);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int a2 = cxq.d.a(this);
        cld.b(a2 >= 0, "Less than 0 remaining futures");
        if (a2 == 0) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.a = null;
    }

    /* access modifiers changed from: package-private */
    public void d() {
    }
}
