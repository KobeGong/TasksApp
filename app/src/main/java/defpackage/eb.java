package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: eb  reason: default package */
/* compiled from: PG */
public final class eb extends rl {
    public static final Parcelable.Creator CREATOR = new ec();
    public final int a;

    public eb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
    }

    public eb(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }

    @Override // defpackage.rl
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
