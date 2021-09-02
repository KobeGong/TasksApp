package defpackage;

/* renamed from: ctc reason: default package */
/* compiled from: PG */
final class ctc extends defpackage.csp {
    private final /* synthetic */ defpackage.ctb a;

    ctc(defpackage.ctb ctb) {
        this.a = ctb;
    }

    public final int size() {
        return this.a.b;
    }

    public final boolean c() {
        return true;
    }

    public final /* synthetic */ java.lang.Object get(int i) {
        defpackage.cld.a(i, this.a.b);
        return new java.util.AbstractMap.SimpleImmutableEntry(this.a.a[i * 2], this.a.a[(i * 2) + 1]);
    }
}
