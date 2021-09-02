package defpackage;

/* renamed from: k reason: default package */
/* compiled from: PG */
public final class k implements java.util.Iterator, defpackage.m {
    private defpackage.j a;
    private boolean b = true;
    private final /* synthetic */ defpackage.g c;

    k(defpackage.g gVar) {
        this.c = gVar;
    }

    public final void a_(defpackage.j jVar) {
        if (jVar == this.a) {
            this.a = this.a.d;
            this.b = this.a == null;
        }
    }

    public final boolean hasNext() {
        if (this.b) {
            if (this.c.b != null) {
                return true;
            }
            return false;
        } else if (this.a == null || this.a.c == null) {
            return false;
        } else {
            return true;
        }
    }

    public final /* synthetic */ java.lang.Object next() {
        defpackage.j jVar;
        defpackage.k kVar;
        if (this.b) {
            this.b = false;
            jVar = this.c.b;
            kVar = this;
        } else if (this.a != null) {
            jVar = this.a.c;
            kVar = this;
        } else {
            jVar = null;
            kVar = this;
        }
        kVar.a = jVar;
        return this.a;
    }
}
