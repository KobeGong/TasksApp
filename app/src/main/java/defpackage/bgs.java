package defpackage;

/* renamed from: bgs reason: default package */
/* compiled from: PG */
public final class bgs implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bgl[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.bjr.a(parcel, readInt, android.os.ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 4:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bgl(parcelFileDescriptor, str2, str);
    }
}
