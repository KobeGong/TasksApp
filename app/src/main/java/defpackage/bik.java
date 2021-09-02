package defpackage;

/* renamed from: bik reason: default package */
/* compiled from: PG */
public final class bik extends defpackage.bel {
    public bik(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, defpackage.ayr ayr, defpackage.ays ays) {
        super(context, looper, 74, bdj, ayr, ays);
    }

    /* access modifiers changed from: protected */
    public final java.lang.String f_() {
        return "com.google.android.gms.auth.api.accountactivationstate.START";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
        if (queryLocalInterface instanceof defpackage.bil) {
            return (defpackage.bil) queryLocalInterface;
        }
        return new defpackage.bim(iBinder);
    }
}
