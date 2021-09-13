package defpackage;

/* renamed from: ana reason: default package */
/* compiled from: PG */
public final class ana extends defpackage.alp {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;

    public ana(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void b(defpackage.alv alv) {
        alv.a(this.a, this.b, this.c);
    }

    public final void a(defpackage.amb amb) {
        defpackage.dih dih;
        defpackage.dbg dbg;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii e = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(this.b).e(((defpackage.dii) defpackage.dbb.e.a(defpackage.bg.ao)).b(((defpackage.dii) defpackage.dca.g.a(defpackage.bg.ao)).setTitle(this.c)).a(defpackage.cqz.a().a(2).a().b()));
        if (e.b) {
            dih = e.a;
        } else {
            defpackage.dih dih2 = e.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            e.b = true;
            dih = e.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dboArr[0] = (defpackage.dbo) dih3;
        defpackage.dbp dbp = (defpackage.dbp) amb.a(dboArr).b.get(0);
        if (dbp.a == 8) {
            dbg = (defpackage.dbg) dbp.b;
        } else {
            dbg = defpackage.dbg.d;
        }
        if (dbg.b != null) {
            defpackage.dby dby = dbg.b;
        }
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ana)) {
            return false;
        }
        defpackage.ana ana = (defpackage.ana) obj;
        if (!defpackage.cru.equals(this.a, ana.a) || !defpackage.cru.equals(this.b, ana.b) || !defpackage.cru.equals(this.c, ana.c)) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 46 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length()).append("UpdateTaskTitle(listId, taskId, title): {").append(str).append(", ").append(str2).append(", ").append(str3).append("}").toString();
    }
}
