package defpackage;

/* renamed from: dns reason: default package */
/* compiled from: PG */
public class dns {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dns.class.getName());
    private static final defpackage.dpo d = new defpackage.dpo();
    private static final defpackage.dns e = new defpackage.dns(d);
    private static final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();
    public final defpackage.dnt b = null;
    public final defpackage.dpo c;

    private static defpackage.dnx f() {
        defpackage.dnx dnx = (defpackage.dnx) f.get();
        if (dnx == null) {
            return g();
        }
        return dnx;
    }

    private static defpackage.dnx g() {
        try {
            f.compareAndSet(null, (defpackage.dnx) java.lang.Class.forName("io.grpc.override.ContextStorageOverride").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
        } catch (java.lang.ClassNotFoundException e2) {
            if (f.compareAndSet(null, new defpackage.dqd())) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.Context", "createStorage", "Storage override doesn't exist. Using default", e2);
            }
        } catch (java.lang.Exception e3) {
            throw new java.lang.RuntimeException("Storage override failed to initialize", e3);
        }
        return (defpackage.dnx) f.get();
    }

    public static defpackage.dnv a(java.lang.String str) {
        return new defpackage.dnv(str);
    }

    public static defpackage.dns a() {
        defpackage.dns a2 = f().a();
        if (a2 == null) {
            return e;
        }
        return a2;
    }

    private dns(defpackage.dpo dpo) {
        new defpackage.dnw(this);
        this.c = dpo;
    }

    public boolean b() {
        return false;
    }

    public defpackage.dns c() {
        defpackage.dns a2 = f().a(this);
        if (a2 == null) {
            return e;
        }
        return a2;
    }

    public void a(defpackage.dns dns) {
        a(dns, "toAttach");
        f().a(this, dns);
    }

    public boolean d() {
        return false;
    }

    public defpackage.dny e() {
        return null;
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj2));
    }
}
