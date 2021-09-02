package defpackage;

/* renamed from: ehi reason: default package */
/* compiled from: PG */
public final class ehi implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new org.chromium.base.UnguessableToken[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        if (readLong == 0 || readLong2 == 0) {
            return null;
        }
        return new org.chromium.base.UnguessableToken(readLong, readLong2);
    }
}
