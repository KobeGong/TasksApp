package defpackage;

/* renamed from: bot reason: default package */
/* compiled from: PG */
public final class bot extends defpackage.biq implements defpackage.bnv {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bos();
    private final java.lang.String a;
    private final java.lang.Integer b;

    public bot(java.lang.String str, java.lang.Integer num) {
        this.a = str;
        this.b = num;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, this.b);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean a() {
        return true;
    }

    public final java.lang.String b() {
        return this.a;
    }

    public final java.lang.Integer c() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bnv)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.bnv bnv = (defpackage.bnv) obj;
        if (!defpackage.azb.a((java.lang.Object) b(), (java.lang.Object) bnv.b()) || !defpackage.azb.a((java.lang.Object) c(), (java.lang.Object) bnv.c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{b(), c()});
    }
}
