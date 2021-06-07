package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bed  reason: default package */
/* compiled from: PG */
public final class bed extends biq {
    public static final Parcelable.Creator CREATOR = new bee();
    public axq a;
    public boolean b;
    public boolean c;
    private int d;
    private IBinder e;

    bed(int i, IBinder iBinder, axq axq, boolean z, boolean z2) {
        this.d = i;
        this.e = iBinder;
        this.a = axq;
        this.b = z;
        this.c = z2;
    }

    public final bdp a() {
        IBinder iBinder = this.e;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof bdp) {
            return (bdp) queryLocalInterface;
        }
        return new bes(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.d);
        bjr.a(parcel, 2, this.e);
        bjr.a(parcel, 3, this.a, i);
        bjr.a(parcel, 4, this.b);
        bjr.a(parcel, 5, this.c);
        bjr.r(parcel, q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bed)) {
            return false;
        }
        bed bed = (bed) obj;
        return this.a.equals(bed.a) && a().equals(bed.a());
    }
}
