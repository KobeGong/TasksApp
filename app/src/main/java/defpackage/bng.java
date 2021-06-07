package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* access modifiers changed from: package-private */
/* renamed from: bng  reason: default package */
/* compiled from: PG */
public final class bng extends bnm {
    private final bcb a;

    public bng(bcb bcb) {
        super((byte) 0);
        this.a = bcb;
    }

    @Override // defpackage.bnm
    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.a(new bni(bnq.a(i, bundle), dataHolder == null ? null : new bcr(dataHolder, (byte) 0)));
    }
}
