package defpackage;

/* renamed from: bpw reason: default package */
/* compiled from: PG */
public final class bpw {
    public final defpackage.bqa a = new defpackage.bqa();

    public final void a() {
        defpackage.bqa bqa = this.a;
        synchronized (bqa.a) {
            bqa.d();
            bqa.c = true;
        }
        bqa.b.a(bqa);
    }

    public final void a(java.lang.Exception exc) {
        defpackage.bqa bqa = this.a;
        defpackage.azb.b((java.lang.Object) exc, (java.lang.Object) "Exception must not be null");
        synchronized (bqa.a) {
            bqa.d();
            bqa.c = true;
            bqa.d = exc;
        }
        bqa.b.a(bqa);
    }

    public final boolean b(java.lang.Exception exc) {
        return this.a.a(exc);
    }
}
