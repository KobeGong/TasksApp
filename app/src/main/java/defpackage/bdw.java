package defpackage;

/* renamed from: bdw reason: default package */
/* compiled from: PG */
public final class bdw extends defpackage.bkm implements defpackage.bev {
    public bdw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final defpackage.bfl a() {
        android.os.Parcel a = a(1, c());
        defpackage.bfl a2 = defpackage.bfm.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int b() {
        android.os.Parcel a = a(2, c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
