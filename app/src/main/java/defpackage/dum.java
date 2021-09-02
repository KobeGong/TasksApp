package defpackage;

/* renamed from: dum reason: default package */
/* compiled from: PG */
final class dum extends defpackage.dpf {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dum.class.getName());
    private static final boolean j = f();
    private static boolean k = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "false"));
    private static java.lang.String l;
    public final defpackage.dxq b;
    public final java.util.Random c = new java.util.Random();
    public defpackage.dup d;
    public final java.lang.String e;
    public final int f;
    public boolean g;
    public boolean h;
    public defpackage.dph i;
    private final java.lang.String m;
    private final defpackage.dzl n;
    private java.util.concurrent.ExecutorService o;
    private final java.lang.Runnable p;

    dum(java.lang.String str, defpackage.dmv dmv, defpackage.dzl dzl, defpackage.dxq dxq) {
        defpackage.dup dup;
        defpackage.dup duq = new defpackage.duq();
        if (!j || !k) {
            dup = duq;
        } else {
            dup = new defpackage.duo(duq, new defpackage.dur());
        }
        this.d = dup;
        this.p = new defpackage.dun(this);
        this.n = dzl;
        java.lang.String str2 = "//";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.net.URI create = java.net.URI.create(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
        this.m = (java.lang.String) defpackage.cld.a((java.lang.Object) create.getAuthority(), "nameUri (%s) doesn't have an authority", (java.lang.Object) create);
        this.e = (java.lang.String) defpackage.cld.a((java.lang.Object) create.getHost(), (java.lang.Object) "host");
        if (create.getPort() == -1) {
            java.lang.Integer num = (java.lang.Integer) dmv.a(defpackage.dpg.a);
            if (num != null) {
                this.f = num.intValue();
            } else {
                throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 69).append("name '").append(str).append("' doesn't contain a port, and default port is not set in params").toString());
            }
        } else {
            this.f = create.getPort();
        }
        this.b = dxq;
    }

    public final java.lang.String a() {
        return this.m;
    }

    public final synchronized void a(defpackage.dph dph) {
        defpackage.cld.b(this.i == null, (java.lang.Object) "already started");
        this.o = (java.util.concurrent.ExecutorService) defpackage.dzi.a.a(this.n);
        this.i = (defpackage.dph) defpackage.cld.a((java.lang.Object) dph, (java.lang.Object) "listener");
        e();
    }

    public final synchronized void c() {
        defpackage.cld.b(this.i != null, (java.lang.Object) "not started");
        e();
    }

    private final void e() {
        if (!this.h && !this.g) {
            this.o.execute(this.p);
        }
    }

    public final synchronized void b() {
        if (!this.g) {
            this.g = true;
            if (this.o != null) {
                this.o = (java.util.concurrent.ExecutorService) defpackage.dzi.a(this.n, this.o);
            }
        }
    }

    private static boolean f() {
        if (defpackage.dvc.a) {
            return false;
        }
        try {
            java.lang.Class.forName("javax.naming.directory.InitialDirContext");
            java.lang.Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return true;
        } catch (java.lang.ClassNotFoundException e2) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "jndiAvailable", "Unable to find JNDI DNS resolver, skipping", e2);
            return false;
        }
    }

    static java.lang.String a(java.lang.String str) {
        int i2;
        char c2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int i3 = 0;
        boolean z = false;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (!z) {
                if (charAt != ' ') {
                    if (charAt == '\"') {
                        z = true;
                    }
                    char c3 = charAt;
                    i2 = i3;
                    c2 = c3;
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
                char c32 = charAt;
                i2 = i3;
                c2 = c32;
                sb.append(c2);
                i3 = i2;
            }
            i3++;
        }
        return sb.toString();
    }

    static java.lang.String d() {
        if (l == null) {
            try {
                l = java.net.InetAddress.getLocalHost().getHostName();
            } catch (java.net.UnknownHostException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }
        return l;
    }
}
