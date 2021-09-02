package defpackage;

/* renamed from: bgr reason: default package */
/* compiled from: PG */
public final class bgr implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bgj[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        java.lang.String str = null;
        android.os.Bundle bundle = null;
        java.lang.String str2 = null;
        android.app.ApplicationErrorReport applicationErrorReport = null;
        java.lang.String str3 = null;
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = null;
        java.lang.String str4 = null;
        java.util.ArrayList arrayList = null;
        boolean z = false;
        defpackage.bgn bgn = null;
        defpackage.bgm bgm = null;
        boolean z2 = false;
        android.graphics.Bitmap bitmap = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    bundle = defpackage.bjr.j(parcel, readInt);
                    break;
                case 5:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (android.app.ApplicationErrorReport) defpackage.bjr.a(parcel, readInt, android.app.ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (com.google.android.gms.common.data.BitmapTeleporter) defpackage.bjr.a(parcel, readInt, com.google.android.gms.common.data.BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 10:
                    arrayList = defpackage.bjr.c(parcel, readInt, defpackage.bgl.CREATOR);
                    break;
                case 11:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 12:
                    bgn = (defpackage.bgn) defpackage.bjr.a(parcel, readInt, defpackage.bgn.CREATOR);
                    break;
                case 13:
                    bgm = (defpackage.bgm) defpackage.bjr.a(parcel, readInt, defpackage.bgm.CREATOR);
                    break;
                case 14:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 15:
                    bitmap = (android.graphics.Bitmap) defpackage.bjr.a(parcel, readInt, android.graphics.Bitmap.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bgj(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, bgn, bgm, z2, bitmap);
    }
}
