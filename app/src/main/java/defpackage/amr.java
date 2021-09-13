package defpackage;

/* renamed from: amr reason: default package */
/* compiled from: PG */
public final class amr implements defpackage.amn {
    public static final long serialVersionUID = 2;
    private final java.lang.String a;
    private final java.lang.String b;
    private transient AbsTaskListStructure c;
    private transient int d;

    public amr(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void b(defpackage.alv alv) {
        this.c = alv.b(this.a);
        this.d = 1;
        if (this.c != null) {
            java.util.Iterator it = this.c.getStructure().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                defpackage.dcf dcf = (defpackage.dcf) it.next();
                if (dcf.b.equals(this.b)) {
                    this.d = dcf.c.size() + this.d;
                    break;
                }
            }
        }
        alv.d(this.a, this.b);
    }

    public final void a(defpackage.amb amb) {
        defpackage.dih dih;
        this.c = null;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii d2 = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(this.b);
        defpackage.dii dii = (defpackage.dii) defpackage.dbb.e.a(defpackage.bg.ao);
        defpackage.dii dii2 = (defpackage.dii) defpackage.dca.g.a(defpackage.bg.ao);
        dii2.b();
        ((defpackage.dca) dii2.a).e = true;
        defpackage.dii e = d2.e(dii.b(dii2).a(defpackage.cqz.a().a(6).a().b()));
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
        amb.a(dboArr);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32 + java.lang.String.valueOf(str2).length()).append("DeleteTask(listId, taskId): {").append(str).append(", ").append(str2).append("}").toString();
    }

    public final boolean a() {
        return true;
    }

    public final java.lang.String a(android.content.Context context) {
        return defpackage.aaz.a(context, 2131951792, "taskCount", java.lang.Integer.valueOf(this.d));
    }

    public final void a(defpackage.alv alv) {
        if (this.d == 0) {
            throw new defpackage.amh();
        }
        alv.a(this.a, this.c);
        this.c = null;
        this.d = 0;
        defpackage.alq.get().a(alv.a, this.a);
    }
}
