package defpackage;

/* renamed from: axf reason: default package */
/* compiled from: PG */
public final class axf extends defpackage.bel {
    public axf(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, defpackage.ayr ayr, defpackage.ays ays) {
        super(context, looper, 40, bdj, ayr, ays);
    }

    /* access modifiers changed from: protected */
    public final java.lang.String f_() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (queryLocalInterface instanceof defpackage.axi) {
            return (defpackage.axi) queryLocalInterface;
        }
        return new defpackage.axj(iBinder);
    }
}
