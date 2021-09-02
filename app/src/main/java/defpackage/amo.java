package defpackage;

/* renamed from: amo reason: default package */
/* compiled from: PG */
public final class amo extends defpackage.alp {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;
    private final int b;
    private final java.lang.String c;
    private transient defpackage.dby d;

    public amo(java.lang.String str, defpackage.dby dby, int i, java.lang.String str2) {
        this.a = str;
        this.d = dby;
        this.b = i;
        this.c = str2;
    }

    public final void b(defpackage.alv alv) {
        alv.a(this.a, this.d, this.b, this.c);
    }

    public final void a(defpackage.amb amb) {
        defpackage.dca dca;
        defpackage.dih dih;
        defpackage.czv czv;
        java.lang.String str = this.a;
        defpackage.dby dby = this.d;
        int i = this.b;
        java.lang.String str2 = this.c;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii dii = (defpackage.dii) defpackage.czu.f.a(defpackage.bg.ao);
        dii.b();
        defpackage.czu czu = (defpackage.czu) dii.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        czu.c = str;
        dii.b();
        ((defpackage.czu) dii.a).e = i;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        dii.b();
        defpackage.czu czu2 = (defpackage.czu) dii.a;
        if (dca == null) {
            throw new java.lang.NullPointerException();
        }
        czu2.b = dca;
        defpackage.crb crb = defpackage.amb.a;
        dii.b();
        defpackage.czu czu3 = (defpackage.czu) dii.a;
        if (crb == null) {
            throw new java.lang.NullPointerException();
        }
        czu3.a = crb;
        if (!android.text.TextUtils.isEmpty(str2)) {
            dii.b();
            defpackage.czu czu4 = (defpackage.czu) dii.a;
            if (str2 == null) {
                throw new java.lang.NullPointerException();
            }
            czu4.d = str2;
        }
        defpackage.dii d2 = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(dby.d);
        d2.b();
        defpackage.dbo.c((defpackage.dbo) d2.a, dii);
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
        if (dbp.a == 5) {
            czv = (defpackage.czv) dbp.b;
        } else {
            czv = defpackage.czv.c;
        }
        if (czv.a != null) {
            defpackage.dby dby2 = czv.a;
        }
    }

    public final java.lang.String toString() {
        java.lang.String join = android.text.TextUtils.join(", ", defpackage.csp.a(this.a, this.d, java.lang.Integer.valueOf(this.b), this.c != null ? this.c : "null"));
        return new java.lang.StringBuilder(java.lang.String.valueOf(join).length() + 49).append("AddTask(listId, task, position, parentTaskId): {").append(join).append("}").toString();
    }

    private final void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(defpackage.bdk.a((defpackage.dih) this.d));
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = (defpackage.dby) defpackage.bdk.a((byte[]) objectInputStream.readObject(), (defpackage.dih) defpackage.dby.g);
    }
}
