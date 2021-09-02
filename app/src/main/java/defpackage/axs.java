package defpackage;

/* renamed from: axs reason: default package */
/* compiled from: PG */
public final class axs extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bfb();
    private final java.lang.String a;
    private final int b;

    public axs(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 1, this.a);
        defpackage.bjr.c(parcel, 2, this.b);
        defpackage.bjr.r(parcel, q);
    }
}
