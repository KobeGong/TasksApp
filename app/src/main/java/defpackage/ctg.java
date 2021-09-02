package defpackage;

/* renamed from: ctg reason: default package */
/* compiled from: PG */
final class ctg extends defpackage.csv {
    private final transient java.lang.Object a;
    private transient int b;

    ctg(java.lang.Object obj) {
        this.a = defpackage.cld.a(obj);
    }

    ctg(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final int size() {
        return 1;
    }

    public final boolean contains(java.lang.Object obj) {
        return this.a.equals(obj);
    }

    public final defpackage.cth a() {
        return new defpackage.csy(this.a);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.csp e() {
        return defpackage.csp.a(this.a);
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int a(java.lang.Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return this.b != 0;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.a.toString();
        return new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 2).append('[').append(obj).append(']').toString();
    }

    public final /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }
}
