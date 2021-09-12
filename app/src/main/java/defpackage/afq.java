package defpackage;

/* renamed from: afq reason: default package */
/* compiled from: PG */
public final class afq extends defpackage.rl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.afr();
    public android.os.Parcelable a;

    afq(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = LayoutManager.class.getClassLoader();
        }
        this.a = parcel.readParcelable(classLoader);
    }

    public afq(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }
}
