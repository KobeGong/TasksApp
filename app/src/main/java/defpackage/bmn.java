package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.model.AvatarReference;
import java.util.Arrays;

/* renamed from: bmn  reason: default package */
/* compiled from: PG */
public final class bmn extends biq {
    public static final Parcelable.Creator CREATOR = new bna();
    private AvatarReference a;

    public bmn() {
    }

    public bmn(AvatarReference avatarReference) {
        this.a = avatarReference;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 3, this.a, i);
        bjr.r(parcel, q);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bmn)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.a.equals(((bmn) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
