package defpackage;

/* renamed from: bmo reason: default package */
/* compiled from: PG */
public final class bmo extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bnb();
    private boolean a;

    public bmo() {
    }

    public bmo(boolean z) {
        this.a = z;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.r(parcel, q);
    }
}
