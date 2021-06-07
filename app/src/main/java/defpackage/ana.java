package defpackage;

import java.util.Arrays;

/* renamed from: ana  reason: default package */
/* compiled from: PG */
public final class ana extends alp {
    public static final long serialVersionUID = 1;
    private final String a;
    private final String b;
    private final String c;

    public ana(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        alv.a(this.a, this.b, this.c);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dih dih;
        dbg dbg;
        dbo[] dboArr = new dbo[1];
        dii e = ((dii) dbo.d.a(bg.ao)).d(this.b).e(((dii) dbb.e.a(bg.ao)).b(((dii) dca.g.a(bg.ao)).f(this.c)).a(cqz.a().a(2).a().b()));
        if (e.b) {
            dih = e.a;
        } else {
            dih dih2 = e.a;
            djz.a.a(dih2).c(dih2);
            e.b = true;
            dih = e.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dboArr[0] = (dbo) dih3;
        dbp dbp = (dbp) amb.a(dboArr).b.get(0);
        if (dbp.a == 8) {
            dbg = (dbg) dbp.b;
        } else {
            dbg = dbg.d;
        }
        if (dbg.b != null) {
            dby dby = dbg.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ana)) {
            return false;
        }
        ana ana = (ana) obj;
        return cru.d(this.a, ana.a) && cru.d(this.b, ana.b) && cru.d(this.c, ana.c);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        return new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("UpdateTaskTitle(listId, taskId, title): {").append(str).append(", ").append(str2).append(", ").append(str3).append("}").toString();
    }
}
