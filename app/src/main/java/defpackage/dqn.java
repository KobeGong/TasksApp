package defpackage;

/* renamed from: dqn reason: default package */
/* compiled from: PG */
public final class dqn extends defpackage.dvn {
    public final java.lang.Object a;
    public java.util.Queue b = new java.util.LinkedList();
    public boolean c;
    public boolean d = false;
    public int e;
    public defpackage.dpw f;
    public boolean g;
    public final /* synthetic */ defpackage.dqk h;

    public dqn(defpackage.dqk dqk, int i, defpackage.dzo dzo, java.lang.Object obj, defpackage.dzt dzt) {
        this.h = dqk;
        super(i, dzo, dzt);
        this.a = defpackage.cld.a(obj, (java.lang.Object) "lock");
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.dpw dpw, boolean z, defpackage.dor dor) {
        this.h.i.c();
        b(dpw, z, dor);
    }

    public final void a(java.lang.Throwable th) {
        a(defpackage.dpw.a(th), true, new defpackage.dor());
    }

    public final void a(java.lang.Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    public final void a(int i) {
        this.e -= i;
        if (this.e == 0 && !this.g) {
            this.h.i.a(java.nio.ByteBuffer.allocateDirect(4096));
        }
    }
}
