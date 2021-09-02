package defpackage;

/* renamed from: bde reason: default package */
/* compiled from: PG */
public abstract class bde {
    public java.lang.Object a;
    public boolean b = false;
    private /* synthetic */ defpackage.bcx c;

    public bde(defpackage.bcx bcx, java.lang.Object obj) {
        this.c = bcx;
        this.a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(java.lang.Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        d();
        synchronized (this.c.p) {
            this.c.p.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
