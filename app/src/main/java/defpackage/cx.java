package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cx  reason: default package */
/* compiled from: PG */
public final class cx extends rl {
    public static final Parcelable.Creator CREATOR = new cy();
    public int a;
    public float b;
    public boolean c;

    public cx(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readByte() != 0;
    }

    public cx(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.rl
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeByte((byte) (this.c ? 1 : 0));
    }
}
