package defpackage;

/* renamed from: crj reason: default package */
/* compiled from: PG */
public class crj extends defpackage.crd {
    public static final long serialVersionUID = 4556936364828217687L;
    private final java.lang.Object a;
    private java.util.Map b;
    private defpackage.crg c;

    protected crj() {
        this(null);
    }

    @java.lang.Deprecated
    public crj(defpackage.crg crg) {
        this.a = new byte[0];
        if (crg != null) {
            a(crg);
        }
    }

    public final void a(java.net.URI uri, java.util.concurrent.Executor executor, defpackage.crf crf) {
        synchronized (this.a) {
            if (d()) {
                super.a(uri, executor, crf);
                return;
            }
            java.util.Map map = (java.util.Map) defpackage.cld.a((java.lang.Object) this.b, (java.lang.Object) "cached requestMetadata");
            crf.a(map);
        }
    }

    public final java.util.Map b() {
        java.util.Map map;
        synchronized (this.a) {
            if (d()) {
                c();
            }
            map = (java.util.Map) defpackage.cld.a((java.lang.Object) this.b, (java.lang.Object) "requestMetadata");
        }
        return map;
    }

    public final void c() {
        synchronized (this.a) {
            this.b = null;
            this.c = null;
            a((defpackage.crg) defpackage.cld.a((java.lang.Object) a(), (java.lang.Object) "new access token"));
        }
    }

    private final void a(defpackage.crg crg) {
        this.c = crg;
        java.lang.String str = "Authorization";
        java.lang.String valueOf = java.lang.String.valueOf("Bearer ");
        java.lang.String valueOf2 = java.lang.String.valueOf(crg.a);
        this.b = java.util.Collections.singletonMap(str, java.util.Collections.singletonList(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf)));
    }

    private final boolean d() {
        return this.b == null;
    }

    public defpackage.crg a() {
        throw new java.lang.IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public int hashCode() {
        return java.util.Objects.hash(new java.lang.Object[]{this.b, this.c});
    }

    public java.lang.String toString() {
        return defpackage.cky.b((java.lang.Object) this).a("requestMetadata", (java.lang.Object) this.b).a("temporaryAccess", (java.lang.Object) this.c).toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.crj)) {
            return false;
        }
        defpackage.crj crj = (defpackage.crj) obj;
        if (!java.util.Objects.equals(this.b, crj.b) || !java.util.Objects.equals(this.c, crj.c)) {
            return false;
        }
        return true;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
