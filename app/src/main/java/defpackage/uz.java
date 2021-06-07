package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: uz  reason: default package */
/* compiled from: PG */
public final class uz extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new va();
    public int a;

    public uz(Parcelable parcelable) {
        super(parcelable);
    }

    uz(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
    }
}
