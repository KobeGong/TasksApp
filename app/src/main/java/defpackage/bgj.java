package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.List;

/* renamed from: bgj  reason: default package */
/* compiled from: PG */
public final class bgj extends biq {
    public static final Parcelable.Creator CREATOR = new bgr();
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public bgn j;
    public bgm k;
    public boolean l;
    public Bitmap m;
    public azb n;

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 5, this.c);
        bjr.a(parcel, 6, this.d, i2);
        bjr.a(parcel, 7, this.e);
        bjr.a(parcel, 8, this.f, i2);
        bjr.a(parcel, 9, this.g);
        bjr.b(parcel, 10, this.h);
        bjr.a(parcel, 11, this.i);
        bjr.a(parcel, 12, this.j, i2);
        bjr.a(parcel, 13, this.k, i2);
        bjr.a(parcel, 14, this.l);
        bjr.a(parcel, 15, this.m, i2);
        bjr.r(parcel, q);
    }

    bgj(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, bgn bgn, bgm bgm, boolean z2, Bitmap bitmap) {
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

    public bgj(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null);
    }
}
