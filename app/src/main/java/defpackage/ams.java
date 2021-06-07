package defpackage;

import android.content.Context;
import com.google.android.apps.tasks.R;

/* renamed from: ams  reason: default package */
/* compiled from: PG */
public final class ams implements amn {
    public static final long serialVersionUID = 1;
    private final String a;
    private final boolean b;
    private transient ajq c;
    private transient dcb d;

    ams(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        this.c = alv.b(this.a);
        this.d = alv.a(this.a);
        alv.d(this.a);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dih dih;
        this.d = null;
        this.c = null;
        dbo[] dboArr = new dbo[1];
        dii d2 = ((dii) dbo.d.a(bg.ao)).d(this.a);
        dii dii = (dii) dcd.c.a(bg.ao);
        dii.b();
        ((dcd) dii.a).b = true;
        dii d3 = d2.d(((dii) dbd.e.a(bg.ao)).c(dii).b(cqz.a().a(2).a().b()));
        if (d3.b) {
            dih = d3.a;
        } else {
            dih dih2 = d3.a;
            djz.a.a(dih2).c(dih2);
            d3.b = true;
            dih = d3.a;
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
        return new StringBuilder(String.valueOf(str).length() + 26).append("DeleteTaskList(listId): {").append(str).append("}").toString();
    }

    @Override // defpackage.amn
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.amn
    public final void a(alv alv) {
        if (this.d == null) {
            throw new amh();
        }
        alv.a(this.d);
        alv.a(this.a, this.c);
        this.d = null;
        this.c = null;
        alq.a().a(alv.a);
    }

    @Override // defpackage.amn
    public final String a(Context context) {
        return context.getString(R.string.operation_task_list_deleted);
    }
}
