package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: amz  reason: default package */
/* compiled from: PG */
public final class amz implements amn {
    public static final long serialVersionUID = 1;
    private final String a;
    private final String[] b;
    private final boolean c;
    private transient ajq d;
    private transient int e;

    public amz(String str, boolean z, String... strArr) {
        this.a = str;
        this.b = strArr;
        this.c = z;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        this.d = alv.b(this.a);
        this.e = this.b.length;
        for (int length = this.b.length - 1; length >= 0; length--) {
            alv.a(this.a, this.b[length], this.c);
        }
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dbg dbg;
        dih dih;
        String str = this.a;
        boolean z = this.c;
        String[] strArr = this.b;
        ArrayList arrayList = new ArrayList();
        for (int length = strArr.length - 1; length >= 0; length--) {
            dii e2 = ((dii) dbo.d.a(bg.ao)).d(strArr[length]).e(((dii) dbb.e.a(bg.ao)).b(((dii) dca.g.a(bg.ao)).a(z)).a(cqz.a().a(1).a().b()));
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
            arrayList.add((dbo) dih3);
            if (!z) {
                arrayList.add(amb.a(str, strArr[length], 0, null));
            }
        }
        dbp dbp = (dbp) amb.a((dbo[]) arrayList.toArray(new dbo[0])).b.get(0);
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
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Boolean.valueOf(this.c)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amz)) {
            return false;
        }
        amz amz = (amz) obj;
        return cru.d(this.a, amz.a) && Arrays.equals(this.b, amz.b) && cru.d(Boolean.valueOf(this.c), Boolean.valueOf(amz.c));
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.c;
        String join = TextUtils.join(", ", this.b);
        return new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(join).length()).append("UpdateTaskStatus(listId, status, taskId...): {").append(str).append(", ").append(z).append(", ").append(join).append("}").toString();
    }

    @Override // defpackage.amn
    public final boolean a() {
        return this.b.length > 1;
    }

    @Override // defpackage.amn
    public final void a(alv alv) {
        if (this.e == 0) {
            throw new amh();
        }
        alv.a(this.a, this.d);
        this.d = null;
        this.e = 0;
        alq.a().a(alv.a, this.a);
    }

    @Override // defpackage.amn
    public final String a(Context context) {
        return aaz.a(context, this.c ? R.string.operation_task_completed : R.string.operation_task_opened, "taskCount", Integer.valueOf(this.e));
    }
}
