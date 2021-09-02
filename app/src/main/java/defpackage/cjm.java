package defpackage;

/* renamed from: cjm reason: default package */
/* compiled from: PG */
final class cjm implements defpackage.cgx, defpackage.cls {
    public final defpackage.clt a;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public boolean c;
    private final defpackage.cha d;

    cjm(defpackage.cha cha, defpackage.clt clt) {
        this.d = cha;
        this.a = clt;
        cha.a((defpackage.cgp) this);
    }

    public final void a() {
        this.d.b(this);
    }

    public final void b(android.app.Activity activity) {
        synchronized (this.b) {
            if (!this.c) {
                this.c = true;
                this.d.b(this);
                java.util.ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    ((java.util.concurrent.ScheduledExecutorService) this.a.a()).submit((java.lang.Runnable) arrayList.get(i));
                    i = i2;
                }
                this.b.clear();
            }
        }
    }
}
