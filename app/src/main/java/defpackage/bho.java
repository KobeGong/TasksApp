package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;

/* renamed from: bho  reason: default package */
/* compiled from: PG */
public final class bho implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        int i = 0;
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        boolean z = false;
        boolean z2 = false;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        int i4 = 0;
        bgn bgn = null;
        ArrayList arrayList3 = null;
        boolean z3 = false;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        int i5 = 0;
        PendingIntent pendingIntent = null;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        String str5 = null;
        boolean z6 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = bjr.d(parcel, readInt);
                    break;
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                    account = (Account) bjr.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = bjr.j(parcel, readInt);
                    break;
                case 5:
                    z = bjr.c(parcel, readInt);
                    break;
                case 6:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 7:
                    arrayList = bjr.o(parcel, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    bjr.b(parcel, readInt);
                    break;
                case 10:
                    bundle2 = bjr.j(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) bjr.a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = bjr.h(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) bjr.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = bjr.c(parcel, readInt, bhl.CREATOR);
                    break;
                case 17:
                    i4 = bjr.d(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = bjr.c(parcel, readInt, bhk.CREATOR);
                    break;
                case 19:
                    bArr = bjr.k(parcel, readInt);
                    break;
                case 20:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 21:
                    i3 = bjr.d(parcel, readInt);
                    break;
                case 22:
                    z3 = bjr.c(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) bjr.a(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    bgn = (bgn) bjr.a(parcel, readInt, bgn.CREATOR);
                    break;
                case 28:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) bjr.a(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = bjr.d(parcel, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) bjr.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = bjr.h(parcel, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) bjr.a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = bjr.d(parcel, readInt);
                    break;
                case 37:
                    z4 = bjr.c(parcel, readInt);
                    break;
                case 38:
                    z5 = bjr.c(parcel, readInt);
                    break;
                case 39:
                    i7 = bjr.d(parcel, readInt);
                    break;
                case 40:
                    str5 = bjr.h(parcel, readInt);
                    break;
                case 41:
                    z6 = bjr.c(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, bgn, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
    }
}
