package defpackage;

/* renamed from: bj reason: default package */
/* compiled from: PG */
final class bj implements java.io.Serializable {
    public static final long serialVersionUID = 1;
    public boolean a = false;
    public final java.util.List b = new java.util.ArrayList();

    bj() {
    }

    public final defpackage.bj a(defpackage.bi biVar) {
        java.lang.String str = biVar.a;
        for (defpackage.bi biVar2 : this.b) {
            if (str.equals(biVar2.a)) {
                java.lang.String str2 = "Duplicate keyword: ";
                java.lang.String valueOf = java.lang.String.valueOf(str);
                throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
            }
        }
        this.b.add(biVar);
        return this;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (defpackage.bi biVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(biVar);
        }
        return sb.toString();
    }
}
