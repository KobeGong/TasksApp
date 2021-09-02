package defpackage;

/* renamed from: bmj reason: default package */
/* compiled from: PG */
public final class bmj extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmw();
    private final java.util.List a;
    private final java.lang.String b;

    public bmj(java.util.List list, java.lang.String str) {
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        this.a = list;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bmj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.bmj bmj = (defpackage.bmj) obj;
        if (!defpackage.azb.a((java.lang.Object) this.a, (java.lang.Object) bmj.a) || !defpackage.azb.a((java.lang.Object) this.b, (java.lang.Object) bmj.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.b(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.r(parcel, q);
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("matches", this.a).a("query", this.b).toString();
    }

    static {
        new defpackage.bmj(java.util.Collections.emptyList(), null);
    }
}
