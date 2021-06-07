package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: cra  reason: default package */
/* compiled from: PG */
public final class cra {
    public final Map a = new HashMap();
    public boolean b;
    public boolean c = true;

    public final cra a(int i) {
        a(i, cqz.b);
        return this;
    }

    public final cqz a() {
        if (!this.a.isEmpty()) {
            return new cqz(css.a(this.a), this.b);
        }
        if (this.b) {
            return cqz.b;
        }
        return cqz.a;
    }

    public final cra a(int i, cqz cqz) {
        boolean z;
        if (this.b) {
            if (cqz.c.isEmpty()) {
                cqz = cqz.d ? cqz.a : cqz.b;
            } else {
                css css = cqz.c;
                if (!cqz.d) {
                    z = true;
                } else {
                    z = false;
                }
                cqz = new cqz(css, z);
            }
        }
        if (!cqz.a.equals(cqz)) {
            this.a.put(Integer.valueOf(i), cqz);
        } else {
            this.a.remove(Integer.valueOf(i));
        }
        this.c = false;
        return this;
    }
}
