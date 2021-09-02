package defpackage;

/* renamed from: dug reason: default package */
/* compiled from: PG */
final class dug implements defpackage.dzq {
    public final defpackage.dzq a;
    public volatile boolean b;
    public java.util.List c = new java.util.ArrayList();

    public dug(defpackage.dzq dzq) {
        this.a = dzq;
    }

    private final void a(java.lang.Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public final void a(defpackage.dzr dzr) {
        if (this.b) {
            this.a.a(dzr);
        } else {
            a((java.lang.Runnable) new defpackage.duh(this, dzr));
        }
    }

    public final void a() {
        if (this.b) {
            this.a.a();
        } else {
            a((java.lang.Runnable) new defpackage.dui(this));
        }
    }

    public final void a(defpackage.dor dor) {
        a((java.lang.Runnable) new defpackage.duj(this, dor));
    }

    public final void b(defpackage.dpw dpw, defpackage.dor dor) {
        a((java.lang.Runnable) new defpackage.duk(this, dpw, dor));
    }

    public final void a(defpackage.dpw dpw, int i, defpackage.dor dor) {
        a((java.lang.Runnable) new defpackage.dul(this, dpw, i, dor));
    }
}
