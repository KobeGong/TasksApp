package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: agl  reason: default package */
/* compiled from: PG */
public final class agl extends rl {
    public static final Parcelable.Creator CREATOR = new agm();
    public boolean a;

    public agl(Parcelable parcelable) {
        super(parcelable);
    }

    public agl(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    @Override // defpackage.rl
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.a));
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.a + "}";
    }
}
