package defpackage;

import android.os.Bundle;

/* access modifiers changed from: package-private */
/* renamed from: bcl  reason: default package */
/* compiled from: PG */
public final class bcl implements bav {
    private /* synthetic */ bcj a;

    bcl(bcj bcj) {
        this.a = bcj;
    }

    @Override // defpackage.bav
    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            bcj bcj = this.a;
            if (bcj.c == null) {
                bcj.c = bundle;
            } else if (bundle != null) {
                bcj.c.putAll(bundle);
            }
            this.a.d = axq.a;
            bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.bav
    public final void a(axq axq) {
        this.a.g.lock();
        try {
            this.a.d = axq;
            bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.bav
    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f || this.a.e == null || !this.a.e.b()) {
                this.a.f = false;
                bcj.a(this.a, i, z);
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
