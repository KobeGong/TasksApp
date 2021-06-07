package defpackage;

import java.util.Iterator;

/* renamed from: k  reason: default package */
/* compiled from: PG */
public final class k implements Iterator, m {
    private j a;
    private boolean b = true;
    private final /* synthetic */ g c;

    k(g gVar) {
        this.c = gVar;
    }

    @Override // defpackage.m
    public final void a_(j jVar) {
        if (jVar == this.a) {
            this.a = this.a.d;
            this.b = this.a == null;
        }
    }

    public final boolean hasNext() {
        return this.b ? this.c.b != null : (this.a == null || this.a.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        j jVar;
        k kVar;
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
