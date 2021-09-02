package defpackage;

/* renamed from: axm reason: default package */
/* compiled from: PG */
public final class axm implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.axb[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String str = null;
        int i = 0;
        int a = defpackage.bjr.a(parcel);
        boolean z = true;
        boolean z2 = false;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        int i2 = 0;
        int i3 = 0;
        java.lang.String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str4 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    i3 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 4:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 5:
                    str3 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 6:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 7:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 8:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 9:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 10:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.axb(str4, i3, i2, str3, str2, z, str, z2, i);
    }
}
