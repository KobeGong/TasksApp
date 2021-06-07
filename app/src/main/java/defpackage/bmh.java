package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: bmh  reason: default package */
/* compiled from: PG */
public final class bmh extends biq {
    public static final Parcelable.Creator CREATOR = new bmu();
    private int a;
    private List b;

    public bmh() {
    }

    public bmh(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final String toString() {
        return azb.a(this).a("spamStatus", Integer.valueOf(this.a)).a("person", this.b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list;
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 2, this.a);
        if (this.b == null) {
            list = Collections.emptyList();
        } else {
            list = this.b;
        }
        bjr.b(parcel, 3, list);
        bjr.r(parcel, q);
    }
}
