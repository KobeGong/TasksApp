package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: axj  reason: default package */
/* compiled from: PG */
public final class axj extends bkm implements axi {
    axj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // defpackage.axi
    public final void a(axg axg, axa axa) {
        Parcel c = c();
        bko.a(c, axg);
        bko.a(c, axa);
        c(1, c);
    }
}
