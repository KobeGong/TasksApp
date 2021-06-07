package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bno  reason: default package */
/* compiled from: PG */
public final class bno extends bkm implements bnn {
    bno(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    @Override // defpackage.bnn
    public final void a(bnl bnl, boolean z, int i) {
        Parcel c = c();
        bko.a(c, bnl);
        bko.a(c, false);
        bko.a(c, z);
        c.writeString(null);
        c.writeString(null);
        c.writeInt(i);
        b(305, c);
    }

    @Override // defpackage.bnn
    public final Bundle a(bnl bnl, boolean z, String str, String str2, int i) {
        Parcel c = c();
        bko.a(c, bnl);
        bko.a(c, z);
        c.writeString(str);
        c.writeString(str2);
        c.writeInt(i);
        Parcel a = a(11, c);
        Bundle bundle = (Bundle) bko.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    @Override // defpackage.bnn
    public final bet a(bnl bnl, String str, String str2, int i, int i2) {
        bet beu;
        Parcel c = c();
        bko.a(c, bnl);
        c.writeString(str);
        c.writeString(str2);
        c.writeInt(i);
        c.writeInt(i2);
        Parcel a = a(505, c);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            beu = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof bet) {
                beu = (bet) queryLocalInterface;
            } else {
                beu = new beu(readStrongBinder);
            }
        }
        a.recycle();
        return beu;
    }
}
