package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rl  reason: default package */
/* compiled from: PG */
public class rl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rm();
    public static final rl d = new rl((byte) 0);
    public final Parcelable e;

    private rl() {
        this.e = null;
    }

    public rl(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.e = parcelable == d ? null : parcelable;
    }

    public rl(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.e = readParcelable == null ? d : readParcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }

    private rl(byte b) {
        this();
    }
}
