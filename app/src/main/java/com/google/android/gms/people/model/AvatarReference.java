package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class AvatarReference extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bns();
    private int a;
    private String b;

    public AvatarReference(int i, String str) {
        azb.a(i != 0);
        this.a = i;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.a);
        bjr.a(parcel, 2, this.b);
        bjr.r(parcel, q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvatarReference avatarReference = (AvatarReference) obj;
        if (this.a == avatarReference.a) {
            if (this.b != null) {
                if (this.b.equals(avatarReference.b)) {
                    return true;
                }
            } else if (avatarReference.b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return azb.a(this).a("source", Integer.valueOf(this.a)).a("location", this.b).toString();
    }
}
