package defpackage;

/* renamed from: csi reason: default package */
/* compiled from: PG */
public final class csi extends defpackage.csm implements java.io.Serializable {
    public static final long serialVersionUID = 0;
    private final java.util.Queue a = new java.util.ArrayDeque(20);
    private final int b = 20;

    /* access modifiers changed from: protected */
    public final java.util.Queue a() {
        return this.a;
    }

    public final boolean offer(java.lang.Object obj) {
        return add(obj);
    }

    public final boolean add(java.lang.Object obj) {
        defpackage.cld.a(obj);
        if (this.b != 0) {
            if (size() == this.b) {
                this.a.remove();
            }
            this.a.add(obj);
        }
        return true;
    }

    public final boolean addAll(java.util.Collection collection) {
        int size = collection.size();
        if (size < this.b) {
            return defpackage.cky.a((java.util.Collection) this, collection.iterator());
        }
        clear();
        int i = size - this.b;
        defpackage.cld.a((java.lang.Object) collection);
        defpackage.cld.a(i >= 0, (java.lang.Object) "number to skip cannot be negative");
        defpackage.csj csj = new defpackage.csj(collection, i);
        if (csj instanceof java.util.Collection) {
            return addAll((java.util.Collection) csj);
        }
        return defpackage.cky.a((java.util.Collection) this, ((java.lang.Iterable) defpackage.cld.a((java.lang.Object) csj)).iterator());
    }

    public final boolean contains(java.lang.Object obj) {
        return c().contains(defpackage.cld.a(obj));
    }

    public final boolean remove(java.lang.Object obj) {
        return c().remove(defpackage.cld.a(obj));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ java.util.Collection b() {
        return c();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ java.lang.Object c() {
        return c();
    }
}
