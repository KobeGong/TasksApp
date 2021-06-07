package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bmf  reason: default package */
/* compiled from: PG */
public final class bmf extends biq {
    public static final Parcelable.Creator CREATOR = new bms();
    private int a;
    private String b;
    private bmj c;
    private bmp d;
    private int e;
    private String f;
    private boolean g;
    private boolean h;

    public bmf(int i, String str, bmj bmj, bmp bmp, int i2, String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = bmj;
        this.d = bmp;
        this.e = i2;
        this.f = str2;
        this.g = z;
        this.h = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.c, i);
        bjr.a(parcel, 5, this.d, i);
        bjr.c(parcel, 6, this.e);
        bjr.a(parcel, 7, this.f);
        bjr.a(parcel, 8, this.g);
        bjr.a(parcel, 9, this.h);
        bjr.r(parcel, q);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bmf)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bmf bmf = (bmf) obj;
        return azb.a(this.b, bmf.b) && azb.a(Integer.valueOf(this.a), Integer.valueOf(bmf.a)) && azb.a(this.c, bmf.c) && azb.a(this.d, bmf.d) && azb.a(Integer.valueOf(this.e), Integer.valueOf(bmf.e)) && azb.a(this.f, bmf.f) && azb.a(Boolean.valueOf(this.g), Boolean.valueOf(bmf.g)) && azb.a(Boolean.valueOf(this.h), Boolean.valueOf(bmf.h));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.a), this.c, this.d, Integer.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h)});
    }

    public final String toString() {
        return azb.a(this).a("value", this.b).a("getContactMethodType", Integer.valueOf(this.a)).a("matchInfo", this.c).a("metadata", this.d).a("classificationType", Integer.valueOf(this.e)).a("label", this.f).a("isPrimary", Boolean.valueOf(this.g)).a("isSuperPrimary", Boolean.valueOf(this.h)).toString();
    }
}
