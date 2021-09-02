package defpackage;

/* renamed from: bja reason: default package */
/* compiled from: PG */
public final class bja extends defpackage.bkm implements defpackage.biz {
    bja(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void a(defpackage.bix bix) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bix);
        c(1, c);
    }
}
