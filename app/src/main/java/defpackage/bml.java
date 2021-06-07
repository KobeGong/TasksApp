package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bml  reason: default package */
/* compiled from: PG */
public final class bml extends biq {
    public static final Parcelable.Creator CREATOR = new bmy();
    private String a;
    private String b;
    private String c;
    private bmj d;
    private String e;

    public bml() {
    }

    public bml(String str, String str2, String str3, bmj bmj, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bmj;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bml)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bml bml = (bml) obj;
        return azb.a(this.a, bml.a) && azb.a(this.b, bml.b) && azb.a(this.c, bml.c) && azb.a(this.d, bml.d) && azb.a(this.e, bml.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return azb.a(this).a("displayName", this.a).a("givenName", this.b).a("familyName", this.c).a("matchInfo", this.d).a("alternativeDisplayName", this.e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.c);
        bjr.a(parcel, 5, this.d, i);
        bjr.a(parcel, 6, this.e);
        bjr.r(parcel, q);
    }
}
