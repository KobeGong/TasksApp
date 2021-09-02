package defpackage;

/* renamed from: duu reason: default package */
/* compiled from: PG */
public final class duu extends defpackage.dxm {
    private boolean b;
    private final defpackage.dpw c;
    private final int d;

    public duu(defpackage.dpw dpw) {
        this(dpw, defpackage.bg.av);
    }

    public duu(defpackage.dpw dpw, int i) {
        defpackage.cld.a(!dpw.a(), (java.lang.Object) "error must not be OK");
        this.c = dpw;
        this.d = i;
    }

    public final void a(defpackage.dzq dzq) {
        defpackage.cld.b(!this.b, (java.lang.Object) "already started");
        this.b = true;
        dzq.a(this.c, this.d, new defpackage.dor());
    }
}
