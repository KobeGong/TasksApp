package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: axf  reason: default package */
/* compiled from: PG */
public final class axf extends bel {
    public axf(Context context, Looper looper, bdj bdj, ayr ayr, ays ays) {
        super(context, looper, 40, bdj, ayr, ays);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (queryLocalInterface instanceof axi) {
            return (axi) queryLocalInterface;
        }
        return new axj(iBinder);
    }
}
