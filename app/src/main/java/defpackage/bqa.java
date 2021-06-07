package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: bqa  reason: default package */
/* compiled from: PG */
public final class bqa extends bpv {
    public final Object a = new Object();
    public final bpz b = new bpz();
    public boolean c;
    public Exception d;

    bqa() {
    }

    @Override // defpackage.bpv
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.d == null;
        }
        return z;
    }

    @Override // defpackage.bpv
    public final Exception b() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.bpv
    public final bpv a(Executor executor, bpu bpu) {
        bpz bpz = this.b;
        bpy bpy = new bpy(executor, bpu);
        synchronized (bpz.a) {
            if (bpz.b == null) {
                bpz.b = new ArrayDeque();
            }
            bpz.b.add(bpy);
        }
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
        return this;
    }

    public final boolean c() {
        boolean z = true;
        synchronized (this.a) {
            if (this.c) {
                z = false;
            } else {
                this.c = true;
                this.b.a(this);
            }
        }
        return z;
    }

    public final boolean a(Exception exc) {
        boolean z = true;
        azb.b(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                z = false;
            } else {
                this.c = true;
                this.d = exc;
                this.b.a(this);
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        azb.a(!this.c, "Task is already complete");
    }
}
