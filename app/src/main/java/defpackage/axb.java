package defpackage;

/* renamed from: axb reason: default package */
/* compiled from: PG */
public final class axb extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.axm();
    public final int a;
    public final java.lang.String b;
    private final java.lang.String c;
    private final int d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final boolean g;
    private final boolean h;
    private final int i;

    public axb(java.lang.String str, int i2, int i3, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, boolean z2, int i4) {
        this.c = str;
        this.d = i2;
        this.a = i3;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.b = str4;
        this.h = z2;
        this.i = i4;
    }

    public axb(java.lang.String str, int i2, int i3, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i4) {
        this.c = (java.lang.String) defpackage.azb.b((java.lang.Object) str);
        this.d = i2;
        this.a = i3;
        this.b = str2;
        this.e = str3;
        this.f = str4;
        this.g = !z;
        this.h = z;
        this.i = i4;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.c);
        defpackage.bjr.c(parcel, 3, this.d);
        defpackage.bjr.c(parcel, 4, this.a);
        defpackage.bjr.a(parcel, 5, this.e);
        defpackage.bjr.a(parcel, 6, this.f);
        defpackage.bjr.a(parcel, 7, this.g);
        defpackage.bjr.a(parcel, 8, this.b);
        defpackage.bjr.a(parcel, 9, this.h);
        defpackage.bjr.c(parcel, 10, this.i);
        defpackage.bjr.r(parcel, q);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.c, java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.a), this.b, this.e, this.f, java.lang.Boolean.valueOf(this.g), java.lang.Boolean.valueOf(this.h), java.lang.Integer.valueOf(this.i)});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.axb)) {
            return false;
        }
        defpackage.axb axb = (defpackage.axb) obj;
        if (defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) axb.c) && this.d == axb.d && this.a == axb.a && defpackage.azb.a((java.lang.Object) this.b, (java.lang.Object) axb.b) && defpackage.azb.a((java.lang.Object) this.e, (java.lang.Object) axb.e) && defpackage.azb.a((java.lang.Object) this.f, (java.lang.Object) axb.f) && this.g == axb.g && this.h == axb.h && this.i == axb.i) {
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PlayLoggerContext[");
        sb.append("package=").append(this.c).append(',');
        sb.append("packageVersionCode=").append(this.d).append(',');
        sb.append("logSource=").append(this.a).append(',');
        sb.append("logSourceName=").append(this.b).append(',');
        sb.append("uploadAccount=").append(this.e).append(',');
        sb.append("loggingId=").append(this.f).append(',');
        sb.append("logAndroidId=").append(this.g).append(',');
        sb.append("isAnonymous=").append(this.h).append(',');
        sb.append("qosTier=").append(this.i);
        sb.append("]");
        return sb.toString();
    }
}
