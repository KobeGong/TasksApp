package defpackage;

import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: bad  reason: default package */
/* compiled from: PG */
public final class bad extends bas {
    private WeakReference a;

    bad(azx azx) {
        this.a = new WeakReference(azx);
    }

    @Override // defpackage.bas
    public final void a() {
        azx azx = (azx) this.a.get();
        if (azx != null) {
            azx.a(azx);
        }
    }
}
