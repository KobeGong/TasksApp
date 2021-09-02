package defpackage;

/* renamed from: csj reason: default package */
/* compiled from: PG */
public final class csj implements java.lang.Iterable {
    private final defpackage.crv a;
    private final /* synthetic */ java.lang.Iterable b;
    private final /* synthetic */ int c;

    protected csj() {
        this.a = defpackage.crk.a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        boolean z = true;
        for (java.lang.Object append : (java.lang.Iterable) this.a.a(this)) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(append);
        }
        return sb.append(']').toString();
    }

    public csj(java.lang.Iterable iterable, int i) {
        this.b = iterable;
        this.c = i;
        this();
    }

    public final java.util.Iterator iterator() {
        boolean z;
        if (this.b instanceof java.util.List) {
            java.util.List list = (java.util.List) this.b;
            return list.subList(java.lang.Math.min(list.size(), this.c), list.size()).iterator();
        }
        java.util.Iterator it = this.b.iterator();
        int i = this.c;
        defpackage.cld.a((java.lang.Object) it);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z, (java.lang.Object) "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new defpackage.csx(it);
    }
}
