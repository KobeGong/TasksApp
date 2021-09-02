package defpackage;

/* renamed from: ccl reason: default package */
/* compiled from: PG */
public final class ccl {
    private final java.util.HashSet a = new java.util.HashSet();

    public final synchronized boolean a(defpackage.byq byq) {
        boolean z;
        while (this.a.contains(byq)) {
            try {
                wait();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                z = false;
            }
        }
        this.a.add(byq);
        z = true;
        return z;
    }

    public final synchronized void b(defpackage.byq byq) {
        this.a.remove(byq);
        notifyAll();
    }
}
