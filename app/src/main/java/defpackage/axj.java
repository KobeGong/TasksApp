package defpackage;

/* renamed from: axj reason: default package */
/* compiled from: PG */
public final class axj extends defpackage.bkm implements defpackage.axi {
    axj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(defpackage.axg axg, defpackage.axa axa) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) axg);
        defpackage.bko.a(c, (android.os.Parcelable) axa);
        c(1, c);
    }
}
