package defpackage;

/* renamed from: amp reason: default package */
/* compiled from: PG */
public final class amp extends defpackage.alp {
    public static final long serialVersionUID = 1;
    private transient defpackage.dcb a;

    public amp(defpackage.dcb dcb) {
        this.a = dcb;
    }

    public final void b(defpackage.alv alv) {
        alv.a(this.a);
        alv.a(this.a.b, AbsTaskListStructure.a(defpackage.csp.d(), defpackage.dce.b, defpackage.auz.a()));
    }

    public final void a(defpackage.amb amb) {
        defpackage.dcd dcd;
        defpackage.dih dih;
        defpackage.dbf dbf;
        defpackage.dcb dcb = this.a;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii d = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(dcb.b);
        defpackage.dii dii = (defpackage.dii) defpackage.dbd.e.a(defpackage.bg.ao);
        if (dcb.c == null) {
            dcd = defpackage.dcd.c;
        } else {
            dcd = dcb.c;
        }
        dii.b();
        defpackage.dbd dbd = (defpackage.dbd) dii.a;
        if (dcd == null) {
            throw new java.lang.NullPointerException();
        }
        dbd.c = dcd;
        defpackage.dii d2 = d.d(dii.b(defpackage.amb.b));
        if (d2.b) {
            dih = d2.a;
        } else {
            defpackage.dih dih2 = d2.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            d2.b = true;
            dih = d2.a;
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
            defpackage.dcb dcb2 = dbf.a;
        }
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 25).append("AddTaskList(taskList): {").append(valueOf).append("}").toString();
    }

    private final void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(defpackage.bdk.a((defpackage.dih) this.a));
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = (defpackage.dcb) defpackage.bdk.a((byte[]) objectInputStream.readObject(), (defpackage.dih) defpackage.dcb.g);
    }
}
