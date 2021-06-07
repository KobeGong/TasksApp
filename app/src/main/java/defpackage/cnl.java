package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: cnl  reason: default package */
/* compiled from: PG */
public final class cnl extends PhantomReference {
    public final String a;
    public cnl b;
    public cnl c;

    public cnl(Object obj, String str, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = str;
    }

    public final void a(cnl cnl) {
        cky.a(cnl);
        this.b = cnl;
        this.c = cnl.c;
        if (this.c != null) {
            this.c.b = this;
        }
        cnl.c = this;
    }

    public final cnl a() {
        if (this.b != null) {
            this.b.c = this.c;
        }
        if (this.c != null) {
            this.c.b = this.b;
        }
        this.c = null;
        this.b = null;
        return this;
    }
}
