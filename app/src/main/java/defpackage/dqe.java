package defpackage;

/* renamed from: dqe reason: default package */
/* compiled from: PG */
public final class dqe implements defpackage.dmy {
    public static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.dqe.class.getName());
    private static final defpackage.dqf f = a(defpackage.dqe.class.getClassLoader());
    public defpackage.dor d;
    public java.util.Map e;
    private final defpackage.crd g;

    public dqe(defpackage.crd crd) {
        this(crd, f);
    }

    private dqe(defpackage.crd crd, defpackage.dqf dqf) {
        defpackage.cld.a((java.lang.Object) crd, (java.lang.Object) "creds");
        if (dqf != null) {
            crd = dqf.a(crd);
        }
        this.g = crd;
    }

    public final void a(defpackage.dpb dpb, defpackage.dmv dmv, java.util.concurrent.Executor executor, defpackage.dmz dmz) {
        try {
            this.g.a(a((java.lang.String) defpackage.cld.a((java.lang.Object) (java.lang.String) dmv.a(b), (java.lang.Object) "authority"), dpb), executor, new defpackage.crf(this, dmz));
        } catch (defpackage.dqa e2) {
            dmz.a(e2.a);
        }
    }

    private static java.net.URI a(java.lang.String str, defpackage.dpb dpb) {
        if (str == null) {
            throw defpackage.dpw.f.a("Channel has no authority").c();
        }
        java.lang.String str2 = "/";
        java.lang.String valueOf = java.lang.String.valueOf(defpackage.dpb.a(dpb.b));
        try {
            java.net.URI uri = new java.net.URI("https", str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2), null, null);
            if (uri.getPort() == 443) {
                return a(uri);
            }
            return uri;
        } catch (java.net.URISyntaxException e2) {
            throw defpackage.dpw.f.a("Unable to construct service URI for auth").b((java.lang.Throwable) e2).c();
        }
    }

    private static java.net.URI a(java.net.URI uri) {
        try {
            return new java.net.URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (java.net.URISyntaxException e2) {
            throw defpackage.dpw.f.a("Unable to construct service URI after removing port").b((java.lang.Throwable) e2).c();
        }
    }

    public static defpackage.dor a(java.util.Map map) {
        defpackage.dor dor = new defpackage.dor();
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                if (str.endsWith("-bin")) {
                    defpackage.doy a = defpackage.doy.a(str, defpackage.dor.a);
                    for (java.lang.String a2 : (java.util.List) map.get(str)) {
                        dor.a(a, (java.lang.Object) defpackage.cwe.a.a((java.lang.CharSequence) a2));
                    }
                } else {
                    defpackage.doy a3 = defpackage.doy.a(str, defpackage.dor.b);
                    for (java.lang.String a4 : (java.util.List) map.get(str)) {
                        dor.a(a3, (java.lang.Object) a4);
                    }
                }
            }
        }
        return dor;
    }

    private static defpackage.dqf a(java.lang.ClassLoader classLoader) {
        try {
            try {
                return new defpackage.dqf(java.lang.Class.forName("com.google.auth.oauth2.ServiceAccountCredentials", false, classLoader), classLoader);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e2) {
                c.logp(java.util.logging.Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", e2);
                return null;
            }
        } catch (java.lang.ClassNotFoundException e3) {
            return null;
        }
    }
}
