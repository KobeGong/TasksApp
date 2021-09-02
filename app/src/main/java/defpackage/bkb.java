package defpackage;

/* renamed from: bkb reason: default package */
/* compiled from: PG */
public final class bkb extends defpackage.biq implements defpackage.ayw {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bkc();
    private int a;
    private int b;
    private android.content.Intent c;

    bkb(int i, int i2, android.content.Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public bkb() {
        this(0);
    }

    private bkb(byte b2) {
        this(2, 0, null);
    }

    public final com.google.android.gms.common.api.Status b() {
        if (this.b == 0) {
            return com.google.android.gms.common.api.Status.a;
        }
        return com.google.android.gms.common.api.Status.e;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.a);
        defpackage.bjr.c(parcel, 2, this.b);
        defpackage.bjr.a(parcel, 3, (android.os.Parcelable) this.c, i);
        defpackage.bjr.r(parcel, q);
    }
}
