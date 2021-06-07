package defpackage;

import android.database.ContentObserver;

/* renamed from: bpc  reason: default package */
/* compiled from: PG */
final class bpc extends ContentObserver {
    private /* synthetic */ bow a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bpc(bow bow) {
        super(null);
        this.a = bow;
    }

    public final void onChange(boolean z) {
        bow bow = this.a;
        synchronized (bow.e) {
            bow.f = null;
        }
    }
}
