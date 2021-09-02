package defpackage;

/* renamed from: bcl reason: default package */
/* compiled from: PG */
final class bcl implements defpackage.bav {
    private /* synthetic */ defpackage.bcj a;

    bcl(defpackage.bcj bcj) {
        this.a = bcj;
    }

    public final void a(android.os.Bundle bundle) {
        this.a.g.lock();
        try {
            defpackage.bcj bcj = this.a;
            if (bcj.c == null) {
                bcj.c = bundle;
            } else if (bundle != null) {
                bcj.c.putAll(bundle);
            }
            this.a.d = defpackage.axq.a;
            defpackage.bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(defpackage.axq axq) {
        this.a.g.lock();
        try {
            this.a.d = axq;
            defpackage.bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f || this.a.e == null || !this.a.e.b()) {
                this.a.f = false;
                defpackage.bcj.a(this.a, i, z);
                return;
            }
            this.a.f = true;
            this.a.b.a(i);
            this.a.g.unlock();
        } finally {
            this.a.g.unlock();
        }
    }
}
