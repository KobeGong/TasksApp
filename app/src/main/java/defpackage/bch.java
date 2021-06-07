package defpackage;

import android.os.Bundle;

/* renamed from: bch  reason: default package */
/* compiled from: PG */
public final class bch implements ayr, ays {
    public final ayd a;
    public bci b;
    private final boolean c;

    public bch(ayd ayd, boolean z) {
        this.a = ayd;
        this.c = z;
    }

    @Override // defpackage.ayr
    public final void a(Bundle bundle) {
        a();
        this.b.a(bundle);
    }

    @Override // defpackage.ayr
    public final void a(int i) {
        a();
        this.b.a(i);
    }

    @Override // defpackage.ays
    public final void a(axq axq) {
        a();
        this.b.a(axq, this.a, this.c);
    }

    private final void a() {
        azb.b(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
