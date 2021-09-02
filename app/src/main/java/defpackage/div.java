package defpackage;

/* renamed from: div reason: default package */
/* compiled from: PG */
final class div implements java.util.Map.Entry {
    public java.util.Map.Entry a;

    div(java.util.Map.Entry entry) {
        this.a = entry;
    }

    public final java.lang.Object getKey() {
        return this.a.getKey();
    }

    public final java.lang.Object getValue() {
        if (((defpackage.diu) this.a.getValue()) == null) {
            return null;
        }
        return defpackage.diu.a();
    }

    public final java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof defpackage.djo)) {
            throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        defpackage.diu diu = (defpackage.diu) this.a.getValue();
        defpackage.djo djo = (defpackage.djo) obj;
        defpackage.djo djo2 = diu.b;
        diu.a = null;
        diu.c = null;
        diu.b = djo;
        return djo2;
    }
}
