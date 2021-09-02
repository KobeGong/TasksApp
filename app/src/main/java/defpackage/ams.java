package defpackage;

/* renamed from: ams reason: default package */
/* compiled from: PG */
public final class ams implements defpackage.amn {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;
    private final boolean b;
    private transient defpackage.ajq c;
    private transient defpackage.dcb d;

    ams(java.lang.String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final void b(defpackage.alv alv) {
        this.c = alv.b(this.a);
        this.d = alv.a(this.a);
        alv.d(this.a);
    }

    public final void a(defpackage.amb amb) {
        defpackage.dih dih;
        this.d = null;
        this.c = null;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii d2 = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(this.a);
        defpackage.dii dii = (defpackage.dii) defpackage.dbd.e.a(defpackage.bg.ao);
        defpackage.dii dii2 = (defpackage.dii) defpackage.dcd.c.a(defpackage.bg.ao);
        dii2.b();
        ((defpackage.dcd) dii2.a).b = true;
        defpackage.dii d3 = d2.d(dii.c(dii2).b(defpackage.cqz.a().a(2).a().b()));
        if (d3.b) {
            dih = d3.a;
        } else {
            defpackage.dih dih2 = d3.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            d3.b = true;
            dih = d3.a;
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
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 26).append("DeleteTaskList(listId): {").append(str).append("}").toString();
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(defpackage.alv alv) {
        if (this.d == null) {
            throw new defpackage.amh();
        }
        alv.a(this.d);
        alv.a(this.a, this.c);
        this.d = null;
        this.c = null;
        defpackage.alq.a().a(alv.a);
    }

    public final java.lang.String a(android.content.Context context) {
        return context.getString(2131951793);
    }
}
