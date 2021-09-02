package defpackage;

/* renamed from: dzi reason: default package */
/* compiled from: PG */
public final class dzi {
    public static final defpackage.dzi a = new defpackage.dzi(new defpackage.dzm());
    public final java.util.IdentityHashMap b = new java.util.IdentityHashMap();
    public java.util.concurrent.ScheduledExecutorService c;

    private dzi(defpackage.dzm dzm) {
    }

    public static java.lang.Object a(defpackage.dzl dzl, java.lang.Object obj) {
        return a.b(dzl, obj);
    }

    public final synchronized java.lang.Object a(defpackage.dzl dzl) {
        defpackage.dzk dzk;
        dzk = (defpackage.dzk) this.b.get(dzl);
        if (dzk == null) {
            dzk = new defpackage.dzk(dzl.a());
            this.b.put(dzl, dzk);
        }
        if (dzk.c != null) {
            dzk.c.cancel(false);
            dzk.c = null;
        }
        dzk.b++;
        return dzk.a;
    }

    private final synchronized java.lang.Object b(defpackage.dzl dzl, java.lang.Object obj) {
        boolean z;
        boolean z2 = true;
        synchronized (this) {
            defpackage.dzk dzk = (defpackage.dzk) this.b.get(dzl);
            if (dzk == null) {
                java.lang.String valueOf = java.lang.String.valueOf(dzl);
                throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 29).append("No cached instance found for ").append(valueOf).toString());
            }
            defpackage.cld.a(obj == dzk.a, (java.lang.Object) "Releasing the wrong instance");
            if (dzk.b > 0) {
                z = true;
            } else {
                z = false;
            }
            defpackage.cld.b(z, (java.lang.Object) "Refcount has already reached zero");
            dzk.b--;
            if (dzk.b == 0) {
                if (defpackage.dvc.a) {
                    dzl.a(obj);
                    this.b.remove(dzl);
                } else {
                    if (dzk.c != null) {
                        z2 = false;
                    }
                    defpackage.cld.b(z2, (java.lang.Object) "Destroy task already scheduled");
                    if (this.c == null) {
                        this.c = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(defpackage.dvc.b("grpc-shared-destroyer-%d"));
                    }
                    dzk.c = this.c.schedule(new defpackage.dwc(new defpackage.dzj(this, dzk, dzl, obj)), 1, java.util.concurrent.TimeUnit.SECONDS);
                }
            }
        }
        return null;
    }
}
