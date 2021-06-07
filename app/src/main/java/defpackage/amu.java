package defpackage;

import android.content.Context;
import com.google.android.apps.tasks.R;
import java.util.Map;

/* renamed from: amu  reason: default package */
/* compiled from: PG */
public final class amu implements amn {
    public static final long serialVersionUID = 1;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Map e;
    private transient ajq f;
    private transient int g;
    private final transient boolean h;

    public amu(String str, String str2, String str3, String str4, Map map, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = css.a(map);
        this.h = z;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        this.f = alv.b(this.a);
        this.g = (this.e == null ? 0 : this.e.size()) + 1;
        alv.a(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        dih dih;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        Map map = this.e;
        dbo[] dboArr = new dbo[1];
        dii a2 = ((dii) daw.h.a(bg.ao)).c(str).a(0);
        a2.b();
        daw daw = (daw) a2.a;
        if (str3 == null) {
            throw new NullPointerException();
        }
        daw.c = str3;
        a2.b();
        daw daw2 = (daw) a2.a;
        if (str4 == null) {
            throw new NullPointerException();
        }
        daw2.f = str4;
        a2.b();
        daw daw3 = (daw) a2.a;
        if (!daw3.g.a) {
            daw3.g = daw3.g.a();
        }
        daw3.g.putAll(map);
        dii f2 = ((dii) dbo.d.a(bg.ao)).d(str2).f(a2);
        if (f2.b) {
            dih = f2.a;
        } else {
            dih dih2 = f2.a;
            djz.a.a(dih2).c(dih2);
            f2.b = true;
            dih = f2.a;
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
        String str3 = this.c;
        String str4 = this.d;
        String valueOf = String.valueOf(this.e);
        return new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(valueOf).length()).append("MoveTaskToList(listId, taskId, toListId, newTaskId, subtaskIdMap): {").append(str).append(", ").append(str2).append(", ").append(str3).append(", ").append(str4).append(", ").append(valueOf).append("}").toString();
    }

    @Override // defpackage.amn
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.amn
    public final void a(alv alv) {
        if (this.g == 0) {
            throw new IllegalStateException("Cannot undo before operation is applied locally");
        }
        alv.d(this.c, this.d);
        alv.a(this.a, this.f);
        alq.a().a(alv.a, this.c);
        alq.a().a(alv.a, this.a);
    }

    @Override // defpackage.amn
    public final String a(Context context) {
        return aaz.a(context, (int) R.string.operation_task_moved, "taskCount", Integer.valueOf(this.g));
    }
}
