package defpackage;

import android.os.Bundle;

/* renamed from: azt  reason: default package */
/* compiled from: PG */
final class azt implements ayr, ays {
    private /* synthetic */ azk a;

    azt(azk azk) {
        this.a = azk;
    }

    @Override // defpackage.ayr
    public final void a(Bundle bundle) {
        this.a.d.a(new azr(this.a));
    }

    @Override // defpackage.ayr
    public final void a(int i) {
    }

    @Override // defpackage.ays
    public final void a(axq axq) {
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
