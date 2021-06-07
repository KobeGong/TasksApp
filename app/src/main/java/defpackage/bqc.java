package defpackage;

import android.database.ContentObserver;

/* access modifiers changed from: package-private */
/* renamed from: bqc  reason: default package */
/* compiled from: PG */
public final class bqc extends ContentObserver {
    bqc() {
        super(null);
    }

    public final void onChange(boolean z) {
        bqb.a.set(true);
    }
}
