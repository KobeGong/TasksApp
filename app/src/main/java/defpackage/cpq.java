package defpackage;

/* renamed from: cpq reason: default package */
/* compiled from: PG */
public final class cpq implements android.os.Parcelable, java.lang.Comparable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.cpr();
    public final java.lang.String a;
    public final long b;
    public final int c;
    public final java.lang.String d;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }

    public final java.lang.String toString() {
        return this.a;
    }

    public cpq(java.lang.String str, long j, int i, java.lang.String str2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
    }

    cpq(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }

    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a.compareToIgnoreCase(((defpackage.cpq) obj).a);
    }
}
