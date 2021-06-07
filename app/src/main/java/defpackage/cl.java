package defpackage;

import java.util.ArrayList;

/* renamed from: cl  reason: default package */
/* compiled from: PG */
public final class cl {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public cl(ch chVar) {
        this.a = chVar.t;
        this.b = chVar.u;
        this.c = chVar.c();
        this.d = chVar.f();
        ArrayList l = chVar.l();
        int size = l.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new cm((cg) l.get(i)));
        }
    }
}
