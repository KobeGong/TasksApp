package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cpq  reason: default package */
/* compiled from: PG */
public final class cpq implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new cpr();
    public final String a;
    public final long b;
    public final int c;
    public final String d;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }

    public final String toString() {
        return this.a;
    }

    public cpq(String str, long j, int i, String str2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
    }

    cpq(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareToIgnoreCase(((cpq) obj).a);
    }
}
