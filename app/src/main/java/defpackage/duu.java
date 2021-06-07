package defpackage;

/* renamed from: duu  reason: default package */
/* compiled from: PG */
public final class duu extends dxm {
    private boolean b;
    private final dpw c;
    private final int d;

    public duu(dpw dpw) {
        this(dpw, bg.av);
    }

    public duu(dpw dpw, int i) {
        cld.a(!dpw.a(), "error must not be OK");
        this.c = dpw;
        this.d = i;
    }

    @Override // defpackage.dta, defpackage.dxm
    public final void a(dzq dzq) {
        cld.b(!this.b, "already started");
        this.b = true;
        dzq.a(this.c, this.d, new dor());
    }
}
