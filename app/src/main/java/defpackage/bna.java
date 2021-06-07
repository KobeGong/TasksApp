package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: bna  reason: default package */
/* compiled from: PG */
public final class bna implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bmn[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        AvatarReference avatarReference = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 3:
                    avatarReference = (AvatarReference) bjr.a(parcel, readInt, AvatarReference.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bmn(avatarReference);
    }
}
