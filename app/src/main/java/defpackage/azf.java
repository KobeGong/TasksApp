package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: azf  reason: default package */
/* compiled from: PG */
final class azf implements ayu {
    private /* synthetic */ BasePendingResult a;
    private /* synthetic */ aze b;

    azf(aze aze, BasePendingResult basePendingResult) {
        this.b = aze;
        this.a = basePendingResult;
    }

    @Override // defpackage.ayu
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
