package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.PrivateKey;

/* access modifiers changed from: package-private */
/* renamed from: dqf  reason: default package */
/* compiled from: PG */
public final class dqf {
    private final Class a;
    private final Constructor b;
    private final Method c = this.a.getMethod("getScopes", new Class[0]);
    private final Method d = this.a.getMethod("getClientId", new Class[0]);
    private final Method e = this.a.getMethod("getClientEmail", new Class[0]);
    private final Method f = this.a.getMethod("getPrivateKey", new Class[0]);
    private final Method g = this.a.getMethod("getPrivateKeyId", new Class[0]);

    public dqf(Class cls, ClassLoader classLoader) {
        this.a = cls.asSubclass(crd.class);
        this.b = Class.forName("com.google.auth.oauth2.ServiceAccountJwtAccessCredentials", false, classLoader).asSubclass(crd.class).getConstructor(String.class, String.class, PrivateKey.class, String.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x00a5, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x00a7, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x00ab, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x00ac, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x00b0, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x00b1, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x00b6, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x00b7, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0061, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0062, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0076, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0077, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x007b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x007d, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x007f, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0081, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0083, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0085, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0087, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0089, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x008b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x008d, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x008f, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0091, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0093, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0095, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0097, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0099, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x009b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x009d, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x009f, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x00a1, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x00a3, code lost:
        r6 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x00ab A[ExcHandler: IllegalAccessException (e java.lang.IllegalAccessException), Splitter:B:3:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.crd a(defpackage.crd r9) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqf.a(crd):crd");
    }
}
