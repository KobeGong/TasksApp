package defpackage;

/* renamed from: azv reason: default package */
/* compiled from: PG */
public final class azv implements defpackage.bae {
    private final defpackage.baf a;

    public azv(defpackage.baf baf) {
        this.a = baf;
    }

    public final void a() {
        for (defpackage.ayj e : this.a.f.values()) {
            e.e();
        }
        this.a.m.e = java.util.Collections.emptySet();
    }

    public final defpackage.bca a(defpackage.bca bca) {
        this.a.m.c.add(bca);
        return bca;
    }

    public final defpackage.bca b(defpackage.bca bca) {
        throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        defpackage.baf baf = this.a;
        baf.a.lock();
        try {
            baf.k = new defpackage.azk(baf, baf.h, baf.i, baf.d, baf.j, baf.a, baf.c);
            baf.k.a();
            baf.b.signalAll();
        } finally {
            baf.a.unlock();
        }
    }

    public final void a(android.os.Bundle bundle) {
    }

    public final void a(defpackage.axq axq, defpackage.ayd ayd, boolean z) {
    }

    public final void a(int i) {
    }
}
