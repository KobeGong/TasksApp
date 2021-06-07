package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: crg  reason: default package */
/* compiled from: PG */
public final class crg implements Serializable {
    public static final long serialVersionUID = -8514239465808977353L;
    public final String a;

    public crg(String str) {
        this.a = str;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null);
    }

    public final String toString() {
        return cky.b(this).a("tokenValue", this.a).a("expirationTimeMillis", (Object) null).toString();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof crg) && Objects.equals(this.a, ((crg) obj).a) && Objects.equals(null, null)) {
            return true;
        }
        return false;
    }
}
