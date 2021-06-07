package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: amp  reason: default package */
/* compiled from: PG */
public final class amp extends alp {
    public static final long serialVersionUID = 1;
    private transient dcb a;

    public amp(dcb dcb) {
        this.a = dcb;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        alv.a(this.a);
        alv.a(this.a.b, ajq.a(csp.d(), dce.b, auz.a()));
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dcd dcd;
        dih dih;
        dbf dbf;
        dcb dcb = this.a;
        dbo[] dboArr = new dbo[1];
        dii d = ((dii) dbo.d.a(bg.ao)).d(dcb.b);
        dii dii = (dii) dbd.e.a(bg.ao);
        if (dcb.c == null) {
            dcd = dcd.c;
        } else {
            dcd = dcb.c;
        }
        dii.b();
        dbd dbd = (dbd) dii.a;
        if (dcd == null) {
            throw new NullPointerException();
        }
        dbd.c = dcd;
        dii d2 = d.d(dii.b(amb.b));
        if (d2.b) {
            dih = d2.a;
        } else {
            dih dih2 = d2.a;
            djz.a.a(dih2).c(dih2);
            d2.b = true;
            dih = d2.a;
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
            dcb dcb2 = dbf.a;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 25).append("AddTaskList(taskList): {").append(valueOf).append("}").toString();
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(bdk.a(this.a));
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = (dcb) bdk.a((byte[]) objectInputStream.readObject(), dcb.g);
    }
}
