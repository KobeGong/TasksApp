package defpackage;

/* renamed from: eb reason: default package */
/* compiled from: PG */
public final class eb extends defpackage.rl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ec();
    public final int a;

    public eb(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
    }

    public eb(android.os.Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
