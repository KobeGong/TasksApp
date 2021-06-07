package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: cpn  reason: default package */
/* compiled from: PG */
public final class cpn {
    public Object a;
    private final ecz b;
    private final int c;
    private WeakReference d;
    private boolean e = false;
    private boolean f = true;

    public cpn(ecz ecz) {
        this.b = ecz;
        this.c = 20;
    }

    public final synchronized Object a() {
        Object obj = null;
        synchronized (this) {
            if (!this.e) {
                this.e = true;
                cpo.a(this);
            }
            if (this.a != null) {
                obj = this.a;
            } else {
                if (this.d != null) {
                    obj = this.d.get();
                }
                if (obj == null) {
                    obj = cky.a(this.b.a());
                    if (this.f) {
                        this.a = obj;
                        this.d = null;
                    } else {
                        this.d = new WeakReference(obj);
                    }
                }
            }
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        Object obj = null;
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
                    this.d = new WeakReference(this.a);
                    this.a = null;
                }
            }
        }
    }
}
