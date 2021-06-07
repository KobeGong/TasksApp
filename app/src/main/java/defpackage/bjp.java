package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bjp  reason: default package */
/* compiled from: PG */
public final class bjp extends bmc {
    private /* synthetic */ blp e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjp(ayp ayp, blp blp) {
        super(ayp);
        this.e = blp;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bca
    public final /* synthetic */ void a(ayg ayg) {
        ((bnq) ayg).a(this, this.e.b, this.e.c);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult, defpackage.bmc
    public final /* synthetic */ ayw a(Status status) {
        return new bjq(status);
    }
}
