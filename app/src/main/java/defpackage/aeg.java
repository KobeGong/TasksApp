package defpackage;

import android.database.DataSetObserver;

/* access modifiers changed from: package-private */
/* renamed from: aeg  reason: default package */
/* compiled from: PG */
public final class aeg extends DataSetObserver {
    private final /* synthetic */ aec a;

    aeg(aec aec) {
        this.a = aec;
    }

    public final void onChanged() {
        if (this.a.r.isShowing()) {
            this.a.d();
        }
    }

    public final void onInvalidated() {
        this.a.e();
    }
}
