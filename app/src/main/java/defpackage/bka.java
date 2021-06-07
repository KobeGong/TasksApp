package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bka  reason: default package */
/* compiled from: PG */
public final class bka extends bel {
    public bka(Context context, Looper looper, bdj bdj, ayr ayr, ays ays) {
        super(context, looper, 51, bdj, ayr, ays);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof bjx) {
            return (bjx) queryLocalInterface;
        }
        return new bjy(iBinder);
    }
}
