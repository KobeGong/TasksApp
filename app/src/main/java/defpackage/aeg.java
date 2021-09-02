package defpackage;

/* renamed from: aeg reason: default package */
/* compiled from: PG */
final class aeg extends android.database.DataSetObserver {
    private final /* synthetic */ defpackage.aec a;

    aeg(defpackage.aec aec) {
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
