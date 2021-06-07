package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dns  reason: default package */
/* compiled from: PG */
public class dns {
    public static final Logger a = Logger.getLogger(dns.class.getName());
    private static final dpo d = new dpo();
    private static final dns e = new dns(d);
    private static final AtomicReference f = new AtomicReference();
    public final dnt b = null;
    public final dpo c;

    private static dnx f() {
        dnx dnx = (dnx) f.get();
        if (dnx == null) {
            return g();
        }
        return dnx;
    }

    private static dnx g() {
        try {
            f.compareAndSet(null, (dnx) Class.forName("io.grpc.override.ContextStorageOverride").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException e2) {
            if (f.compareAndSet(null, new dqd())) {
                a.logp(Level.FINE, "io.grpc.Context", "createStorage", "Storage override doesn't exist. Using default", (Throwable) e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Storage override failed to initialize", e3);
        }
        return (dnx) f.get();
    }

    public static dnv a(String str) {
        return new dnv(str);
    }

    public static dns a() {
        dns a2 = f().a();
        if (a2 == null) {
            return e;
        }
        return a2;
    }

    private dns(dpo dpo) {
        new dnw(this);
        this.c = dpo;
    }

    public boolean b() {
        return false;
    }

    public dns c() {
        dns a2 = f().a(this);
        if (a2 == null) {
            return e;
        }
        return a2;
    }

    public void a(dns dns) {
        a(dns, "toAttach");
        f().a(this, dns);
    }

    public boolean d() {
        return false;
    }

    public dny e() {
        return null;
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }
}
