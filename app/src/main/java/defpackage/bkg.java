package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bkg  reason: default package */
/* compiled from: PG */
public final class bkg extends bkm implements bkf {
    bkg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // defpackage.bkf
    public final void a(int i) {
        Parcel c = c();
        c.writeInt(i);
        b(7, c);
    }

    @Override // defpackage.bkf
    public final void a(bdp bdp, int i, boolean z) {
        Parcel c = c();
        bko.a(c, bdp);
        c.writeInt(i);
        bko.a(c, z);
        b(9, c);
    }

    @Override // defpackage.bkf
    public final void a(bki bki, bkd bkd) {
        Parcel c = c();
        bko.a(c, bki);
        bko.a(c, bkd);
        b(12, c);
    }
}
