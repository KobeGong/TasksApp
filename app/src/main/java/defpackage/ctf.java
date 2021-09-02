package defpackage;

/* renamed from: ctf reason: default package */
/* compiled from: PG */
final class ctf extends defpackage.csv {
    public static final defpackage.ctf a = new defpackage.ctf(new java.lang.Object[0], 0, null, 0, 0);
    private final transient java.lang.Object[] b;
    private final transient java.lang.Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient int f;

    ctf(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i2;
        this.e = i;
        this.f = i3;
    }

    public final boolean contains(java.lang.Object obj) {
        java.lang.Object[] objArr = this.c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = defpackage.cky.a(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = a2 & this.d;
            java.lang.Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i + 1;
        }
    }

    public final int size() {
        return this.f;
    }

    public final defpackage.cth a() {
        return (defpackage.cth) b().iterator();
    }

    /* access modifiers changed from: 0000 */
    public final int a(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.b, 0, objArr, i, this.f);
        return this.f + i;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.csp e() {
        return defpackage.csp.b(this.b, this.f);
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return true;
    }

    public final /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }
}
