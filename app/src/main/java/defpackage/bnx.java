package defpackage;

/* renamed from: bnx reason: default package */
/* compiled from: PG */
public final class bnx extends defpackage.biq implements defpackage.bnt {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bnw();
    private final java.lang.String a;
    private final java.util.List b;
    private final java.lang.String c;
    private final java.lang.Long d;
    private final java.lang.Long e;
    private java.util.List f;

    public bnx(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.Long l, java.lang.Long l2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = l;
        this.e = l2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.b(parcel, 3, c());
        defpackage.bjr.a(parcel, 4, this.c);
        defpackage.bjr.a(parcel, 5, this.d);
        defpackage.bjr.a(parcel, 6, this.e);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean a() {
        return true;
    }

    public final java.lang.String b() {
        return this.a;
    }

    public final java.util.List c() {
        if (this.f == null && this.b != null) {
            this.f = new java.util.ArrayList(this.b.size());
            for (defpackage.bnv add : this.b) {
                this.f.add(add);
            }
        }
        return this.f;
    }

    public final java.lang.String d() {
        return this.c;
    }

    public final java.lang.Long e() {
        return this.d;
    }

    public final java.lang.Long f() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bnt)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.bnt bnt = (defpackage.bnt) obj;
        if (!defpackage.azb.a((java.lang.Object) b(), (java.lang.Object) bnt.b()) || !defpackage.azb.a((java.lang.Object) c(), (java.lang.Object) bnt.c()) || !defpackage.azb.a((java.lang.Object) d(), (java.lang.Object) bnt.d()) || !defpackage.azb.a((java.lang.Object) e(), (java.lang.Object) bnt.e()) || !defpackage.azb.a((java.lang.Object) f(), (java.lang.Object) bnt.f())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{b(), c(), d(), e(), f()});
    }
}
