package com.google.android.gms.googlehelp;

/* compiled from: PG */
public final class GoogleHelp extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bho();
    private boolean A;
    private boolean B;
    private int C;
    private java.lang.String D;
    private boolean E;
    private int a;
    private java.lang.String b;
    private android.accounts.Account c;
    private android.os.Bundle d;
    private java.lang.String e;
    private java.lang.String f;
    private android.graphics.Bitmap g;
    private boolean h;
    private boolean i;
    private java.util.List j;
    @java.lang.Deprecated
    private android.os.Bundle k;
    @java.lang.Deprecated
    private android.graphics.Bitmap l;
    @java.lang.Deprecated
    private byte[] m;
    @java.lang.Deprecated
    private int n;
    @java.lang.Deprecated
    private int o;
    private java.lang.String p;
    private android.net.Uri q;
    private java.util.List r;
    private defpackage.bgn s;
    private java.util.List t;
    private boolean u;
    private com.google.android.gms.feedback.ErrorReport v = new com.google.android.gms.feedback.ErrorReport();
    private com.google.android.gms.googlehelp.internal.common.TogglingData w;
    private int x;
    private android.app.PendingIntent y;
    private int z;

    public GoogleHelp(int i2, java.lang.String str, android.accounts.Account account, android.os.Bundle bundle, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, boolean z2, boolean z3, java.util.List list, android.os.Bundle bundle2, android.graphics.Bitmap bitmap2, byte[] bArr, int i3, int i4, java.lang.String str4, android.net.Uri uri, java.util.List list2, int i5, defpackage.bgn bgn, java.util.List list3, boolean z4, com.google.android.gms.feedback.ErrorReport errorReport, com.google.android.gms.googlehelp.internal.common.TogglingData togglingData, int i6, android.app.PendingIntent pendingIntent, int i7, boolean z5, boolean z6, int i8, java.lang.String str5, boolean z7) {
        com.google.android.gms.googlehelp.GoogleHelp googleHelp;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i2;
        this.z = i7;
        this.A = z5;
        this.B = z6;
        this.C = i8;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z2;
        this.i = z3;
        this.E = z7;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i3;
        this.o = i4;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (this.a < 4) {
            bgn = new defpackage.bgn();
            bgn.a = i5;
            googleHelp = this;
        } else if (bgn == null) {
            bgn = new defpackage.bgn();
            googleHelp = this;
        } else {
            googleHelp = this;
        }
        googleHelp.s = bgn;
        this.t = list3;
        this.u = z4;
        this.v = errorReport;
        if (this.v != null) {
            this.v.p = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i6;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q2 = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.a);
        defpackage.bjr.a(parcel, 2, this.b);
        defpackage.bjr.a(parcel, 3, (android.os.Parcelable) this.c, i2);
        defpackage.bjr.a(parcel, 4, this.d);
        defpackage.bjr.a(parcel, 5, this.h);
        defpackage.bjr.a(parcel, 6, this.i);
        defpackage.bjr.a(parcel, 7, this.j);
        defpackage.bjr.a(parcel, 10, this.k);
        defpackage.bjr.a(parcel, 11, (android.os.Parcelable) this.l, i2);
        defpackage.bjr.a(parcel, 14, this.p);
        defpackage.bjr.a(parcel, 15, (android.os.Parcelable) this.q, i2);
        defpackage.bjr.b(parcel, 16, this.r);
        defpackage.bjr.c(parcel, 17, 0);
        defpackage.bjr.b(parcel, 18, this.t);
        defpackage.bjr.a(parcel, 19, this.m);
        defpackage.bjr.c(parcel, 20, this.n);
        defpackage.bjr.c(parcel, 21, this.o);
        defpackage.bjr.a(parcel, 22, this.u);
        defpackage.bjr.a(parcel, 23, (android.os.Parcelable) this.v, i2);
        defpackage.bjr.a(parcel, 25, (android.os.Parcelable) this.s, i2);
        defpackage.bjr.a(parcel, 28, this.e);
        defpackage.bjr.a(parcel, 31, (android.os.Parcelable) this.w, i2);
        defpackage.bjr.c(parcel, 32, this.x);
        defpackage.bjr.a(parcel, 33, (android.os.Parcelable) this.y, i2);
        defpackage.bjr.a(parcel, 34, this.f);
        defpackage.bjr.a(parcel, 35, (android.os.Parcelable) this.g, i2);
        defpackage.bjr.c(parcel, 36, this.z);
        defpackage.bjr.a(parcel, 37, this.A);
        defpackage.bjr.a(parcel, 38, this.B);
        defpackage.bjr.c(parcel, 39, this.C);
        defpackage.bjr.a(parcel, 40, this.D);
        defpackage.bjr.a(parcel, 41, this.E);
        defpackage.bjr.r(parcel, q2);
    }

    public static android.graphics.Bitmap a(android.app.Activity activity) {
        try {
            android.view.View rootView = activity.getWindow().getDecorView().getRootView();
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), android.graphics.Bitmap.Config.RGB_565);
            rootView.draw(new android.graphics.Canvas(createBitmap));
            return createBitmap;
        } catch (java.lang.Error | java.lang.Exception e2) {
            android.util.Log.w("gH_GoogleHelp", "Get screenshot failed!", e2);
            return null;
        }
    }
}
