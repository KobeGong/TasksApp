package defpackage;

/* renamed from: agl reason: default package */
/* compiled from: PG */
public final class agl extends defpackage.rl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agm();
    public boolean a;

    public agl(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public agl(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(java.lang.Boolean.valueOf(this.a));
    }

    public final java.lang.String toString() {
        return "SearchView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " isIconified=" + this.a + "}";
    }
}
