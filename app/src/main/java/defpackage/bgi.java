package defpackage;

import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
/* renamed from: bgi  reason: default package */
/* compiled from: PG */
public abstract class bgi extends bca {
    public bgi(ayp ayp) {
        super(bgh.b, ayp);
    }

    @Override // defpackage.bcb, defpackage.bca
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((ayw) ((Status) obj));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ ayw a(Status status) {
        if (status == null) {
            return Status.c;
        }
        return status;
    }
}
