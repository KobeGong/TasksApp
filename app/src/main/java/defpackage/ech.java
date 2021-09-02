package defpackage;

/* renamed from: ech reason: default package */
/* compiled from: PG */
public final class ech {
    public static final java.util.List a;
    public static final defpackage.ech b = defpackage.eci.OK.a();
    public static final defpackage.ech c = defpackage.eci.CANCELLED.a();
    public static final defpackage.ech d = defpackage.eci.UNKNOWN.a();
    public static final defpackage.ech e = defpackage.eci.INVALID_ARGUMENT.a();
    public static final defpackage.ech f = defpackage.eci.DEADLINE_EXCEEDED.a();
    public static final defpackage.ech g = defpackage.eci.NOT_FOUND.a();
    public static final defpackage.ech h = defpackage.eci.ALREADY_EXISTS.a();
    public static final defpackage.ech i = defpackage.eci.PERMISSION_DENIED.a();
    public static final defpackage.ech j = defpackage.eci.UNAUTHENTICATED.a();
    public static final defpackage.ech k = defpackage.eci.RESOURCE_EXHAUSTED.a();
    public static final defpackage.ech l = defpackage.eci.FAILED_PRECONDITION.a();
    public static final defpackage.ech m = defpackage.eci.ABORTED.a();
    public static final defpackage.ech n = defpackage.eci.OUT_OF_RANGE.a();
    public static final defpackage.ech o = defpackage.eci.UNIMPLEMENTED.a();
    public static final defpackage.ech p = defpackage.eci.INTERNAL.a();
    public static final defpackage.ech q = defpackage.eci.UNAVAILABLE.a();
    public static final defpackage.ech r = defpackage.eci.DATA_LOSS.a();
    public final defpackage.eci s;
    public final java.lang.String t;

    public ech(defpackage.eci eci, java.lang.String str) {
        this.s = (defpackage.eci) defpackage.cld.a((java.lang.Object) eci, (java.lang.Object) "canonicalCode");
        this.t = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ech)) {
            return false;
        }
        defpackage.ech ech = (defpackage.ech) obj;
        if (this.s != ech.s || !defpackage.cru.d(this.t, ech.t)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.s, this.t});
    }

    public final java.lang.String toString() {
        return defpackage.cky.b((java.lang.Object) this).a("canonicalCode", (java.lang.Object) this.s).a("description", (java.lang.Object) this.t).toString();
    }

    static {
        defpackage.eci[] values;
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (defpackage.eci eci : defpackage.eci.values()) {
            defpackage.ech ech = (defpackage.ech) treeMap.put(java.lang.Integer.valueOf(eci.r), new defpackage.ech(eci, null));
            if (ech != null) {
                java.lang.String name = ech.s.name();
                java.lang.String name2 = eci.name();
                throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 34 + java.lang.String.valueOf(name2).length()).append("Code value duplication between ").append(name).append(" & ").append(name2).toString());
            }
        }
        a = java.util.Collections.unmodifiableList(new java.util.ArrayList(treeMap.values()));
    }
}
