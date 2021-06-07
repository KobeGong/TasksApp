package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: css  reason: default package */
/* compiled from: PG */
public abstract class css implements Serializable, Map {
    private transient csv a;
    private transient csv b;
    private transient csn c;

    public static css a(Map map) {
        int i;
        if (!(map instanceof css) || (map instanceof SortedMap)) {
            Set<Map.Entry> entrySet = map.entrySet();
            if (entrySet instanceof Collection) {
                i = entrySet.size();
            } else {
                i = 4;
            }
            cst cst = new cst(i);
            if (entrySet instanceof Collection) {
                cst.a(entrySet.size() + cst.a);
            }
            for (Map.Entry entry : entrySet) {
                cst.a(entry.getKey(), entry.getValue());
            }
            return cst.a();
        }
        css css = (css) map;
        css.d();
        return css;
    }

    /* access modifiers changed from: package-private */
    public abstract csv a();

    /* access modifiers changed from: package-private */
    public abstract csv b();

    /* access modifiers changed from: package-private */
    public abstract csn c();

    /* access modifiers changed from: package-private */
    public abstract boolean d();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    css() {
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return ((csn) values()).contains(obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public int hashCode() {
        return cky.a((Set) ((csv) entrySet()));
    }

    public String toString() {
        int size = size();
        cky.a(size, "size");
        StringBuilder append = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L)).append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                append.append(", ");
            }
            z = false;
            append.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return append.append('}').toString();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new csu(this);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        csv csv = this.a;
        if (csv != null) {
            return csv;
        }
        csv a2 = a();
        this.a = a2;
        return a2;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        csn csn = this.c;
        if (csn != null) {
            return csn;
        }
        csn c2 = c();
        this.c = c2;
        return c2;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        csv csv = this.b;
        if (csv != null) {
            return csv;
        }
        csv b2 = b();
        this.b = b2;
        return b2;
    }
}
