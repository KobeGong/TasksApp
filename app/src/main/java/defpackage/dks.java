package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dks  reason: default package */
/* compiled from: PG */
final class dks implements Iterator {
    private int a = -1;
    private boolean b;
    private Iterator c;
    private final /* synthetic */ dkk d;

    dks(dkk dkk) {
        this.d = dkk;
    }

    public final boolean hasNext() {
        return this.a + 1 < this.d.a.size() || (!this.d.b.isEmpty() && a().hasNext());
    }

    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        this.d.e();
        if (this.a < this.d.a.size()) {
            dkk dkk = this.d;
            int i = this.a;
            this.a = i - 1;
            dkk.c(i);
            return;
        }
        a().remove();
    }

    private final Iterator a() {
        if (this.c == null) {
            this.c = this.d.b.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.a.size()) {
            return (Map.Entry) this.d.a.get(this.a);
        }
        return (Map.Entry) a().next();
    }
}
