package defpackage;

/* renamed from: ctb reason: default package */
/* compiled from: PG */
final class ctb extends defpackage.csv {
    public final transient java.lang.Object[] a;
    public final transient int b;
    private final transient defpackage.css c;

    ctb(defpackage.css css, java.lang.Object[] objArr, int i) {
        this.c = css;
        this.a = objArr;
        this.b = i;
    }

    public final defpackage.cth a() {
        return (defpackage.cth) b().iterator();
    }

    /* access modifiers changed from: 0000 */
    public final int a(java.lang.Object[] objArr, int i) {
        return b().a(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.csp e() {
        return new defpackage.ctc(this);
    }

    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value == null || !value.equals(this.c.get(key))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return true;
    }

    public final int size() {
        return this.b;
    }

    public final /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }
}
