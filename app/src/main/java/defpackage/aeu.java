package defpackage;

import android.database.Observable;

/* renamed from: aeu  reason: default package */
/* compiled from: PG */
public final class aeu extends Observable {
    aeu() {
    }

    public final boolean hasObserbers() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aev) this.mObservers.get(size)).a();
        }
    }

    public final void a(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aev) this.mObservers.get(size)).a(i, i2);
        }
    }

    public final void b(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aev) this.mObservers.get(size)).b(i, i2);
        }
    }

    public final void c(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aev) this.mObservers.get(size)).c(i, i2);
        }
    }

    public final void d(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aev) this.mObservers.get(size)).d(i, i2);
        }
    }
}
