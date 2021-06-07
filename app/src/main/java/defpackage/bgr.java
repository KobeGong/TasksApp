package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;

/* renamed from: bgr  reason: default package */
/* compiled from: PG */
public final class bgr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bgj[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        boolean z = false;
        bgn bgn = null;
        bgm bgm = null;
        boolean z2 = false;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                    bundle = bjr.j(parcel, readInt);
                    break;
                case 4:
                default:
                    bjr.b(parcel, readInt);
                    break;
                case 5:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) bjr.a(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = bjr.h(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) bjr.a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = bjr.h(parcel, readInt);
                    break;
                case 10:
                    arrayList = bjr.c(parcel, readInt, bgl.CREATOR);
                    break;
                case 11:
                    z = bjr.c(parcel, readInt);
                    break;
                case 12:
                    bgn = (bgn) bjr.a(parcel, readInt, bgn.CREATOR);
                    break;
                case 13:
                    bgm = (bgm) bjr.a(parcel, readInt, bgm.CREATOR);
                    break;
                case 14:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) bjr.a(parcel, readInt, Bitmap.CREATOR);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bgj(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, bgn, bgm, z2, bitmap);
    }
}
