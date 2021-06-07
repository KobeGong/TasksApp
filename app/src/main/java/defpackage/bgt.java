package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bgt  reason: default package */
/* compiled from: PG */
public final class bgt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bgm[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                    z = bjr.c(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bgm(str, z);
    }
}
