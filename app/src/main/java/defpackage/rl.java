package defpackage;

/* renamed from: rl reason: default package */
/* compiled from: PG */
public class rl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.rm();
    public static final defpackage.rl d = new defpackage.rl(0);
    public final android.os.Parcelable e;

    private rl() {
        this.e = null;
    }

    public rl(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            throw new java.lang.IllegalArgumentException("superState must not be null");
        }
        if (parcelable == d) {
            parcelable = null;
        }
        this.e = parcelable;
    }

    public rl(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = d;
        }
        this.e = readParcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }

    private rl(byte b) {
        this();
    }
}
