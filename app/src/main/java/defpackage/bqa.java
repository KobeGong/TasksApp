package defpackage;

/* renamed from: bqa reason: default package */
/* compiled from: PG */
public final class bqa extends defpackage.bpv {
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.bpz b = new defpackage.bpz();
    public boolean c;
    public java.lang.Exception d;

    bqa() {
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.d == null;
        }
        return z;
    }

    public final java.lang.Exception b() {
        java.lang.Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    public final defpackage.bpv a(java.util.concurrent.Executor executor, defpackage.bpu bpu) {
        defpackage.bpz bpz = this.b;
        defpackage.bpy bpy = new defpackage.bpy(executor, bpu);
        synchronized (bpz.a) {
            if (bpz.b == null) {
                bpz.b = new java.util.ArrayDeque();
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

    public final boolean a(java.lang.Exception exc) {
        boolean z = true;
        defpackage.azb.b((java.lang.Object) exc, (java.lang.Object) "Exception must not be null");
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

    /* access modifiers changed from: 0000 */
    public final void d() {
        defpackage.azb.a(!this.c, (java.lang.Object) "Task is already complete");
    }
}
