package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import java.util.ArrayList;

/* renamed from: avm  reason: default package */
/* compiled from: PG */
public final class avm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PasswordSpecification[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = bjr.h(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = bjr.o(parcel, readInt);
                    break;
                case 3:
                    int a2 = bjr.a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a2 == 0) {
                        arrayList = null;
                        break;
                    } else {
                        arrayList = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (int i3 = 0; i3 < readInt2; i3++) {
                            arrayList.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + a2);
                        break;
                    }
                case 4:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 5:
                    i = bjr.d(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new PasswordSpecification(str, arrayList2, arrayList, i2, i);
    }
}
