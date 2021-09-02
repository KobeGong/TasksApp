package defpackage;

/* renamed from: l reason: default package */
/* compiled from: PG */
abstract class l implements java.util.Iterator, defpackage.m {
    private defpackage.j a;
    private defpackage.j b;

    l(defpackage.j jVar, defpackage.j jVar2) {
        this.a = jVar2;
        this.b = jVar;
    }

    /* access modifiers changed from: 0000 */
    public abstract defpackage.j a(defpackage.j jVar);

    /* access modifiers changed from: 0000 */
    public abstract defpackage.j b(defpackage.j jVar);

    public boolean hasNext() {
        return this.b != null;
    }

    public final void a_(defpackage.j jVar) {
        if (this.a == jVar && jVar == this.b) {
            this.b = null;
            this.a = null;
        }
        if (this.a == jVar) {
            this.a = b(this.a);
        }
        if (this.b == jVar) {
            this.b = a();
        }
    }

    private final defpackage.j a() {
        if (this.b == this.a || this.a == null) {
            return null;
        }
        return a(this.b);
    }

    public /* synthetic */ java.lang.Object next() {
        defpackage.j jVar = this.b;
        this.b = a();
        return jVar;
    }
}
