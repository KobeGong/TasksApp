package defpackage;

/* renamed from: ctd reason: default package */
/* compiled from: PG */
final class ctd extends defpackage.csv {
    private final transient defpackage.css a;
    private final transient defpackage.csp b;

    ctd(defpackage.css css, defpackage.csp csp) {
        this.a = css;
        this.b = csp;
    }

    public final defpackage.cth a() {
        return (defpackage.cth) b().iterator();
    }

    /* access modifiers changed from: 0000 */
    public final int a(java.lang.Object[] objArr, int i) {
        return b().a(objArr, i);
    }

    public final defpackage.csp b() {
        return this.b;
    }

    public final boolean contains(java.lang.Object obj) {
        return this.a.get(obj) != null;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return true;
    }

    public final int size() {
        return this.a.size();
    }

    public final /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }
}
