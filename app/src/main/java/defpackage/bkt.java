package defpackage;

import android.database.ContentObserver;

/* access modifiers changed from: package-private */
/* renamed from: bkt  reason: default package */
/* compiled from: PG */
public final class bkt extends ContentObserver {
    bkt() {
        super(null);
    }

    public final void onChange(boolean z) {
        bks.a.set(true);
    }
}
