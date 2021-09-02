package defpackage;

/* renamed from: bnd reason: default package */
/* compiled from: PG */
public final class bnd extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bnk();
    private final int a;
    private final java.lang.String b;

    public bnd(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.r(parcel, q);
    }
}
