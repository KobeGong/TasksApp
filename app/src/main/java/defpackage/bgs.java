package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: bgs  reason: default package */
/* compiled from: PG */
public final class bgs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bgl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        String str = null;
        String str2 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) bjr.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 4:
                    str = bjr.h(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bgl(parcelFileDescriptor, str2, str);
    }
}
