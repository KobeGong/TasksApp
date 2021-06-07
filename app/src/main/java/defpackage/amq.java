package defpackage;

/* renamed from: amq  reason: default package */
/* compiled from: PG */
public final class amq extends alp {
    public static final long serialVersionUID = 1;
    private final String a;

    public amq(String str) {
        this.a = str;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        alv.c(this.a);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dih dih;
        String str = this.a;
        dbo[] dboArr = new dbo[1];
        dii dii = (dii) dbo.d.a(bg.ao);
        dii dii2 = (dii) czw.c.a(bg.ao);
        dii2.b();
        czw czw = (czw) dii2.a;
        if (str == null) {
            throw new NullPointerException();
        }
        czw.a = str;
        dii2.b();
        ((czw) dii2.a).b = true;
        dii.b();
        dbo.f((dbo) dii.a, dii2);
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih2 = dii.a;
            djz.a.a(dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dboArr[0] = (dbo) dih3;
        amb.a(dboArr);
    }

    public final String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 32).append("DeleteCompletedTasks(listId): {").append(str).append("}").toString();
    }
}
