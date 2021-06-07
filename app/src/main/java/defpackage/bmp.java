package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bmp  reason: default package */
/* compiled from: PG */
public final class bmp extends biq {
    public static final Parcelable.Creator CREATOR = new bmq();
    private final byte[] a;
    private long b;
    private String c;

    public bmp(byte[] bArr, long j, String str) {
        this.a = bArr;
        this.b = j;
        this.c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.c);
        bjr.r(parcel, q);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bmp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bmp bmp = (bmp) obj;
        return Arrays.equals(this.a, bmp.a) && azb.a(Long.valueOf(this.b), Long.valueOf(bmp.b)) && azb.a(this.c, bmp.c);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(new Object[]{Long.valueOf(this.b), this.c});
    }

    static {
        new bmp(null, Long.MIN_VALUE, null);
    }
}
