package defpackage;

/* renamed from: biw reason: default package */
/* compiled from: PG */
public final class biw extends defpackage.bel {
    public biw(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, defpackage.ayr ayr, defpackage.ays ays) {
        super(context, looper, 39, bdj, ayr, ays);
    }

    public final java.lang.String f_() {
        return "com.google.android.gms.common.service.START";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof defpackage.biz) {
            return (defpackage.biz) queryLocalInterface;
        }
        return new defpackage.bja(iBinder);
    }
}
