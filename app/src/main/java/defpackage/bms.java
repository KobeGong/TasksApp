package defpackage;

/* renamed from: bms reason: default package */
/* compiled from: PG */
public final class bms implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmf[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String str = null;
        boolean z = false;
        int a = defpackage.bjr.a(parcel);
        boolean z2 = false;
        int i = 0;
        defpackage.bmp bmp = null;
        defpackage.bmj bmj = null;
        java.lang.String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 3:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 4:
                    bmj = (defpackage.bmj) defpackage.bjr.a(parcel, readInt, defpackage.bmj.CREATOR);
                    break;
                case 5:
                    bmp = (defpackage.bmp) defpackage.bjr.a(parcel, readInt, defpackage.bmp.CREATOR);
                    break;
                case 6:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 7:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 8:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 9:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bmf(i2, str2, bmj, bmp, i, str, z2, z);
    }
}
