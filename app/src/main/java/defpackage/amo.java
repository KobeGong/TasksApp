package defpackage;

import android.text.TextUtils;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: amo  reason: default package */
/* compiled from: PG */
public final class amo extends alp {
    public static final long serialVersionUID = 1;
    private final String a;
    private final int b;
    private final String c;
    private transient dby d;

    public amo(String str, dby dby, int i, String str2) {
        this.a = str;
        this.d = dby;
        this.b = i;
        this.c = str2;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        alv.a(this.a, this.d, this.b, this.c);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dca dca;
        dih dih;
        czv czv;
        String str = this.a;
        dby dby = this.d;
        int i = this.b;
        String str2 = this.c;
        dbo[] dboArr = new dbo[1];
        dii dii = (dii) czu.f.a(bg.ao);
        dii.b();
        czu czu = (czu) dii.a;
        if (str == null) {
            throw new NullPointerException();
        }
        czu.c = str;
        dii.b();
        ((czu) dii.a).e = i;
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        dii.b();
        czu czu2 = (czu) dii.a;
        if (dca == null) {
            throw new NullPointerException();
        }
        czu2.b = dca;
        crb crb = amb.a;
        dii.b();
        czu czu3 = (czu) dii.a;
        if (crb == null) {
            throw new NullPointerException();
        }
        czu3.a = crb;
        if (!TextUtils.isEmpty(str2)) {
            dii.b();
            czu czu4 = (czu) dii.a;
            if (str2 == null) {
                throw new NullPointerException();
            }
            czu4.d = str2;
        }
        dii d2 = ((dii) dbo.d.a(bg.ao)).d(dby.d);
        d2.b();
        dbo.c((dbo) d2.a, dii);
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
        if (dbp.a == 5) {
            czv = (czv) dbp.b;
        } else {
            czv = czv.c;
        }
        if (czv.a != null) {
            dby dby2 = czv.a;
        }
    }

    public final String toString() {
        String join = TextUtils.join(", ", csp.a(this.a, this.d, Integer.valueOf(this.b), this.c != null ? this.c : "null"));
        return new StringBuilder(String.valueOf(join).length() + 49).append("AddTask(listId, task, position, parentTaskId): {").append(join).append("}").toString();
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(bdk.a(this.d));
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = (dby) bdk.a((byte[]) objectInputStream.readObject(), dby.g);
    }
}
