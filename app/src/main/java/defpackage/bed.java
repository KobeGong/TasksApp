package defpackage;

/* renamed from: bed reason: default package */
/* compiled from: PG */
public final class bed extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bee();
    public defpackage.axq a;
    public boolean b;
    public boolean c;
    private int d;
    private android.os.IBinder e;

    bed(int i, android.os.IBinder iBinder, defpackage.axq axq, boolean z, boolean z2) {
        this.d = i;
        this.e = iBinder;
        this.a = axq;
        this.b = z;
        this.c = z2;
    }

    public final defpackage.bdp a() {
        android.os.IBinder iBinder = this.e;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof defpackage.bdp) {
            return (defpackage.bdp) queryLocalInterface;
        }
        return new defpackage.bes(iBinder);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.d);
        defpackage.bjr.a(parcel, 2, this.e);
        defpackage.bjr.a(parcel, 3, (android.os.Parcelable) this.a, i);
        defpackage.bjr.a(parcel, 4, this.b);
        defpackage.bjr.a(parcel, 5, this.c);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bed)) {
            return false;
        }
        defpackage.bed bed = (defpackage.bed) obj;
        if (!this.a.equals(bed.a) || !a().equals(bed.a())) {
            return false;
        }
        return true;
    }
}
