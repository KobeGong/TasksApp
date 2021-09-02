package defpackage;

/* renamed from: bho reason: default package */
/* compiled from: PG */
public final class bho implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.googlehelp.GoogleHelp[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        java.lang.String str = null;
        android.accounts.Account account = null;
        android.os.Bundle bundle = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        android.graphics.Bitmap bitmap = null;
        boolean z = false;
        boolean z2 = false;
        java.util.ArrayList arrayList = null;
        android.os.Bundle bundle2 = null;
        android.graphics.Bitmap bitmap2 = null;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        java.lang.String str4 = null;
        android.net.Uri uri = null;
        java.util.ArrayList arrayList2 = null;
        int i4 = 0;
        defpackage.bgn bgn = null;
        java.util.ArrayList arrayList3 = null;
        boolean z3 = false;
        com.google.android.gms.feedback.ErrorReport errorReport = null;
        com.google.android.gms.googlehelp.internal.common.TogglingData togglingData = null;
        int i5 = 0;
        android.app.PendingIntent pendingIntent = null;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        java.lang.String str5 = null;
        boolean z6 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    account = (android.accounts.Account) defpackage.bjr.a(parcel, readInt, android.accounts.Account.CREATOR);
                    break;
                case 4:
                    bundle = defpackage.bjr.j(parcel, readInt);
                    break;
                case 5:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 6:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 7:
                    arrayList = defpackage.bjr.o(parcel, readInt);
                    break;
                case 10:
                    bundle2 = defpackage.bjr.j(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (android.graphics.Bitmap) defpackage.bjr.a(parcel, readInt, android.graphics.Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 15:
                    uri = (android.net.Uri) defpackage.bjr.a(parcel, readInt, android.net.Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = defpackage.bjr.c(parcel, readInt, defpackage.bhl.CREATOR);
                    break;
                case 17:
                    i4 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = defpackage.bjr.c(parcel, readInt, defpackage.bhk.CREATOR);
                    break;
                case 19:
                    bArr = defpackage.bjr.k(parcel, readInt);
                    break;
                case 20:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 21:
                    i3 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 22:
                    z3 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 23:
                    errorReport = (com.google.android.gms.feedback.ErrorReport) defpackage.bjr.a(parcel, readInt, com.google.android.gms.feedback.ErrorReport.CREATOR);
                    break;
                case 25:
                    bgn = (defpackage.bgn) defpackage.bjr.a(parcel, readInt, defpackage.bgn.CREATOR);
                    break;
                case 28:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 31:
                    togglingData = (com.google.android.gms.googlehelp.internal.common.TogglingData) defpackage.bjr.a(parcel, readInt, com.google.android.gms.googlehelp.internal.common.TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 33:
                    pendingIntent = (android.app.PendingIntent) defpackage.bjr.a(parcel, readInt, android.app.PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 35:
                    bitmap = (android.graphics.Bitmap) defpackage.bjr.a(parcel, readInt, android.graphics.Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 37:
                    z4 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 38:
                    z5 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 39:
                    i7 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 40:
                    str5 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 41:
                    z6 = defpackage.bjr.c(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.googlehelp.GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, bgn, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
    }
}
