package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: bmi  reason: default package */
/* compiled from: PG */
public final class bmi extends biq {
    public static final Parcelable.Creator CREATOR = new bmv();
    private String a;
    private List b;

    public bmi() {
    }

    public bmi(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list;
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        if (this.b == null) {
            list = Collections.emptyList();
        } else {
            list = this.b;
        }
        bjr.b(parcel, 3, list);
        bjr.r(parcel, q);
    }
}
