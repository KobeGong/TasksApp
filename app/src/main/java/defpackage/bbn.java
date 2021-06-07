package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bbn  reason: default package */
/* compiled from: PG */
public final class bbn extends BasePendingResult {
    public bbn(ayp ayp) {
        super(ayp);
    }

    @Deprecated
    public bbn(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ ayw a(Status status) {
        return status;
    }
}
