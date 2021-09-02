package defpackage;

/* renamed from: bgo reason: default package */
/* compiled from: PG */
public final class bgo implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.feedback.ErrorReport[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        android.app.ApplicationErrorReport applicationErrorReport = null;
        java.lang.String str = null;
        int i = 0;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        java.lang.String str5 = null;
        java.lang.String str6 = null;
        java.lang.String str7 = null;
        java.lang.String str8 = null;
        int i2 = 0;
        java.lang.String str9 = null;
        java.lang.String str10 = null;
        java.lang.String str11 = null;
        java.lang.String str12 = null;
        java.lang.String str13 = null;
        java.lang.String[] strArr = null;
        java.lang.String[] strArr2 = null;
        java.lang.String[] strArr3 = null;
        java.lang.String str14 = null;
        java.lang.String str15 = null;
        byte[] bArr = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        java.lang.String str16 = null;
        java.lang.String str17 = null;
        java.lang.String str18 = null;
        android.os.Bundle bundle = null;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        java.lang.String str19 = null;
        java.lang.String str20 = null;
        int i9 = 0;
        java.lang.String str21 = null;
        java.lang.String str22 = null;
        java.lang.String str23 = null;
        java.lang.String str24 = null;
        java.lang.String str25 = null;
        java.lang.String str26 = null;
        java.lang.String str27 = null;
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = null;
        java.lang.String str28 = null;
        defpackage.bgl[] bglArr = null;
        java.lang.String[] strArr4 = null;
        boolean z3 = false;
        java.lang.String str29 = null;
        defpackage.bgn bgn = null;
        defpackage.bgm bgm = null;
        java.lang.String str30 = null;
        boolean z4 = false;
        android.os.Bundle bundle2 = null;
        java.util.ArrayList arrayList = null;
        boolean z5 = false;
        android.graphics.Bitmap bitmap = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    applicationErrorReport = (android.app.ApplicationErrorReport) defpackage.bjr.a(parcel, readInt, android.app.ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 4:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 5:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 6:
                    str3 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 7:
                    str4 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 8:
                    str5 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 9:
                    str6 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 10:
                    str7 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 11:
                    str8 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 12:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 13:
                    str9 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 14:
                    str10 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 15:
                    str11 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 16:
                    str12 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 17:
                    str13 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 18:
                    strArr = defpackage.bjr.n(parcel, readInt);
                    break;
                case 19:
                    strArr2 = defpackage.bjr.n(parcel, readInt);
                    break;
                case 20:
                    strArr3 = defpackage.bjr.n(parcel, readInt);
                    break;
                case 21:
                    str14 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 22:
                    str15 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 23:
                    bArr = defpackage.bjr.k(parcel, readInt);
                    break;
                case 24:
                    i3 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 25:
                    i4 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 26:
                    i5 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 27:
                    i6 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 28:
                    str16 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 29:
                    str17 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 30:
                    str18 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 31:
                    bundle = defpackage.bjr.j(parcel, readInt);
                    break;
                case 32:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 33:
                    i7 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 34:
                    i8 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 35:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 36:
                    str19 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 37:
                    str20 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 38:
                    i9 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 39:
                    str21 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 40:
                    str22 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 41:
                    str23 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 42:
                    str24 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 43:
                    str25 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 44:
                    str26 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 45:
                    str27 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 46:
                    bitmapTeleporter = (com.google.android.gms.common.data.BitmapTeleporter) defpackage.bjr.a(parcel, readInt, com.google.android.gms.common.data.BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 48:
                    bglArr = (defpackage.bgl[]) defpackage.bjr.b(parcel, readInt, defpackage.bgl.CREATOR);
                    break;
                case 49:
                    strArr4 = defpackage.bjr.n(parcel, readInt);
                    break;
                case 50:
                    z3 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 51:
                    str29 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 52:
                    bgn = (defpackage.bgn) defpackage.bjr.a(parcel, readInt, defpackage.bgn.CREATOR);
                    break;
                case 53:
                    bgm = (defpackage.bgm) defpackage.bjr.a(parcel, readInt, defpackage.bgm.CREATOR);
                    break;
                case 54:
                    str30 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 55:
                    z4 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 56:
                    bundle2 = defpackage.bjr.j(parcel, readInt);
                    break;
                case 57:
                    arrayList = defpackage.bjr.c(parcel, readInt, android.graphics.RectF.CREATOR);
                    break;
                case 58:
                    z5 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 59:
                    bitmap = (android.graphics.Bitmap) defpackage.bjr.a(parcel, readInt, android.graphics.Bitmap.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.feedback.ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, bglArr, strArr4, z3, str29, bgn, bgm, str30, z4, bundle2, arrayList, z5, bitmap);
    }
}
