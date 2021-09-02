package defpackage;

/* renamed from: big reason: default package */
/* compiled from: PG */
public final class big implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.iid.MessengerCompat[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new com.google.android.gms.iid.MessengerCompat(readStrongBinder);
        }
        return null;
    }
}
