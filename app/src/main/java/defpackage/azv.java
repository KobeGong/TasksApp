package defpackage;

import android.os.Bundle;
import java.util.Collections;

/* renamed from: azv  reason: default package */
/* compiled from: PG */
public final class azv implements bae {
    private final baf a;

    public azv(baf baf) {
        this.a = baf;
    }

    @Override // defpackage.bae
    public final void a() {
        for (ayj ayj : this.a.f.values()) {
            ayj.e();
        }
        this.a.m.e = Collections.emptySet();
    }

    @Override // defpackage.bae
    public final bca a(bca bca) {
        this.a.m.c.add(bca);
        return bca;
    }

    @Override // defpackage.bae
    public final bca b(bca bca) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.bae
    public final boolean b() {
        return true;
    }

    @Override // defpackage.bae
    public final void c() {
        baf baf = this.a;
        baf.a.lock();
        try {
            baf.k = new azk(baf, baf.h, baf.i, baf.d, baf.j, baf.a, baf.c);
            baf.k.a();
            baf.b.signalAll();
        } finally {
            baf.a.unlock();
        }
    }

    @Override // defpackage.bae
    public final void a(Bundle bundle) {
    }

    @Override // defpackage.bae
    public final void a(axq axq, ayd ayd, boolean z) {
    }

    @Override // defpackage.bae
    public final void a(int i) {
    }
}
