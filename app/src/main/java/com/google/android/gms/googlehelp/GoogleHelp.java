package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

/* compiled from: PG */
public final class GoogleHelp extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bho();
    private boolean A;
    private boolean B;
    private int C;
    private String D;
    private boolean E;
    private int a;
    private String b;
    private Account c;
    private Bundle d;
    private String e;
    private String f;
    private Bitmap g;
    private boolean h;
    private boolean i;
    private List j;
    @Deprecated
    private Bundle k;
    @Deprecated
    private Bitmap l;
    @Deprecated
    private byte[] m;
    @Deprecated
    private int n;
    @Deprecated
    private int o;
    private String p;
    private Uri q;
    private List r;
    private bgn s;
    private List t;
    private boolean u;
    private ErrorReport v = new ErrorReport();
    private TogglingData w;
    private int x;
    private PendingIntent y;
    private int z;

    public GoogleHelp(int i2, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z2, boolean z3, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i3, int i4, String str4, Uri uri, List list2, int i5, bgn bgn, List list3, boolean z4, ErrorReport errorReport, TogglingData togglingData, int i6, PendingIntent pendingIntent, int i7, boolean z5, boolean z6, int i8, String str5, boolean z7) {
        GoogleHelp googleHelp;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
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
            bgn = new bgn();
            bgn.a = i5;
            googleHelp = this;
        } else if (bgn == null) {
            bgn = new bgn();
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

    public final void writeToParcel(Parcel parcel, int i2) {
        int q2 = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.a);
        bjr.a(parcel, 2, this.b);
        bjr.a(parcel, 3, this.c, i2);
        bjr.a(parcel, 4, this.d);
        bjr.a(parcel, 5, this.h);
        bjr.a(parcel, 6, this.i);
        bjr.a(parcel, 7, this.j);
        bjr.a(parcel, 10, this.k);
        bjr.a(parcel, 11, this.l, i2);
        bjr.a(parcel, 14, this.p);
        bjr.a(parcel, 15, this.q, i2);
        bjr.b(parcel, 16, this.r);
        bjr.c(parcel, 17, 0);
        bjr.b(parcel, 18, this.t);
        bjr.a(parcel, 19, this.m);
        bjr.c(parcel, 20, this.n);
        bjr.c(parcel, 21, this.o);
        bjr.a(parcel, 22, this.u);
        bjr.a(parcel, 23, this.v, i2);
        bjr.a(parcel, 25, this.s, i2);
        bjr.a(parcel, 28, this.e);
        bjr.a(parcel, 31, this.w, i2);
        bjr.c(parcel, 32, this.x);
        bjr.a(parcel, 33, this.y, i2);
        bjr.a(parcel, 34, this.f);
        bjr.a(parcel, 35, this.g, i2);
        bjr.c(parcel, 36, this.z);
        bjr.a(parcel, 37, this.A);
        bjr.a(parcel, 38, this.B);
        bjr.c(parcel, 39, this.C);
        bjr.a(parcel, 40, this.D);
        bjr.a(parcel, 41, this.E);
        bjr.r(parcel, q2);
    }

    public static Bitmap a(Activity activity) {
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
            rootView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Error | Exception e2) {
            Log.w("gH_GoogleHelp", "Get screenshot failed!", e2);
            return null;
        }
    }
}
