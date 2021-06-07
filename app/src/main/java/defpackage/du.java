package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: du  reason: default package */
/* compiled from: PG */
public final class du extends rl {
    public static final Parcelable.Creator CREATOR = new dv();
    public int a;
    public boolean b;

    public du(Parcelable parcelable) {
        super(parcelable);
    }

    public du(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }

    @Override // defpackage.rl
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
