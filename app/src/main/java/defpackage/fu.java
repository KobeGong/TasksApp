package defpackage;

/* renamed from: fu reason: default package */
/* compiled from: PG */
public final class fu extends defpackage.rl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.fv();
    public android.os.Bundle a;

    public fu(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readBundle(classLoader);
    }

    public fu(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.a);
    }
}
