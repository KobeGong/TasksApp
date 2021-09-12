package defpackage;

/* renamed from: ky reason: default package */
/* compiled from: PG */
final class ky implements android.os.Parcelable.Creator {
    ky() {
    }

    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new BackStackState[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new BackStackState(parcel);
    }
}
