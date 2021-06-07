package defpackage;

import java.lang.reflect.Method;

/* renamed from: o  reason: default package */
/* compiled from: PG */
public final class o {
    public final int a;
    public final Method b;

    o(int i, Method method) {
        this.a = i;
        this.b = method;
        this.b.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b.getName().equals(oVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
