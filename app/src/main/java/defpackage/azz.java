package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: azz  reason: default package */
/* compiled from: PG */
final class azz implements ayr {
    private /* synthetic */ AtomicReference a;
    private /* synthetic */ bbn b;
    private /* synthetic */ azx c;

    azz(azx azx, AtomicReference atomicReference, bbn bbn) {
        this.c = azx;
        this.a = atomicReference;
        this.b = bbn;
    }

    @Override // defpackage.ayr
    public final void a(Bundle bundle) {
        this.c.a((azx) ((ayp) this.a.get()), (ayp) this.b, (bbn) true);
    }

    @Override // defpackage.ayr
    public final void a(int i) {
    }
}
