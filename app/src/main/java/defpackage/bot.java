package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bot  reason: default package */
/* compiled from: PG */
public final class bot extends biq implements bnv {
    public static final Parcelable.Creator CREATOR = new bos();
    private final String a;
    private final Integer b;

    public bot(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, this.b);
        bjr.r(parcel, q);
    }

    @Override // defpackage.bcs
    public final boolean a() {
        return true;
    }

    @Override // defpackage.bnv
    public final String b() {
        return this.a;
    }

    @Override // defpackage.bnv
    public final Integer c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnv)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bnv bnv = (bnv) obj;
        return azb.a(b(), bnv.b()) && azb.a(c(), bnv.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), c()});
    }
}
