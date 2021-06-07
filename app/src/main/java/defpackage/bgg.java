package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bgg  reason: default package */
/* compiled from: PG */
public final class bgg extends bkm implements bgf {
    public bgg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // defpackage.bgf
    public final bfl a(bfl bfl, String str, int i, bfl bfl2) {
        Parcel c = c();
        bko.a(c, bfl);
        c.writeString(str);
        c.writeInt(i);
        bko.a(c, bfl2);
        Parcel a = a(2, c);
        bfl a2 = bfm.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
