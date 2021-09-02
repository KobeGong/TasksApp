package defpackage;

/* renamed from: cl reason: default package */
/* compiled from: PG */
public final class cl {
    public int a;
    public int b;
    public int c;
    public int d;
    public java.util.ArrayList e = new java.util.ArrayList();

    public cl(defpackage.ch chVar) {
        this.a = chVar.t;
        this.b = chVar.u;
        this.c = chVar.c();
        this.d = chVar.f();
        java.util.ArrayList l = chVar.l();
        int size = l.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new defpackage.cm((defpackage.cg) l.get(i)));
        }
    }
}
