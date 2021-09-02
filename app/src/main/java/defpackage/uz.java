package defpackage;

/* renamed from: uz reason: default package */
/* compiled from: PG */
public final class uz extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.va();
    public int a;

    public uz(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    uz(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public final java.lang.String toString() {
        return "HorizontalScrollView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
    }
}
