package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: bns  reason: default package */
/* compiled from: PG */
public final class bns implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AvatarReference[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = bjr.d(parcel, readInt);
                    break;
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new AvatarReference(i, str);
    }
}
