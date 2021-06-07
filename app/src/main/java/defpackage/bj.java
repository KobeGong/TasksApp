package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: bj  reason: default package */
/* compiled from: PG */
public final class bj implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean a = false;
    public final List b = new ArrayList();

    bj() {
    }

    public final bj a(bi biVar) {
        String str = biVar.a;
        for (bi biVar2 : this.b) {
            if (str.equals(biVar2.a)) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate keyword: ".concat(valueOf) : new String("Duplicate keyword: "));
            }
        }
        this.b.add(biVar);
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (bi biVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(biVar);
        }
        return sb.toString();
    }
}
