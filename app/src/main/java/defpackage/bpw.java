package defpackage;

/* renamed from: bpw  reason: default package */
/* compiled from: PG */
public final class bpw {
    public final bqa a = new bqa();

    public final void a() {
        bqa bqa = this.a;
        synchronized (bqa.a) {
            bqa.d();
            bqa.c = true;
        }
        bqa.b.a(bqa);
    }

    public final void a(Exception exc) {
        bqa bqa = this.a;
        azb.b(exc, "Exception must not be null");
        synchronized (bqa.a) {
            bqa.d();
            bqa.c = true;
            bqa.d = exc;
        }
        bqa.b.a(bqa);
    }

    public final boolean b(Exception exc) {
        return this.a.a(exc);
    }
}
