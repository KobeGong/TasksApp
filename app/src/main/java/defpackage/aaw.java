package defpackage;

/* renamed from: aaw reason: default package */
/* compiled from: PG */
final class aaw implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aax();
    public int a;

    aaw() {
    }

    aaw(android.os.Parcel parcel) {
        this.a = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
