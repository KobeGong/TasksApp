package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* renamed from: bhn  reason: default package */
/* compiled from: PG */
public final class bhn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TogglingData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = bjr.a(parcel);
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str3 = bjr.h(parcel, readInt);
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
        return new TogglingData(str3, str2, str);
    }
}
