package defpackage;

import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: dye  reason: default package */
/* compiled from: PG */
public final class dye implements Runnable {
    private final /* synthetic */ Collection a;
    private final /* synthetic */ dza b;
    private final /* synthetic */ dyb c;

    dye(dyb dyb, Collection collection, dza dza) {
        this.c = dyb;
        this.a = collection;
        this.b = dza;
    }

    public final void run() {
        for (dza dza : this.a) {
            if (dza != this.b) {
                dza.a.b(dyb.b);
            }
        }
        this.c.b();
    }
}
