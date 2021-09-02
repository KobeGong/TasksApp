package defpackage;

/* renamed from: bch reason: default package */
/* compiled from: PG */
public final class bch implements defpackage.ayr, defpackage.ays {
    public final defpackage.ayd a;
    public defpackage.bci b;
    private final boolean c;

    public bch(defpackage.ayd ayd, boolean z) {
        this.a = ayd;
        this.c = z;
    }

    public final void a(android.os.Bundle bundle) {
        a();
        this.b.a(bundle);
    }

    public final void a(int i) {
        a();
        this.b.a(i);
    }

    public final void a(defpackage.axq axq) {
        a();
        this.b.a(axq, this.a, this.c);
    }

    private final void a() {
        defpackage.azb.b((java.lang.Object) this.b, (java.lang.Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
