package defpackage;

/* renamed from: amq reason: default package */
/* compiled from: PG */
public final class amq extends defpackage.alp {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;

    public amq(java.lang.String str) {
        this.a = str;
    }

    public final void b(defpackage.alv alv) {
        alv.c(this.a);
    }

    public final void a(defpackage.amb amb) {
        defpackage.dih dih;
        java.lang.String str = this.a;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii dii = (defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao);
        defpackage.dii dii2 = (defpackage.dii) defpackage.czw.c.a(defpackage.bg.ao);
        dii2.b();
        defpackage.czw czw = (defpackage.czw) dii2.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        czw.a = str;
        dii2.b();
        ((defpackage.czw) dii2.a).b = true;
        dii.b();
        defpackage.dbo.f((defpackage.dbo) dii.a, dii2);
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih2 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dboArr[0] = (defpackage.dbo) dih3;
        amb.a(dboArr);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32).append("DeleteCompletedTasks(listId): {").append(str).append("}").toString();
    }
}
