package defpackage;

/* renamed from: azt reason: default package */
/* compiled from: PG */
final class azt implements defpackage.ayr, defpackage.ays {
    private /* synthetic */ defpackage.azk a;

    azt(defpackage.azk azk) {
        this.a = azk;
    }

    public final void a(android.os.Bundle bundle) {
        this.a.d.a(new defpackage.azr(this.a));
    }

    public final void a(int i) {
    }

    public final void a(defpackage.axq axq) {
        this.a.b.lock();
        try {
            if (this.a.a(axq)) {
                this.a.f();
                this.a.e();
            } else {
                this.a.b(axq);
            }
        } finally {
            this.a.b.unlock();
        }
    }
}
