package defpackage;

/* renamed from: bif reason: default package */
/* compiled from: PG */
public final class bif extends defpackage.bkm implements defpackage.bie {
    public bif(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void a(android.os.Message message) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.Parcelable) message);
        c(1, c);
    }
}
