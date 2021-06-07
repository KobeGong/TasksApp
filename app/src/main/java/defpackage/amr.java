package defpackage;

import android.content.Context;
import com.google.android.apps.tasks.R;
import java.util.Iterator;

/* renamed from: amr  reason: default package */
/* compiled from: PG */
public final class amr implements amn {
    public static final long serialVersionUID = 2;
    private final String a;
    private final String b;
    private transient ajq c;
    private transient int d;

    public amr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        this.c = alv.b(this.a);
        this.d = 1;
        if (this.c != null) {
            Iterator it = this.c.b().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dcf dcf = (dcf) it.next();
                if (dcf.b.equals(this.b)) {
                    this.d = dcf.c.size() + this.d;
                    break;
                }
            }
        }
        alv.d(this.a, this.b);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dih dih;
        this.c = null;
        dbo[] dboArr = new dbo[1];
        dii d2 = ((dii) dbo.d.a(bg.ao)).d(this.b);
        dii dii = (dii) dca.g.a(bg.ao);
        dii.b();
        ((dca) dii.a).e = true;
        dii e = d2.e(((dii) dbb.e.a(bg.ao)).b(dii).a(cqz.a().a(6).a().b()));
        if (e.b) {
            dih = e.a;
        } else {
            dih dih2 = e.a;
            djz.a.a(dih2).c(dih2);
            e.b = true;
            dih = e.a;
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
        String str2 = this.b;
        return new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length()).append("DeleteTask(listId, taskId): {").append(str).append(", ").append(str2).append("}").toString();
    }

    @Override // defpackage.amn
    public final boolean a() {
        return true;
    }

    @Override // defpackage.amn
    public final String a(Context context) {
        return aaz.a(context, (int) R.string.operation_task_deleted, "taskCount", Integer.valueOf(this.d));
    }

    @Override // defpackage.amn
    public final void a(alv alv) {
        if (this.d == 0) {
            throw new amh();
        }
        alv.a(this.a, this.c);
        this.c = null;
        this.d = 0;
        alq.a().a(alv.a, this.a);
    }
}
