package defpackage;

/* renamed from: bad reason: default package */
/* compiled from: PG */
final class bad extends defpackage.bas {
    private java.lang.ref.WeakReference a;

    bad(defpackage.azx azx) {
        this.a = new java.lang.ref.WeakReference(azx);
    }

    public final void a() {
        defpackage.azx azx = (defpackage.azx) this.a.get();
        if (azx != null) {
            defpackage.azx.a(azx);
        }
    }
}
