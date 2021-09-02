package defpackage;

/* renamed from: bpc reason: default package */
/* compiled from: PG */
final class bpc extends android.database.ContentObserver {
    private /* synthetic */ defpackage.bow a;

    bpc(defpackage.bow bow) {
        this.a = bow;
        super(null);
    }

    public final void onChange(boolean z) {
        defpackage.bow bow = this.a;
        synchronized (bow.e) {
            bow.f = null;
        }
    }
}
