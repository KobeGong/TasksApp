package defpackage;

import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: l  reason: default package */
/* compiled from: PG */
public abstract class l implements Iterator, m {
    private j a;
    private j b;

    l(j jVar, j jVar2) {
        this.a = jVar2;
        this.b = jVar;
    }

    /* access modifiers changed from: package-private */
    public abstract j a(j jVar);

    /* access modifiers changed from: package-private */
    public abstract j b(j jVar);

    public boolean hasNext() {
        return this.b != null;
    }

    @Override // defpackage.m
    public final void a_(j jVar) {
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

    private final j a() {
        if (this.b == this.a || this.a == null) {
            return null;
        }
        return a(this.b);
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        j jVar = this.b;
        this.b = a();
        return jVar;
    }
}
