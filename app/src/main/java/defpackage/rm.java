package defpackage;

/* renamed from: rm reason: default package */
/* compiled from: PG */
final class rm implements android.os.Parcelable.ClassLoaderCreator {
    rm() {
    }

    private static defpackage.rl a(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return defpackage.rl.d;
        }
        throw new java.lang.IllegalStateException("superState must be null");
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.rl[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return a(parcel, null);
    }
}
