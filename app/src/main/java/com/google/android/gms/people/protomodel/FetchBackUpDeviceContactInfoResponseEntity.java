package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class FetchBackUpDeviceContactInfoResponseEntity extends biq implements bnu {
    public static final Parcelable.Creator CREATOR = new boe();
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.b(parcel, 2, b());
        bjr.r(parcel, q);
    }

    @Override // defpackage.bcs
    public final boolean a() {
        return true;
    }

    @Override // defpackage.bnu
    public final List b() {
        if (this.b == null && this.a != null) {
            this.b = new ArrayList(this.a.size());
            for (bnt bnt : this.a) {
                this.b.add(bnt);
            }
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bnu)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return azb.a(b(), ((bnu) obj).b());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b()});
    }
}
