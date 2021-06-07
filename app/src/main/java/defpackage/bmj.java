package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bmj  reason: default package */
/* compiled from: PG */
public final class bmj extends biq {
    public static final Parcelable.Creator CREATOR = new bmw();
    private final List a;
    private final String b;

    public bmj(List list, String str) {
        this.a = list == null ? Collections.emptyList() : list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bmj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bmj bmj = (bmj) obj;
        return azb.a(this.a, bmj.a) && azb.a(this.b, bmj.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.b(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.r(parcel, q);
    }

    public final String toString() {
        return azb.a(this).a("matches", this.a).a("query", this.b).toString();
    }

    static {
        new bmj(Collections.emptyList(), null);
    }
}
