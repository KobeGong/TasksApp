package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: afq  reason: default package */
/* compiled from: PG */
public final class afq extends rl {
    public static final Parcelable.Creator CREATOR = new afr();
    public Parcelable a;

    afq(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
    }

    public afq(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.rl
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }
}
