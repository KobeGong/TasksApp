package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ehi();
    private final long a;
    private final long b;

    public UnguessableToken(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @CalledByNative
    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    @CalledByNative
    public long getHighForSerialization() {
        return this.a;
    }

    @CalledByNative
    public long getLowForSerialization() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    @CalledByNative
    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }
}
