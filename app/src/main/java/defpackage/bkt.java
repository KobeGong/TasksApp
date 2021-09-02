package defpackage;

/* renamed from: bkt reason: default package */
/* compiled from: PG */
final class bkt extends android.database.ContentObserver {
    bkt() {
        super(null);
    }

    public final void onChange(boolean z) {
        defpackage.bks.a.set(true);
    }
}
