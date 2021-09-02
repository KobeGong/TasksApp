package defpackage;

/* renamed from: dye reason: default package */
/* compiled from: PG */
final class dye implements java.lang.Runnable {
    private final /* synthetic */ java.util.Collection a;
    private final /* synthetic */ defpackage.dza b;
    private final /* synthetic */ defpackage.dyb c;

    dye(defpackage.dyb dyb, java.util.Collection collection, defpackage.dza dza) {
        this.c = dyb;
        this.a = collection;
        this.b = dza;
    }

    public final void run() {
        for (defpackage.dza dza : this.a) {
            if (dza != this.b) {
                dza.a.b(defpackage.dyb.b);
            }
        }
        this.c.b();
    }
}
