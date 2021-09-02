package defpackage;

/* renamed from: bgm reason: default package */
/* compiled from: PG */
public final class bgm extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bgt();
    private java.lang.String a;
    private boolean b;

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.r(parcel, q);
    }

    bgm(java.lang.String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
