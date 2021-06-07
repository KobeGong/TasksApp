package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bni  reason: default package */
/* compiled from: PG */
final class bni implements blq {
    private final Status a;
    private final bcr b;

    public bni(Status status, bcr bcr) {
        this.a = status;
        this.b = bcr;
    }

    @Override // defpackage.blq
    public final bcr c() {
        return this.b;
    }

    @Override // defpackage.ayw
    public final Status b() {
        return this.a;
    }

    @Override // defpackage.ayv
    public final void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
}
