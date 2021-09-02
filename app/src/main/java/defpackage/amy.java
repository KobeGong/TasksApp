package defpackage;

/* renamed from: amy reason: default package */
/* compiled from: PG */
public final class amy extends defpackage.alp {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;
    private final java.lang.String b;

    public amy(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void b(defpackage.alv alv) {
        alv.e(this.a, this.b);
    }

    public final void a(defpackage.amb amb) {
        defpackage.dih dih;
        defpackage.dbf dbf;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii d = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(this.a).d(((defpackage.dii) defpackage.dbd.e.a(defpackage.bg.ao)).c(((defpackage.dii) defpackage.dcd.c.a(defpackage.bg.ao)).h(this.b)).b(defpackage.cqz.a().a(1).a().b()));
        if (d.b) {
            dih = d.a;
        } else {
            defpackage.dih dih2 = d.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            d.b = true;
            dih = d.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dboArr[0] = (defpackage.dbo) dih3;
        defpackage.dbp dbp = (defpackage.dbp) amb.a(dboArr).b.get(0);
        if (dbp.a == 4) {
            dbf = (defpackage.dbf) dbp.b;
        } else {
            dbf = defpackage.dbf.b;
        }
        if (dbf.a != null) {
            defpackage.dcb dcb = dbf.a;
        }
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.amy)) {
            return false;
        }
        defpackage.amy amy = (defpackage.amy) obj;
        if (!defpackage.cru.d(this.a, amy.a) || !defpackage.cru.d(this.b, amy.b)) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(str2).length()).append("UpdateTaskListTitle(listId, title): {").append(str).append(", ").append(str2).append("}").toString();
    }
}
