package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bjs  reason: default package */
/* compiled from: PG */
public final class bjs extends bmc {
    private /* synthetic */ String e;
    private /* synthetic */ String f;
    private /* synthetic */ int g;
    private /* synthetic */ int h;

    private bjs(ayp ayp) {
        super(ayp);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, defpackage.bmc
    public final /* synthetic */ ayw a(Status status) {
        return new bjt(status);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public bjs(ayp ayp, String str, String str2, int i, int i2) {
        this(ayp);
        this.e = str;
        this.f = null;
        this.g = i;
        this.h = 1;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bca
    public final /* synthetic */ void a(ayg ayg) {
        bet a = ((bnq) ayg).a(this, this.e, this.f, this.g, this.h);
        synchronized (this.a) {
            this.b = a;
        }
    }
}
