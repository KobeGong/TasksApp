package defpackage;

/* renamed from: o reason: default package */
/* compiled from: PG */
public final class o {
    public final int a;
    public final java.lang.reflect.Method b;

    o(int i, java.lang.reflect.Method method) {
        this.a = i;
        this.b = method;
        this.b.setAccessible(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.o oVar = (defpackage.o) obj;
        if (this.a != oVar.a || !this.b.getName().equals(oVar.b.getName())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
