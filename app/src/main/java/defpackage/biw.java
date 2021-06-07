package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: biw  reason: default package */
/* compiled from: PG */
public final class biw extends bel {
    public biw(Context context, Looper looper, bdj bdj, ayr ayr, ays ays) {
        super(context, looper, 39, bdj, ayr, ays);
    }

    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.common.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof biz) {
            return (biz) queryLocalInterface;
        }
        return new bja(iBinder);
    }
}
