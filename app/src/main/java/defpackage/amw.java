package defpackage;

/* renamed from: amw reason: default package */
/* compiled from: PG */
public final class amw implements defpackage.amn {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;
    private final java.lang.String b;
    private transient defpackage.dmk c;
    private defpackage.amx d;
    private transient AbsTaskListStructure e;
    private transient int f;

    public amw(java.lang.String str, java.lang.String str2, defpackage.dmk dmk, defpackage.amx amx) {
        this.a = str;
        this.b = str2;
        this.c = dmk;
        this.d = amx;
    }

    public final void b(defpackage.alv alv) {
        this.e = alv.b(this.a);
        this.f = 1;
        alv.a(this.a, this.b, this.c);
    }

    public final void a(defpackage.amb amb) {
        defpackage.dih dih;
        defpackage.dbg dbg;
        java.lang.String str = this.b;
        defpackage.dmk dmk = this.c;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii dii = (defpackage.dii) defpackage.dca.g.a(defpackage.bg.ao);
        if (dmk == null) {
            dii.g();
        } else {
            dii.a(dmk);
        }
        defpackage.dii e2 = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(str).e(((defpackage.dii) defpackage.dbb.e.a(defpackage.bg.ao)).b(dii).a(defpackage.cqz.a().a(4).a().b()));
        if (e2.b) {
            dih = e2.a;
        } else {
            defpackage.dih dih2 = e2.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            e2.b = true;
            dih = e2.a;
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
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, this.c, this.d});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.amw)) {
            return false;
        }
        defpackage.amw amw = (defpackage.amw) obj;
        if (!defpackage.cru.d(this.a, amw.a) || !defpackage.cru.d(this.b, amw.b) || !defpackage.cru.d(this.c, amw.c) || !defpackage.cru.d(this.d, amw.d)) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.lang.String valueOf = java.lang.String.valueOf(this.c);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.d);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 60 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(valueOf).length() + java.lang.String.valueOf(valueOf2).length()).append("UpdateTaskDueDate(listId, taskId, dueDate, flavor): {").append(str).append(", ").append(str2).append(", ").append(valueOf).append(", ").append(valueOf2).append("}").toString();
    }

    public final boolean a() {
        return this.d == defpackage.amx.SNOOZE;
    }

    public final void a(defpackage.alv alv) {
        if (this.f == 0) {
            throw new defpackage.amh();
        }
        alv.a(this.a, this.e);
        this.e = null;
        this.f = 0;
        defpackage.alq.a().a(alv.a, this.a);
    }

    public final java.lang.String a(android.content.Context context) {
        if (this.c == null) {
            return context.getString(2131951788);
        }
        if (this.d != defpackage.amx.SNOOZE) {
            return context.getString(2131951789);
        }
        return context.getString(2131951811, new java.lang.Object[]{defpackage.ajd.a(context, defpackage.ajd.b(this.c))});
    }

    private final void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(defpackage.bdk.a((defpackage.dih) this.c));
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (defpackage.dmk) defpackage.bdk.a((byte[]) objectInputStream.readObject(), (defpackage.dih) defpackage.dmk.d);
    }
}
