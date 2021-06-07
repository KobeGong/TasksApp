package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bdy  reason: default package */
/* compiled from: PG */
public final class bdy extends bkm implements bdx {
    public bdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // defpackage.bdx
    public final boolean a(bfj bfj, bfl bfl) {
        Parcel c = c();
        bko.a(c, bfj);
        bko.a(c, bfl);
        Parcel a = a(5, c);
        boolean a2 = bko.a(a);
        a.recycle();
        return a2;
    }
}
