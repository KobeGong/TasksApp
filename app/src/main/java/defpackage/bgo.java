package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import java.util.ArrayList;

/* renamed from: bgo  reason: default package */
/* compiled from: PG */
public final class bgo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        String str19 = null;
        String str20 = null;
        int i9 = 0;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        bgl[] bglArr = null;
        String[] strArr4 = null;
        boolean z3 = false;
        String str29 = null;
        bgn bgn = null;
        bgm bgm = null;
        String str30 = null;
        boolean z4 = false;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        boolean z5 = false;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) bjr.a(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = bjr.h(parcel, readInt);
                    break;
                case 4:
                    i = bjr.d(parcel, readInt);
                    break;
                case 5:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 6:
                    str3 = bjr.h(parcel, readInt);
                    break;
                case 7:
                    str4 = bjr.h(parcel, readInt);
                    break;
                case 8:
                    str5 = bjr.h(parcel, readInt);
                    break;
                case 9:
                    str6 = bjr.h(parcel, readInt);
                    break;
                case 10:
                    str7 = bjr.h(parcel, readInt);
                    break;
                case 11:
                    str8 = bjr.h(parcel, readInt);
                    break;
                case 12:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 13:
                    str9 = bjr.h(parcel, readInt);
                    break;
                case 14:
                    str10 = bjr.h(parcel, readInt);
                    break;
                case 15:
                    str11 = bjr.h(parcel, readInt);
                    break;
                case 16:
                    str12 = bjr.h(parcel, readInt);
                    break;
                case 17:
                    str13 = bjr.h(parcel, readInt);
                    break;
                case 18:
                    strArr = bjr.n(parcel, readInt);
                    break;
                case 19:
                    strArr2 = bjr.n(parcel, readInt);
                    break;
                case 20:
                    strArr3 = bjr.n(parcel, readInt);
                    break;
                case 21:
                    str14 = bjr.h(parcel, readInt);
                    break;
                case 22:
                    str15 = bjr.h(parcel, readInt);
                    break;
                case 23:
                    bArr = bjr.k(parcel, readInt);
                    break;
                case 24:
                    i3 = bjr.d(parcel, readInt);
                    break;
                case 25:
                    i4 = bjr.d(parcel, readInt);
                    break;
                case 26:
                    i5 = bjr.d(parcel, readInt);
                    break;
                case 27:
                    i6 = bjr.d(parcel, readInt);
                    break;
                case 28:
                    str16 = bjr.h(parcel, readInt);
                    break;
                case 29:
                    str17 = bjr.h(parcel, readInt);
                    break;
                case 30:
                    str18 = bjr.h(parcel, readInt);
                    break;
                case 31:
                    bundle = bjr.j(parcel, readInt);
                    break;
                case 32:
                    z = bjr.c(parcel, readInt);
                    break;
                case 33:
                    i7 = bjr.d(parcel, readInt);
                    break;
                case 34:
                    i8 = bjr.d(parcel, readInt);
                    break;
                case 35:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 36:
                    str19 = bjr.h(parcel, readInt);
                    break;
                case 37:
                    str20 = bjr.h(parcel, readInt);
                    break;
                case 38:
                    i9 = bjr.d(parcel, readInt);
                    break;
                case 39:
                    str21 = bjr.h(parcel, readInt);
                    break;
                case 40:
                    str22 = bjr.h(parcel, readInt);
                    break;
                case 41:
                    str23 = bjr.h(parcel, readInt);
                    break;
                case 42:
                    str24 = bjr.h(parcel, readInt);
                    break;
                case 43:
                    str25 = bjr.h(parcel, readInt);
                    break;
                case 44:
                    str26 = bjr.h(parcel, readInt);
                    break;
                case 45:
                    str27 = bjr.h(parcel, readInt);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) bjr.a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = bjr.h(parcel, readInt);
                    break;
                case 48:
                    bglArr = (bgl[]) bjr.b(parcel, readInt, bgl.CREATOR);
                    break;
                case by.aT /*{ENCODED_INT: 49}*/:
                    strArr4 = bjr.n(parcel, readInt);
                    break;
                case by.aU /*{ENCODED_INT: 50}*/:
                    z3 = bjr.c(parcel, readInt);
                    break;
                case by.aV /*{ENCODED_INT: 51}*/:
                    str29 = bjr.h(parcel, readInt);
                    break;
                case by.aW /*{ENCODED_INT: 52}*/:
                    bgn = (bgn) bjr.a(parcel, readInt, bgn.CREATOR);
                    break;
                case by.aX /*{ENCODED_INT: 53}*/:
                    bgm = (bgm) bjr.a(parcel, readInt, bgm.CREATOR);
                    break;
                case by.aY /*{ENCODED_INT: 54}*/:
                    str30 = bjr.h(parcel, readInt);
                    break;
                case by.aZ /*{ENCODED_INT: 55}*/:
                    z4 = bjr.c(parcel, readInt);
                    break;
                case by.ba /*{ENCODED_INT: 56}*/:
                    bundle2 = bjr.j(parcel, readInt);
                    break;
                case by.bb /*{ENCODED_INT: 57}*/:
                    arrayList = bjr.c(parcel, readInt, RectF.CREATOR);
                    break;
                case by.bc /*{ENCODED_INT: 58}*/:
                    z5 = bjr.c(parcel, readInt);
                    break;
                case by.bd /*{ENCODED_INT: 59}*/:
                    bitmap = (Bitmap) bjr.a(parcel, readInt, Bitmap.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, bglArr, strArr4, z3, str29, bgn, bgm, str30, z4, bundle2, arrayList, z5, bitmap);
    }
}
