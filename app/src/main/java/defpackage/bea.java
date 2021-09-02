package defpackage;

/* renamed from: bea reason: default package */
/* compiled from: PG */
public final class bea {
    private final java.util.List a = new java.util.ArrayList();
    private final java.lang.Object b;

    public bea(java.lang.Object obj) {
        this.b = defpackage.azb.b(obj);
    }

    public final defpackage.bea a(java.lang.String str, java.lang.Object obj) {
        java.util.List list = this.a;
        java.lang.String str2 = (java.lang.String) defpackage.azb.b((java.lang.Object) str);
        java.lang.String valueOf = java.lang.String.valueOf(obj);
        list.add(new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
        return this;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder append = new java.lang.StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            append.append((java.lang.String) this.a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
