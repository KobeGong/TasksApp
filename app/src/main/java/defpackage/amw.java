package defpackage;

import android.content.Context;
import com.google.android.apps.tasks.R;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/* renamed from: amw  reason: default package */
/* compiled from: PG */
public final class amw implements amn {
    public static final long serialVersionUID = 1;
    private final String a;
    private final String b;
    private transient dmk c;
    private amx d;
    private transient ajq e;
    private transient int f;

    public amw(String str, String str2, dmk dmk, amx amx) {
        this.a = str;
        this.b = str2;
        this.c = dmk;
        this.d = amx;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        this.e = alv.b(this.a);
        this.f = 1;
        alv.a(this.a, this.b, this.c);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dih dih;
        dbg dbg;
        String str = this.b;
        dmk dmk = this.c;
        dbo[] dboArr = new dbo[1];
        dii dii = (dii) dca.g.a(bg.ao);
        if (dmk == null) {
            dii.g();
        } else {
            dii.a(dmk);
        }
        dii e2 = ((dii) dbo.d.a(bg.ao)).d(str).e(((dii) dbb.e.a(bg.ao)).b(dii).a(cqz.a().a(4).a().b()));
        if (e2.b) {
            dih = e2.a;
        } else {
            dih dih2 = e2.a;
            djz.a.a(dih2).c(dih2);
            e2.b = true;
            dih = e2.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dboArr[0] = (dbo) dih3;
        dbp dbp = (dbp) amb.a(dboArr).b.get(0);
        if (dbp.a == 8) {
            dbg = (dbg) dbp.b;
        } else {
            dbg = dbg.d;
        }
        if (dbg.b != null) {
            dby dby = dbg.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amw)) {
            return false;
        }
        amw amw = (amw) obj;
        return cru.d(this.a, amw.a) && cru.d(this.b, amw.b) && cru.d(this.c, amw.c) && cru.d(this.d, amw.d);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        return new StringBuilder(String.valueOf(str).length() + 60 + String.valueOf(str2).length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append("UpdateTaskDueDate(listId, taskId, dueDate, flavor): {").append(str).append(", ").append(str2).append(", ").append(valueOf).append(", ").append(valueOf2).append("}").toString();
    }

    @Override // defpackage.amn
    public final boolean a() {
        return this.d == amx.SNOOZE;
    }

    @Override // defpackage.amn
    public final void a(alv alv) {
        if (this.f == 0) {
            throw new amh();
        }
        alv.a(this.a, this.e);
        this.e = null;
        this.f = 0;
        alq.a().a(alv.a, this.a);
    }

    @Override // defpackage.amn
    public final String a(Context context) {
        if (this.c == null) {
            return context.getString(R.string.operation_due_date_cleared);
        }
        if (this.d != amx.SNOOZE) {
            return context.getString(R.string.operation_due_date_updated);
        }
        return context.getString(R.string.snooze_confirm, ajd.a(context, ajd.b(this.c)));
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(bdk.a(this.c));
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (dmk) bdk.a((byte[]) objectInputStream.readObject(), dmk.d);
    }
}
