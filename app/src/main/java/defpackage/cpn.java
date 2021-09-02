package defpackage;

/* renamed from: cpn reason: default package */
/* compiled from: PG */
public final class cpn {
    public java.lang.Object a;
    private final defpackage.ecz b;
    private final int c;
    private java.lang.ref.WeakReference d;
    private boolean e = false;
    private boolean f = true;

    public cpn(defpackage.ecz ecz) {
        this.b = ecz;
        this.c = 20;
    }

    public final synchronized java.lang.Object a() {
        java.lang.Object obj = null;
        synchronized (this) {
            if (!this.e) {
                this.e = true;
                defpackage.cpo.a(this);
            }
            if (this.a != null) {
                obj = this.a;
            } else {
                if (this.d != null) {
                    obj = this.d.get();
                }
                if (obj == null) {
                    obj = defpackage.cky.a(this.b.a());
                    if (this.f) {
                        this.a = obj;
                        this.d = null;
                    } else {
                        this.d = new java.lang.ref.WeakReference(obj);
                    }
                }
            }
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(int i) {
        java.lang.Object obj = null;
        synchronized (this) {
            boolean z = this.c > i;
            if (z != this.f) {
                this.f = z;
                if (z) {
                    if (this.a == null) {
                        if (this.d != null) {
                            obj = this.d.get();
                        }
                        if (obj != null) {
                            this.a = obj;
                        } else {
                            this.d = null;
                        }
                    }
                } else if (this.a != null) {
                    this.d = new java.lang.ref.WeakReference(this.a);
                    this.a = null;
                }
            }
        }
    }
}
