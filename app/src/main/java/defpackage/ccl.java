package defpackage;

import java.util.HashSet;

/* renamed from: ccl  reason: default package */
/* compiled from: PG */
public final class ccl {
    private final HashSet a = new HashSet();

    public final synchronized boolean a(byq byq) {
        boolean z;
        while (this.a.contains(byq)) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                z = false;
            }
        }
        this.a.add(byq);
        z = true;
        return z;
    }

    public final synchronized void b(byq byq) {
        this.a.remove(byq);
        notifyAll();
    }
}
