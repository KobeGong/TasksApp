package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bat  reason: default package */
/* compiled from: PG */
public final class bat extends aza {
    private bca a;

    public bat(bca bca) {
        this.a = bca;
    }

    @Override // defpackage.aza
    public final void a(bak bak) {
        this.a.b(bak.a);
    }

    @Override // defpackage.aza
    public final void a(Status status) {
        this.a.c(status);
    }

    @Override // defpackage.aza
    public final void a(aze aze, boolean z) {
        bca bca = this.a;
        aze.a.put(bca, Boolean.valueOf(z));
        bca.a((ayu) new azf(aze, bca));
    }
}
