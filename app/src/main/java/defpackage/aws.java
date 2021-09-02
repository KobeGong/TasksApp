package defpackage;

/* renamed from: aws reason: default package */
/* compiled from: PG */
public final class aws implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.TokenData[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = null;
        boolean z = false;
        int a = defpackage.bjr.a(parcel);
        boolean z2 = false;
        java.lang.Long l = null;
        java.lang.String str = null;
        int i = 0;
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
                    l = defpackage.bjr.g(parcel, readInt);
                    break;
                case 4:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 5:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 6:
                    arrayList = defpackage.bjr.o(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.auth.TokenData(i, str, l, z2, z, arrayList);
    }
}
