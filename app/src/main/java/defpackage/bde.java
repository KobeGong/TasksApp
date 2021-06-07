package defpackage;

/* renamed from: bde  reason: default package */
/* compiled from: PG */
public abstract class bde {
    public Object a;
    public boolean b = false;
    private /* synthetic */ bcx c;

    public bde(bcx bcx, Object obj) {
        this.c = bcx;
        this.a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

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
