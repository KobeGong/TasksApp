package defpackage;

/* renamed from: aea reason: default package */
/* compiled from: PG */
public final class aea implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aeb();
    public int a;
    public int b;
    public boolean c;

    public aea() {
    }

    aea(android.os.Parcel parcel) {
        boolean z = true;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.c = z;
    }

    public aea(defpackage.aea aea) {
        this.a = aea.a;
        this.b = aea.b;
        this.c = aea.c;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.a >= 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
