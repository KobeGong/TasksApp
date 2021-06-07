package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: axb  reason: default package */
/* compiled from: PG */
public final class axb extends biq {
    public static final Parcelable.Creator CREATOR = new axm();
    public final int a;
    public final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final int i;

    public axb(String str, int i2, int i3, String str2, String str3, boolean z, String str4, boolean z2, int i4) {
        this.c = str;
        this.d = i2;
        this.a = i3;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.b = str4;
        this.h = z2;
        this.i = i4;
    }

    public axb(String str, int i2, int i3, String str2, String str3, String str4, boolean z, int i4) {
        this.c = (String) azb.b((Object) str);
        this.d = i2;
        this.a = i3;
        this.b = str2;
        this.e = str3;
        this.f = str4;
        this.g = !z;
        this.h = z;
        this.i = i4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.c);
        bjr.c(parcel, 3, this.d);
        bjr.c(parcel, 4, this.a);
        bjr.a(parcel, 5, this.e);
        bjr.a(parcel, 6, this.f);
        bjr.a(parcel, 7, this.g);
        bjr.a(parcel, 8, this.b);
        bjr.a(parcel, 9, this.h);
        bjr.c(parcel, 10, this.i);
        bjr.r(parcel, q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(this.d), Integer.valueOf(this.a), this.b, this.e, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(this.i)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axb)) {
            return false;
        }
        axb axb = (axb) obj;
        return azb.a(this.c, axb.c) && this.d == axb.d && this.a == axb.a && azb.a(this.b, axb.b) && azb.a(this.e, axb.e) && azb.a(this.f, axb.f) && this.g == axb.g && this.h == axb.h && this.i == axb.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayLoggerContext[");
        sb.append("package=").append(this.c).append(',');
        sb.append("packageVersionCode=").append(this.d).append(',');
        sb.append("logSource=").append(this.a).append(',');
        sb.append("logSourceName=").append(this.b).append(',');
        sb.append("uploadAccount=").append(this.e).append(',');
        sb.append("loggingId=").append(this.f).append(',');
        sb.append("logAndroidId=").append(this.g).append(',');
        sb.append("isAnonymous=").append(this.h).append(',');
        sb.append("qosTier=").append(this.i);
        sb.append("]");
        return sb.toString();
    }
}
