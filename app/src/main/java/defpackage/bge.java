package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bge  reason: default package */
/* compiled from: PG */
public final class bge extends bkm implements bgd {
    public bge(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // defpackage.bgd
    public final bfl a(bfl bfl, String str, int i) {
        Parcel c = c();
        bko.a(c, bfl);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = a(2, c);
        bfl a2 = bfm.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // defpackage.bgd
    public final int a(bfl bfl, String str, boolean z) {
        Parcel c = c();
        bko.a(c, bfl);
        c.writeString(str);
        bko.a(c, z);
        Parcel a = a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
