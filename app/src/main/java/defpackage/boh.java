package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: boh  reason: default package */
/* compiled from: PG */
public final class boh extends biq implements bof {
    public static final Parcelable.Creator CREATOR = new bog();
    private final bol a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public boh(bol bol, String str, String str2, String str3, String str4, String str5) {
        this.a = bol;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a, i);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.c);
        bjr.a(parcel, 5, this.d);
        bjr.a(parcel, 6, this.e);
        bjr.a(parcel, 7, this.f);
        bjr.r(parcel, q);
    }

    @Override // defpackage.bcs
    public final boolean a() {
        return true;
    }
}
