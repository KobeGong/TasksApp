package defpackage;

/* renamed from: bqc reason: default package */
/* compiled from: PG */
final class bqc extends android.database.ContentObserver {
    bqc() {
        super(null);
    }

    public final void onChange(boolean z) {
        defpackage.bqb.a.set(true);
    }
}
