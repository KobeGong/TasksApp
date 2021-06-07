package defpackage;

/* renamed from: ahx  reason: default package */
/* compiled from: PG */
final class ahx implements Runnable {
    private final /* synthetic */ aic a;
    private final /* synthetic */ int b;
    private final /* synthetic */ aht c;

    ahx(aht aht, aic aic, int i) {
        this.c = aht;
        this.a = aic;
        this.b = i;
    }

    public final void run() {
        boolean z;
        if (this.c.o != null && this.c.o.isAttachedToWindow() && !this.a.k && this.a.e.d() != -1) {
            aey aey = this.c.o.z;
            if (aey == null || !aey.b()) {
                aht aht = this.c;
                int size = aht.m.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = false;
                        break;
                    } else if (!((aic) aht.m.get(i)).l) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    this.c.j.a(this.a.e, this.b);
                    return;
                }
            }
            this.c.o.post(this);
        }
    }
}
