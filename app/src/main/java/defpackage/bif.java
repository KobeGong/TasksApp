package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* renamed from: bif  reason: default package */
/* compiled from: PG */
public final class bif extends bkm implements bie {
    public bif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    @Override // defpackage.bie
    public final void a(Message message) {
        Parcel c = c();
        bko.a(c, message);
        c(1, c);
    }
}
