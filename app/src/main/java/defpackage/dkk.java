package defpackage;

/* renamed from: dkk reason: default package */
/* compiled from: PG */
class dkk extends java.util.AbstractMap {
    public java.util.List a;
    public java.util.Map b;
    public boolean c;
    public java.util.Map d;
    private final int e;
    private volatile defpackage.dkt f;
    private volatile defpackage.dkn g;

    static defpackage.dkk a(int i) {
        return new defpackage.dkl(i);
    }

    private dkk(int i) {
        this.e = i;
        this.a = java.util.Collections.emptyList();
        this.b = java.util.Collections.emptyMap();
        this.d = java.util.Collections.emptyMap();
    }

    public void a() {
        java.util.Map unmodifiableMap;
        java.util.Map unmodifiableMap2;
        if (!this.c) {
            if (this.b.isEmpty()) {
                unmodifiableMap = java.util.Collections.emptyMap();
            } else {
                unmodifiableMap = java.util.Collections.unmodifiableMap(this.b);
            }
            this.b = unmodifiableMap;
            if (this.d.isEmpty()) {
                unmodifiableMap2 = java.util.Collections.emptyMap();
            } else {
                unmodifiableMap2 = java.util.Collections.unmodifiableMap(this.d);
            }
            this.d = unmodifiableMap2;
            this.c = true;
        }
    }

    public final int b() {
        return this.a.size();
    }

    public final java.util.Map.Entry b(int i) {
        return (java.util.Map.Entry) this.a.get(i);
    }

    public final java.lang.Iterable c() {
        if (this.b.isEmpty()) {
            return defpackage.dko.b;
        }
        return this.b.entrySet();
    }

    public int size() {
        return this.a.size() + this.b.size();
    }

    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((defpackage.dkr) this.a.get(a2)).getValue();
        }
        return this.b.get(comparable);
    }

    /* renamed from: a */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        e();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((defpackage.dkr) this.a.get(a2)).setValue(obj);
        }
        e();
        if (this.a.isEmpty() && !(this.a instanceof java.util.ArrayList)) {
            this.a = new java.util.ArrayList(this.e);
        }
        int i = -(a2 + 1);
        if (i >= this.e) {
            return f().put(comparable, obj);
        }
        if (this.a.size() == this.e) {
            defpackage.dkr dkr = (defpackage.dkr) this.a.remove(this.e - 1);
            f().put((java.lang.Comparable) dkr.getKey(), dkr.getValue());
        }
        this.a.add(i, new defpackage.dkr(this, comparable, obj));
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

    public java.lang.Object remove(java.lang.Object obj) {
        e();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object c(int i) {
        e();
        java.lang.Object value = ((defpackage.dkr) this.a.remove(i)).getValue();
        if (!this.b.isEmpty()) {
            java.util.Iterator it = f().entrySet().iterator();
            this.a.add(new defpackage.dkr(this, (java.util.Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int a(java.lang.Comparable comparable) {
        int size = this.a.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo((java.lang.Comparable) ((defpackage.dkr) this.a.get(size)).getKey());
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
            int compareTo2 = comparable.compareTo((java.lang.Comparable) ((defpackage.dkr) this.a.get(i3)).getKey());
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

    public java.util.Set entrySet() {
        if (this.f == null) {
            this.f = new defpackage.dkt(this);
        }
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public final java.util.Set d() {
        if (this.g == null) {
            this.g = new defpackage.dkn(this);
        }
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (this.c) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap f() {
        e();
        if (this.b.isEmpty() && !(this.b instanceof java.util.TreeMap)) {
            this.b = new java.util.TreeMap();
            this.d = ((java.util.TreeMap) this.b).descendingMap();
        }
        return (java.util.SortedMap) this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dkk)) {
            return super.equals(obj);
        }
        defpackage.dkk dkk = (defpackage.dkk) obj;
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
        int i = 0;
        for (int i2 = 0; i2 < b(); i2++) {
            i += ((defpackage.dkr) this.a.get(i2)).hashCode();
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
