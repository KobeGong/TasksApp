package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bhq  reason: default package */
/* compiled from: PG */
public final class bhq extends biq {
    public static final Parcelable.Creator CREATOR = new bhs();
    public final String a;
    private final String b;

    public bhq(String str, String str2) {
        azb.a(str, (Object) "Account name must not be empty.");
        this.a = str;
        this.b = str2;
    }

    public static bhq a(String str) {
        azb.a(str, (Object) "Account name must not be empty.");
        return new bhq(str, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 1, this.a);
        bjr.a(parcel, 2, this.b);
        bjr.r(parcel, q);
    }
}
