package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: awz  reason: default package */
/* compiled from: PG */
public final class awz extends biq {
    public static final Parcelable.Creator CREATOR = new axo();
    private final boolean a;
    private final long b;
    private final long c;

    public awz(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awz)) {
            return false;
        }
        awz awz = (awz) obj;
        return this.a == awz.a && this.b == awz.b && this.c == awz.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.a + ",collectForDebugStartTimeMillis: " + this.b + ",collectForDebugExpiryTimeMillis: " + this.c + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 1, this.a);
        bjr.a(parcel, 2, this.c);
        bjr.a(parcel, 3, this.b);
        bjr.r(parcel, q);
    }
}
