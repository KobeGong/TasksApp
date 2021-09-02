package defpackage;

/* renamed from: dkt reason: default package */
/* compiled from: PG */
class dkt extends java.util.AbstractSet {
    private final /* synthetic */ defpackage.dkk a;

    dkt(defpackage.dkk dkk) {
        this.a = dkk;
    }

    public java.util.Iterator iterator() {
        return new defpackage.dks(this.a);
    }

    public int size() {
        return this.a.size();
    }

    public boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.a.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.a.clear();
    }

    public /* synthetic */ boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.a.put((java.lang.Comparable) entry.getKey(), entry.getValue());
        return true;
    }
}
