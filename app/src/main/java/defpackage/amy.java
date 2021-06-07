package defpackage;

import java.util.Arrays;

/* renamed from: amy  reason: default package */
/* compiled from: PG */
public final class amy extends alp {
    public static final long serialVersionUID = 1;
    private final String a;
    private final String b;

    public amy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        alv.e(this.a, this.b);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dih dih;
        dbf dbf;
        dbo[] dboArr = new dbo[1];
        dii d = ((dii) dbo.d.a(bg.ao)).d(this.a).d(((dii) dbd.e.a(bg.ao)).c(((dii) dcd.c.a(bg.ao)).h(this.b)).b(cqz.a().a(1).a().b()));
        if (d.b) {
            dih = d.a;
        } else {
            dih dih2 = d.a;
            djz.a.a(dih2).c(dih2);
            d.b = true;
            dih = d.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dboArr[0] = (dbo) dih3;
        dbp dbp = (dbp) amb.a(dboArr).b.get(0);
        if (dbp.a == 4) {
            dbf = (dbf) dbp.b;
        } else {
            dbf = dbf.b;
        }
        if (dbf.a != null) {
            dcb dcb = dbf.a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amy)) {
            return false;
        }
        amy amy = (amy) obj;
        return cru.d(this.a, amy.a) && cru.d(this.b, amy.b);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(str2).length()).append("UpdateTaskListTitle(listId, title): {").append(str).append(", ").append(str2).append("}").toString();
    }
}
