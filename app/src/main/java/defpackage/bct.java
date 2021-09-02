package defpackage;

/* renamed from: bct reason: default package */
/* compiled from: PG */
public final class bct implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.common.data.BitmapTeleporter[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.bjr.a(parcel, readInt, android.os.ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.common.data.BitmapTeleporter(i, parcelFileDescriptor, i2);
    }
}
