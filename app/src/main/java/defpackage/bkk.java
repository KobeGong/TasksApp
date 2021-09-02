package defpackage;

/* renamed from: bkk reason: default package */
/* compiled from: PG */
public final class bkk extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bkl();
    public final defpackage.axq a;
    public final defpackage.bed b;
    private int c;

    bkk(int i, defpackage.axq axq, defpackage.bed bed) {
        this.c = i;
        this.a = axq;
        this.b = bed;
    }

    public bkk() {
        this(new defpackage.axq(8, null));
    }

    private bkk(defpackage.axq axq) {
        this(1, axq, null);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.c);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.a, i);
        defpackage.bjr.a(parcel, 3, (android.os.Parcelable) this.b, i);
        defpackage.bjr.r(parcel, q);
    }
}
