package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bos  reason: default package */
/* compiled from: PG */
public final class bos implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bot[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num = null;
        int a = bjr.a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                    num = bjr.e(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bot(str, num);
    }
}
