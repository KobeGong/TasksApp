package org.chromium.base;

/* compiled from: PG */
public class UnguessableToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ehi();
    private final long a;
    private final long b;

    public UnguessableToken(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @org.chromium.base.annotations.CalledByNative
    private static org.chromium.base.UnguessableToken create(long j, long j2) {
        return new org.chromium.base.UnguessableToken(j, j2);
    }

    @org.chromium.base.annotations.CalledByNative
    public long getHighForSerialization() {
        return this.a;
    }

    @org.chromium.base.annotations.CalledByNative
    public long getLowForSerialization() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    @org.chromium.base.annotations.CalledByNative
    private org.chromium.base.UnguessableToken parcelAndUnparcelForTesting() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        org.chromium.base.UnguessableToken unguessableToken = (org.chromium.base.UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }
}
