package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dqe  reason: default package */
/* compiled from: PG */
public final class dqe implements dmy {
    public static final Logger c = Logger.getLogger(dqe.class.getName());
    private static final dqf f = a(dqe.class.getClassLoader());
    public dor d;
    public Map e;
    private final crd g;

    public dqe(crd crd) {
        this(crd, f);
    }

    private dqe(crd crd, dqf dqf) {
        cld.a(crd, "creds");
        this.g = dqf != null ? dqf.a(crd) : crd;
    }

    @Override // defpackage.dmy
    public final void a(dpb dpb, dmv dmv, Executor executor, dmz dmz) {
        try {
            this.g.a(a((String) cld.a((String) dmv.a(b), "authority"), dpb), executor, new crf(this, dmz));
        } catch (dqa e2) {
            dmz.a(e2.a);
        }
    }

    private static URI a(String str, dpb dpb) {
        if (str == null) {
            throw dpw.f.a("Channel has no authority").c();
        }
        String valueOf = String.valueOf(dpb.a(dpb.b));
        try {
            URI uri = new URI("https", str, valueOf.length() != 0 ? "/".concat(valueOf) : new String("/"), null, null);
            if (uri.getPort() == 443) {
                return a(uri);
            }
            return uri;
        } catch (URISyntaxException e2) {
            throw dpw.f.a("Unable to construct service URI for auth").b(e2).c();
        }
    }

    private static URI a(URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e2) {
            throw dpw.f.a("Unable to construct service URI after removing port").b(e2).c();
        }
    }

    public static dor a(Map map) {
        dor dor = new dor();
        if (map != null) {
            for (String str : map.keySet()) {
                if (str.endsWith("-bin")) {
                    doy a = doy.a(str, dor.a);
                    for (String str2 : (List) map.get(str)) {
                        dor.a(a, cwe.a.a(str2));
                    }
                } else {
                    doy a2 = doy.a(str, dor.b);
                    for (String str3 : (List) map.get(str)) {
                        dor.a(a2, str3);
                    }
                }
            }
        }
        return dor;
    }

    private static dqf a(ClassLoader classLoader) {
        try {
            try {
                return new dqf(Class.forName("com.google.auth.oauth2.ServiceAccountCredentials", false, classLoader), classLoader);
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                c.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", e2);
                return null;
            }
        } catch (ClassNotFoundException e3) {
            return null;
        }
    }
}
