package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bmk  reason: default package */
/* compiled from: PG */
public final class bmk extends biq {
    public static final Parcelable.Creator CREATOR = new bmx();
    private final int a;
    private final int b;

    bmk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bmk)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bmk bmk = (bmk) obj;
        return azb.a(Integer.valueOf(this.a), Integer.valueOf(bmk.a)) && azb.a(Integer.valueOf(this.b), Integer.valueOf(bmk.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 2, this.a);
        bjr.c(parcel, 3, this.b);
        bjr.r(parcel, q);
    }
}
