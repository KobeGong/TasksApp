package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bja  reason: default package */
/* compiled from: PG */
public final class bja extends bkm implements biz {
    bja(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // defpackage.biz
    public final void a(bix bix) {
        Parcel c = c();
        bko.a(c, bix);
        c(1, c);
    }
}
