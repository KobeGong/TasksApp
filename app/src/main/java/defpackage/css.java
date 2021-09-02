package defpackage;

/* renamed from: css reason: default package */
/* compiled from: PG */
public abstract class css implements java.io.Serializable, java.util.Map {
    private transient defpackage.csv a;
    private transient defpackage.csv b;
    private transient defpackage.csn c;

    public static defpackage.css a(java.util.Map map) {
        int i;
        if (!(map instanceof defpackage.css) || (map instanceof java.util.SortedMap)) {
            java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
            if (entrySet instanceof java.util.Collection) {
                i = entrySet.size();
            } else {
                i = 4;
            }
            defpackage.cst cst = new defpackage.cst(i);
            if (entrySet instanceof java.util.Collection) {
                cst.a(entrySet.size() + cst.a);
            }
            for (java.util.Map.Entry entry : entrySet) {
                cst.a(entry.getKey(), entry.getValue());
            }
            return cst.a();
        }
        defpackage.css css = (defpackage.css) map;
        css.d();
        return css;
    }

    /* access modifiers changed from: 0000 */
    public abstract defpackage.csv a();

    /* access modifiers changed from: 0000 */
    public abstract defpackage.csv b();

    /* access modifiers changed from: 0000 */
    public abstract defpackage.csn c();

    /* access modifiers changed from: 0000 */
    public abstract boolean d();

    public abstract java.lang.Object get(java.lang.Object obj);

    css() {
    }

    @java.lang.Deprecated
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(java.lang.Object obj) {
        return ((defpackage.csn) values()).contains(obj);
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return entrySet().equals(((java.util.Map) obj).entrySet());
    }

    public int hashCode() {
        return defpackage.cky.a((java.util.Set) (defpackage.csv) entrySet());
    }

    public java.lang.String toString() {
        int size = size();
        defpackage.cky.a(size, "size");
        java.lang.StringBuilder append = new java.lang.StringBuilder((int) java.lang.Math.min(((long) size) << 3, 1073741824)).append('{');
        boolean z = true;
        for (java.util.Map.Entry entry : entrySet()) {
            if (!z) {
                append.append(", ");
            }
            z = false;
            append.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return append.append('}').toString();
    }

    /* access modifiers changed from: 0000 */
    public java.lang.Object writeReplace() {
        return new defpackage.csu(this);
    }

    public /* synthetic */ java.util.Set entrySet() {
        defpackage.csv csv = this.a;
        if (csv != null) {
            return csv;
        }
        defpackage.csv a2 = a();
        this.a = a2;
        return a2;
    }

    public /* synthetic */ java.util.Collection values() {
        defpackage.csn csn = this.c;
        if (csn != null) {
            return csn;
        }
        defpackage.csn c2 = c();
        this.c = c2;
        return c2;
    }

    public /* synthetic */ java.util.Set keySet() {
        defpackage.csv csv = this.b;
        if (csv != null) {
            return csv;
        }
        defpackage.csv b2 = b();
        this.b = b2;
        return b2;
    }
}
