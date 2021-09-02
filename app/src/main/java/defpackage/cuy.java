package defpackage;

/* renamed from: cuy reason: default package */
/* compiled from: PG */
public final class cuy {
    public static final defpackage.cuy a = new defpackage.cuy(java.util.Collections.unmodifiableSortedMap(new java.util.TreeMap()));
    public final java.util.SortedMap b;
    private java.lang.Integer c = null;
    private java.lang.String d = null;

    private cuy(java.util.SortedMap sortedMap) {
        this.b = sortedMap;
    }

    public final void a(defpackage.cun cun) {
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Set<java.lang.Object> set = (java.util.Set) entry.getValue();
            if (!set.isEmpty()) {
                for (java.lang.Object a2 : set) {
                    cun.a(str, a2);
                }
            } else {
                cun.a(str, null);
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cuy) && ((defpackage.cuy) obj).b.equals(this.b);
    }

    public final int hashCode() {
        if (this.c == null) {
            this.c = java.lang.Integer.valueOf(this.b.hashCode());
        }
        return this.c.intValue();
    }

    public final java.lang.String toString() {
        if (this.d == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            defpackage.cum cum = new defpackage.cum("[ ", " ]", sb);
            a(cum);
            cum.a();
            this.d = sb.toString();
        }
        return this.d;
    }

    static {
        new defpackage.cuz();
        java.util.Collections.unmodifiableSortedSet(new java.util.TreeSet());
    }
}
