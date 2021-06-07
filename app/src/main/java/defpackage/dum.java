package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: dum  reason: default package */
/* compiled from: PG */
public final class dum extends dpf {
    public static final Logger a = Logger.getLogger(dum.class.getName());
    private static final boolean j = f();
    private static boolean k = Boolean.parseBoolean(System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "false"));
    private static String l;
    public final dxq b;
    public final Random c = new Random();
    public dup d;
    public final String e;
    public final int f;
    public boolean g;
    public boolean h;
    public dph i;
    private final String m;
    private final dzl n;
    private ExecutorService o;
    private final Runnable p;

    dum(String str, dmv dmv, dzl dzl, dxq dxq) {
        dup dup;
        duq duq = new duq();
        if (!j || !k) {
            dup = duq;
        } else {
            dup = new duo(duq, new dur());
        }
        this.d = dup;
        this.p = new dun(this);
        this.n = dzl;
        String valueOf = String.valueOf(str);
        URI create = URI.create(valueOf.length() != 0 ? "//".concat(valueOf) : new String("//"));
        this.m = (String) cld.a(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.e = (String) cld.a(create.getHost(), "host");
        if (create.getPort() == -1) {
            Integer num = (Integer) dmv.a(dpg.a);
            if (num != null) {
                this.f = num.intValue();
            } else {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 69).append("name '").append(str).append("' doesn't contain a port, and default port is not set in params").toString());
            }
        } else {
            this.f = create.getPort();
        }
        this.b = dxq;
    }

    @Override // defpackage.dpf
    public final String a() {
        return this.m;
    }

    @Override // defpackage.dpf
    public final synchronized void a(dph dph) {
        cld.b(this.i == null, "already started");
        this.o = (ExecutorService) dzi.a.a(this.n);
        this.i = (dph) cld.a(dph, "listener");
        e();
    }

    @Override // defpackage.dpf
    public final synchronized void c() {
        cld.b(this.i != null, "not started");
        e();
    }

    private final void e() {
        if (!this.h && !this.g) {
            this.o.execute(this.p);
        }
    }

    @Override // defpackage.dpf
    public final synchronized void b() {
        if (!this.g) {
            this.g = true;
            if (this.o != null) {
                this.o = (ExecutorService) dzi.a(this.n, this.o);
            }
        }
    }

    private static boolean f() {
        if (dvc.a) {
            return false;
        }
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return true;
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "jndiAvailable", "Unable to find JNDI DNS resolver, skipping", (Throwable) e2);
            return false;
        }
    }

    static String a(String str) {
        int i2;
        char c2;
        StringBuilder sb = new StringBuilder(str.length());
        int i3 = 0;
        boolean z = false;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (!z) {
                if (charAt != ' ') {
                    if (charAt == '\"') {
                        z = true;
                    }
                    i2 = i3;
                    c2 = charAt;
                    sb.append(c2);
                    i3 = i2;
                }
            } else if (charAt == '\"') {
                z = false;
            } else {
                if (charAt == '\\') {
                    i2 = i3 + 1;
                    c2 = str.charAt(i2);
                    sb.append(c2);
                    i3 = i2;
                }
                i2 = i3;
                c2 = charAt;
                sb.append(c2);
                i3 = i2;
            }
            i3++;
        }
        return sb.toString();
    }

    static String d() {
        if (l == null) {
            try {
                l = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return l;
    }
}
