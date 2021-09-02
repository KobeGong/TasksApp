package defpackage;

/* renamed from: bcm reason: default package */
/* compiled from: PG */
final class bcm implements defpackage.bav {
    private /* synthetic */ defpackage.bcj a;

    bcm(defpackage.bcj bcj) {
        this.a = bcj;
    }

    public final void a(android.os.Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = defpackage.axq.a;
            defpackage.bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(defpackage.axq axq) {
        this.a.g.lock();
        try {
            this.a.e = axq;
            defpackage.bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f) {
                this.a.f = false;
                defpackage.bcj.a(this.a, i, z);
                return;
            }
            this.a.f = true;
            this.a.a.a(i);
            this.a.g.unlock();
        } finally {
            this.a.g.unlock();
        }
    }
}
