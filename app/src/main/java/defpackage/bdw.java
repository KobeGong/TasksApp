package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bdw  reason: default package */
/* compiled from: PG */
public final class bdw extends bkm implements bev {
    public bdw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.bev
    public final bfl a() {
        Parcel a = a(1, c());
        bfl a2 = bfm.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // defpackage.bev
    public final int b() {
        Parcel a = a(2, c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
