package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

/* renamed from: azi  reason: default package */
/* compiled from: PG */
public final class azi implements bae {
    public final baf a;
    private boolean b = false;

    public azi(baf baf) {
        this.a = baf;
    }

    @Override // defpackage.bae
    public final void a() {
    }

    @Override // defpackage.bae
    public final bca a(bca bca) {
        return b(bca);
    }

    @Override // defpackage.bae
    public final bca b(bca bca) {
        try {
            this.a.m.g.a(bca);
            azx azx = this.a.m;
            ayj ayj = (ayj) azx.d.get(bca.c);
            azb.b(ayj, "Appropriate Api was not requested.");
            if (ayj.f() || !this.a.g.containsKey(bca.c)) {
                boolean z = ayj instanceof bef;
                ayk ayk = ayj;
                if (z) {
                    ayk = bef.q();
                }
                bca.b(ayk);
                return bca;
            }
            bca.c(new Status(17));
            return bca;
        } catch (DeadObjectException e) {
            this.a.a(new azj(this, this));
        }
    }

    @Override // defpackage.bae
    public final boolean b() {
        azx azx = this.a.m;
        azx.b.lock();
        azx.b.unlock();
        this.a.a((axq) null);
        return true;
    }

    @Override // defpackage.bae
    public final void c() {
    }

    @Override // defpackage.bae
    public final void a(Bundle bundle) {
    }

    @Override // defpackage.bae
    public final void a(axq axq, ayd ayd, boolean z) {
    }

    @Override // defpackage.bae
    public final void a(int i) {
        this.a.a((axq) null);
        this.a.n.a(i, false);
    }
}
