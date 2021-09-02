package defpackage;

/* renamed from: dkr reason: default package */
/* compiled from: PG */
final class dkr implements java.lang.Comparable, java.util.Map.Entry {
    private final java.lang.Comparable a;
    private java.lang.Object b;
    private final /* synthetic */ defpackage.dkk c;

    dkr(defpackage.dkk dkk, java.util.Map.Entry entry) {
        this(dkk, (java.lang.Comparable) entry.getKey(), entry.getValue());
    }

    dkr(defpackage.dkk dkk, java.lang.Comparable comparable, java.lang.Object obj) {
        this.c = dkk;
        this.a = comparable;
        this.b = obj;
    }

    public final java.lang.Object getValue() {
        return this.b;
    }

    public final java.lang.Object setValue(java.lang.Object obj) {
        this.c.e();
        java.lang.Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!a(this.a, entry.getKey()) || !a(this.b, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.a == null ? 0 : this.a.hashCode();
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode ^ i;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    private static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ java.lang.Object getKey() {
        return this.a;
    }

    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return ((java.lang.Comparable) getKey()).compareTo((java.lang.Comparable) ((defpackage.dkr) obj).getKey());
    }
}
