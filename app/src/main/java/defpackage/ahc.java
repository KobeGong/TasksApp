package defpackage;

/* renamed from: ahc reason: default package */
/* compiled from: PG */
public final class ahc extends defpackage.rl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ahd();
    public int a;
    public boolean b;

    public ahc(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }

    public ahc(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
