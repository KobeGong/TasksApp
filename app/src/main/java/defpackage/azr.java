package defpackage;

/* renamed from: azr reason: default package */
/* compiled from: PG */
final class azr extends defpackage.bke {
    private final java.lang.ref.WeakReference a;

    azr(defpackage.azk azk) {
        super(0);
        this.a = new java.lang.ref.WeakReference(azk);
    }

    public final void a(defpackage.bkk bkk) {
        defpackage.azk azk = (defpackage.azk) this.a.get();
        if (azk != null) {
            azk.a.a((defpackage.bag) new defpackage.azs(azk, azk, bkk));
        }
    }
}
