package defpackage;

/* renamed from: mg reason: default package */
/* compiled from: PG */
final class mg implements android.os.Parcelable.Creator {
    mg() {
    }

    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new FragmentManagerState[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new FragmentManagerState(parcel);
    }
}
