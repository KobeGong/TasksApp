package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: dzi  reason: default package */
/* compiled from: PG */
public final class dzi {
    public static final dzi a = new dzi(new dzm());
    public final IdentityHashMap b = new IdentityHashMap();
    public ScheduledExecutorService c;

    private dzi(dzm dzm) {
    }

    public static Object a(dzl dzl, Object obj) {
        return a.b(dzl, obj);
    }

    public final synchronized Object a(dzl dzl) {
        dzk dzk;
        dzk = (dzk) this.b.get(dzl);
        if (dzk == null) {
            dzk = new dzk(dzl.a());
            this.b.put(dzl, dzk);
        }
        if (dzk.c != null) {
            dzk.c.cancel(false);
            dzk.c = null;
        }
        dzk.b++;
        return dzk.a;
    }

    private final synchronized Object b(dzl dzl, Object obj) {
        boolean z;
        boolean z2 = true;
        synchronized (this) {
            dzk dzk = (dzk) this.b.get(dzl);
            if (dzk == null) {
                String valueOf = String.valueOf(dzl);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 29).append("No cached instance found for ").append(valueOf).toString());
            }
            cld.a(obj == dzk.a, "Releasing the wrong instance");
            if (dzk.b > 0) {
                z = true;
            } else {
                z = false;
            }
            cld.b(z, "Refcount has already reached zero");
            dzk.b--;
            if (dzk.b == 0) {
                if (dvc.a) {
                    dzl.a(obj);
                    this.b.remove(dzl);
                } else {
                    if (dzk.c != null) {
                        z2 = false;
                    }
                    cld.b(z2, "Destroy task already scheduled");
                    if (this.c == null) {
                        this.c = Executors.newSingleThreadScheduledExecutor(dvc.b("grpc-shared-destroyer-%d"));
                    }
                    dzk.c = this.c.schedule(new dwc(new dzj(this, dzk, dzl, obj)), 1, TimeUnit.SECONDS);
                }
            }
        }
        return null;
    }
}
