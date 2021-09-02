package defpackage;

/* renamed from: bni reason: default package */
/* compiled from: PG */
final class bni implements defpackage.blq {
    private final com.google.android.gms.common.api.Status a;
    private final defpackage.bcr b;

    public bni(com.google.android.gms.common.api.Status status, defpackage.bcr bcr) {
        this.a = status;
        this.b = bcr;
    }

    public final defpackage.bcr c() {
        return this.b;
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.a;
    }

    public final void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
}
