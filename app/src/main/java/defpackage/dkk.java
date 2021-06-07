package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
/* renamed from: dkk  reason: default package */
/* compiled from: PG */
public class dkk extends AbstractMap {
    public List a;
    public Map b;
    public boolean c;
    public Map d;
    private final int e;
    private volatile dkt f;
    private volatile dkn g;

    static dkk a(int i) {
        return new dkl(i);
    }

    private dkk(int i) {
        this.e = i;
        this.a = Collections.emptyList();
        this.b = Collections.emptyMap();
        this.d = Collections.emptyMap();
    }

    public void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.c) {
            if (this.b.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.b);
            }
            this.b = unmodifiableMap;
            if (this.d.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.d);
            }
            this.d = unmodifiableMap2;
            this.c = true;
        }
    }

    public final int b() {
        return this.a.size();
    }

    public final Map.Entry b(int i) {
        return (Map.Entry) this.a.get(i);
    }

    public final Iterable c() {
        if (this.b.isEmpty()) {
            return dko.b;
        }
        return this.b.entrySet();
    }

    public int size() {
        return this.a.size() + this.b.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((dkr) this.a.get(a2)).getValue();
        }
        return this.b.get(comparable);
    }

    /* renamed from: a */
    public final Object put(Comparable comparable, Object obj) {
        e();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((dkr) this.a.get(a2)).setValue(obj);
        }
        e();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(this.e);
        }
        int i = -(a2 + 1);
        if (i >= this.e) {
            return f().put(comparable, obj);
        }
        if (this.a.size() == this.e) {
            dkr dkr = (dkr) this.a.remove(this.e - 1);
            f().put((Comparable) dkr.getKey(), dkr.getValue());
        }
        this.a.add(i, new dkr(this, comparable, obj));
        return null;
    }

    public void clear() {
        e();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    /* access modifiers changed from: package-private */
    public final Object c(int i) {
        e();
        Object value = ((dkr) this.a.remove(i)).getValue();
        if (!this.b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.a.add(new dkr(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int a(Comparable comparable) {
        int size = this.a.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((dkr) this.a.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        int i2 = size;
        while (i <= i2) {
            int i3 = (i + i2) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((dkr) this.a.get(i3)).getKey());
            if (compareTo2 < 0) {
                i2 = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i = i3 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f == null) {
            this.f = new dkt(this);
        }
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final Set d() {
        if (this.g == null) {
            this.g = new dkn(this);
        }
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap f() {
        e();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            this.b = new TreeMap();
            this.d = ((TreeMap) this.b).descendingMap();
        }
        return (SortedMap) this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkk)) {
            return super.equals(obj);
        }
        dkk dkk = (dkk) obj;
        int size = size();
        if (size != dkk.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != dkk.b()) {
            return entrySet().equals(dkk.entrySet());
        }
        for (int i = 0; i < b2; i++) {
            if (!b(i).equals(dkk.b(i))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.b.equals(dkk.b);
        }
        return true;
    }

    public int hashCode() {
        int b2 = b();
        int i = 0;
        for (int i2 = 0; i2 < b2; i2++) {
            i += ((dkr) this.a.get(i2)).hashCode();
        }
        if (this.b.size() > 0) {
            return this.b.hashCode() + i;
        }
        return i;
    }

    /* synthetic */ dkk(int i, byte b2) {
        this(i);
    }
}
