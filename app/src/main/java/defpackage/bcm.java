package defpackage;

import android.os.Bundle;

/* access modifiers changed from: package-private */
/* renamed from: bcm  reason: default package */
/* compiled from: PG */
public final class bcm implements bav {
    private /* synthetic */ bcj a;

    bcm(bcj bcj) {
        this.a = bcj;
    }

    @Override // defpackage.bav
    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = axq.a;
            bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.bav
    public final void a(axq axq) {
        this.a.g.lock();
        try {
            this.a.e = axq;
            bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.bav
    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f) {
                this.a.f = false;
                bcj.a(this.a, i, z);
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
