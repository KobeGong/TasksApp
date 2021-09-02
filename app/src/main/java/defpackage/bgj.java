package defpackage;

/* renamed from: bgj reason: default package */
/* compiled from: PG */
public final class bgj extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bgr();
    public java.lang.String a;
    public android.os.Bundle b;
    public java.lang.String c;
    public android.app.ApplicationErrorReport d;
    public java.lang.String e;
    public com.google.android.gms.common.data.BitmapTeleporter f;
    public java.lang.String g;
    public java.util.List h;
    public boolean i;
    public defpackage.bgn j;
    public defpackage.bgm k;
    public boolean l;
    public android.graphics.Bitmap m;
    public defpackage.azb n;

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 5, this.c);
        defpackage.bjr.a(parcel, 6, (android.os.Parcelable) this.d, i2);
        defpackage.bjr.a(parcel, 7, this.e);
        defpackage.bjr.a(parcel, 8, (android.os.Parcelable) this.f, i2);
        defpackage.bjr.a(parcel, 9, this.g);
        defpackage.bjr.b(parcel, 10, this.h);
        defpackage.bjr.a(parcel, 11, this.i);
        defpackage.bjr.a(parcel, 12, (android.os.Parcelable) this.j, i2);
        defpackage.bjr.a(parcel, 13, (android.os.Parcelable) this.k, i2);
        defpackage.bjr.a(parcel, 14, this.l);
        defpackage.bjr.a(parcel, 15, (android.os.Parcelable) this.m, i2);
        defpackage.bjr.r(parcel, q);
    }

    bgj(java.lang.String str, android.os.Bundle bundle, java.lang.String str2, android.app.ApplicationErrorReport applicationErrorReport, java.lang.String str3, com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter, java.lang.String str4, java.util.List list, boolean z, defpackage.bgn bgn, defpackage.bgm bgm, boolean z2, android.graphics.Bitmap bitmap) {
        this.n = null;
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list;
        this.i = z;
        this.j = bgn;
        this.k = bgm;
        this.l = z2;
        this.m = bitmap;
    }

    public bgj(android.app.ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null);
    }
}
