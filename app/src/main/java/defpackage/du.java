package defpackage;

/* renamed from: du reason: default package */
/* compiled from: PG */
public final class du extends defpackage.rl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.dv();
    public int a;
    public boolean b;

    public du(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public du(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
