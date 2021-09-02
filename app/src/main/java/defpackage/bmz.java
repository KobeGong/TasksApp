package defpackage;

/* renamed from: bmz reason: default package */
/* compiled from: PG */
public final class bmz implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmm[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int i = 0;
        java.lang.String str = null;
        int a = defpackage.bjr.a(parcel);
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        boolean z = false;
        boolean z2 = false;
        defpackage.bmp bmp = null;
        java.lang.String str4 = null;
        java.util.List list = null;
        java.util.List list2 = null;
        java.util.List list3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 3:
                    list3 = defpackage.bjr.c(parcel, readInt, defpackage.bml.CREATOR);
                    break;
                case 5:
                    list2 = defpackage.bjr.c(parcel, readInt, defpackage.bmn.CREATOR);
                    break;
                case 6:
                    list = defpackage.bjr.c(parcel, readInt, defpackage.bmf.CREATOR);
                    break;
                case 7:
                    str4 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 8:
                    bmp = (defpackage.bmp) defpackage.bjr.a(parcel, readInt, defpackage.bmp.CREATOR);
                    break;
                case 9:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 10:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 11:
                    str3 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 12:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 13:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 14:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bmm(list3, list2, list, str4, bmp, z2, z, str3, str2, str, i);
    }
}
