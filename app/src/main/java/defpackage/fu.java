package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fu  reason: default package */
/* compiled from: PG */
public final class fu extends rl {
    public static final Parcelable.Creator CREATOR = new fv();
    public Bundle a;

    public fu(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readBundle(classLoader);
    }

    public fu(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.rl
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.a);
    }
}
