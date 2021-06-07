package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: azr  reason: default package */
/* compiled from: PG */
final class azr extends bke {
    private final WeakReference a;

    azr(azk azk) {
        super((byte) 0);
        this.a = new WeakReference(azk);
    }

    @Override // defpackage.bkd, defpackage.bke
    public final void a(bkk bkk) {
        azk azk = (azk) this.a.get();
        if (azk != null) {
            azk.a.a(new azs(azk, azk, bkk));
        }
    }
}
