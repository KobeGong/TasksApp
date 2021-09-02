package defpackage;

/* renamed from: bmk reason: default package */
/* compiled from: PG */
public final class bmk extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmx();
    private final int a;
    private final int b;

    bmk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bmk)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.bmk bmk = (defpackage.bmk) obj;
        if (!defpackage.azb.a((java.lang.Object) java.lang.Integer.valueOf(this.a), (java.lang.Object) java.lang.Integer.valueOf(bmk.a)) || !defpackage.azb.a((java.lang.Object) java.lang.Integer.valueOf(this.b), (java.lang.Object) java.lang.Integer.valueOf(bmk.b))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 2, this.a);
        defpackage.bjr.c(parcel, 3, this.b);
        defpackage.bjr.r(parcel, q);
    }
}
