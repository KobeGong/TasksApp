package defpackage;

import java.io.ObjectInputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: crj  reason: default package */
/* compiled from: PG */
public class crj extends crd {
    public static final long serialVersionUID = 4556936364828217687L;
    private final Object a;
    private Map b;
    private crg c;

    protected crj() {
        this(null);
    }

    @Deprecated
    public crj(crg crg) {
        this.a = new byte[0];
        if (crg != null) {
            a(crg);
        }
    }

    @Override // defpackage.crd
    public final void a(URI uri, Executor executor, crf crf) {
        synchronized (this.a) {
            if (d()) {
                super.a(uri, executor, crf);
                return;
            }
            crf.a((Map) cld.a(this.b, "cached requestMetadata"));
        }
    }

    @Override // defpackage.crd
    public final Map b() {
        Map map;
        synchronized (this.a) {
            if (d()) {
                c();
            }
            map = (Map) cld.a(this.b, "requestMetadata");
        }
        return map;
    }

    public final void c() {
        synchronized (this.a) {
            this.b = null;
            this.c = null;
            a((crg) cld.a(a(), "new access token"));
        }
    }

    private final void a(crg crg) {
        this.c = crg;
        String valueOf = String.valueOf("Bearer ");
        String valueOf2 = String.valueOf(crg.a);
        this.b = Collections.singletonMap("Authorization", Collections.singletonList(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
    }

    private final boolean d() {
        return this.b == null;
    }

    public crg a() {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    public String toString() {
        return cky.b(this).a("requestMetadata", this.b).a("temporaryAccess", this.c).toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof crj)) {
            return false;
        }
        crj crj = (crj) obj;
        if (!Objects.equals(this.b, crj.b) || !Objects.equals(this.c, crj.c)) {
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
