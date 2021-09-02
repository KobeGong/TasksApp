package defpackage;

/* renamed from: azf reason: default package */
/* compiled from: PG */
final class azf implements defpackage.ayu {
    private /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult a;
    private /* synthetic */ defpackage.aze b;

    azf(defpackage.aze aze, com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.b = aze;
        this.a = basePendingResult;
    }

    public final void a(com.google.android.gms.common.api.Status status) {
        this.b.a.remove(this.a);
    }
}
