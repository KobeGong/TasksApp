package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: doe  reason: default package */
/* compiled from: PG */
public final class doe {
    public final List a;
    public final dmv b;
    private final int c;

    public doe(List list) {
        this(list, dmv.b);
    }

    public doe(List list, dmv dmv) {
        cld.a(!list.isEmpty(), "addrs is empty");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = (dmv) cld.a(dmv, "attrs");
        this.c = this.a.hashCode();
    }

    public doe(SocketAddress socketAddress) {
        this(socketAddress, dmv.b);
    }

    private doe(SocketAddress socketAddress, dmv dmv) {
        this(Collections.singletonList(socketAddress), dmv);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length()).append("[addrs=").append(valueOf).append(", attrs=").append(valueOf2).append("]").toString();
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof doe)) {
            return false;
        }
        doe doe = (doe) obj;
        if (this.a.size() != doe.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (!((SocketAddress) this.a.get(i)).equals(doe.a.get(i))) {
                return false;
            }
        }
        if (this.b.equals(doe.b)) {
            return true;
        }
        return false;
    }
}
