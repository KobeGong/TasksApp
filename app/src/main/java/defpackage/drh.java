package defpackage;

import java.io.InputStream;

/* renamed from: drh  reason: default package */
/* compiled from: PG */
final class drh implements dzr {
    private final Runnable a;
    private boolean b = false;
    private final /* synthetic */ dqz c;

    drh(dqz dqz, Runnable runnable) {
        this.c = dqz;
        this.a = runnable;
    }

    @Override // defpackage.dzr
    public final InputStream a() {
        if (!this.b) {
            this.a.run();
            this.b = true;
        }
        return (InputStream) this.c.c.poll();
    }
}
