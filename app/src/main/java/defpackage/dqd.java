package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: dqd  reason: default package */
/* compiled from: PG */
public final class dqd extends dnx {
    private static final Logger a = Logger.getLogger(dqd.class.getName());
    private static final ThreadLocal b = new ThreadLocal();

    dqd() {
    }

    @Override // defpackage.dnx
    public final dns a(dns dns) {
        dns a2 = a();
        b.set(dns);
        return a2;
    }

    @Override // defpackage.dnx
    public final void a(dns dns, dns dns2) {
        if (a() != dns) {
            a.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        a(dns2);
    }

    @Override // defpackage.dnx
    public final dns a() {
        return (dns) b.get();
    }
}
