package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;

/* renamed from: bct  reason: default package */
/* compiled from: PG */
public final class bct implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = bjr.d(parcel, readInt);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) bjr.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = bjr.d(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }
}
