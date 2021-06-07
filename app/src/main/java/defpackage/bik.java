package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bik  reason: default package */
/* compiled from: PG */
public final class bik extends bel {
    public bik(Context context, Looper looper, bdj bdj, ayr ayr, ays ays) {
        super(context, looper, 74, bdj, ayr, ays);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.auth.api.accountactivationstate.START";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
        if (queryLocalInterface instanceof bil) {
            return (bil) queryLocalInterface;
        }
        return new bim(iBinder);
    }
}
