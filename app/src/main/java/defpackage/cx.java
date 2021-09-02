package defpackage;

/* renamed from: cx reason: default package */
/* compiled from: PG */
public final class cx extends defpackage.rl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.cy();
    public int a;
    public float b;
    public boolean c;

    public cx(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readByte() != 0;
    }

    public cx(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeByte((byte) (this.c ? 1 : 0));
    }
}
