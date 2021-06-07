package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ahc  reason: default package */
/* compiled from: PG */
public final class ahc extends rl {
    public static final Parcelable.Creator CREATOR = new ahd();
    public int a;
    public boolean b;

    public ahc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }

    public ahc(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.rl
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
