package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: clr  reason: default package */
/* compiled from: PG */
public final class clr {
    public volatile boolean a;
    private final List b;

    public clr() {
        this.b = new ArrayList();
    }

    public final synchronized void a() {
        if (!this.a) {
            this.a = true;
            cdm.a(3, "PrimesShutdown", "Shutdown ...", new Object[0]);
            synchronized (this.b) {
                for (cls cls : this.b) {
                    try {
                        cls.a();
                    } catch (RuntimeException e) {
                        cdm.a("PrimesShutdown", "ShutdownListener crashed", e, new Object[0]);
                    }
                }
                this.b.clear();
                cdm.a(3, "PrimesShutdown", "All ShutdownListeners notified.", new Object[0]);
            }
        }
    }

    public final void a(clt clt) {
        if (!this.a && ((Boolean) clt.a()).booleanValue()) {
            a();
        }
    }

    public final boolean a(cls cls) {
        boolean z;
        synchronized (this.b) {
            if (!this.a) {
                this.b.add((cls) cky.a(cls));
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public clr(byte b2) {
        this();
    }
}
