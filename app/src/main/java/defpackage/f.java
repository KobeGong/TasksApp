package defpackage;

/* renamed from: f reason: default package */
/* compiled from: PG */
public final class f extends defpackage.g {
    public java.util.HashMap a = new java.util.HashMap();

    /* access modifiers changed from: protected */
    public final defpackage.j a(java.lang.Object obj) {
        return (defpackage.j) this.a.get(obj);
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.j a2 = a(obj);
        if (a2 != null) {
            return a2.b;
        }
        this.a.put(obj, b(obj, obj2));
        return null;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object b = super.b(obj);
        this.a.remove(obj);
        return b;
    }

    public final boolean c(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }
}
