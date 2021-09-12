package defpackage;

/* renamed from: amu reason: default package */
/* compiled from: PG */
public final class amu implements defpackage.amn {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.util.Map e;
    private transient AbsTaskListStructure f;
    private transient int g;
    private final transient boolean h;

    public amu(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = defpackage.css.a(map);
        this.h = z;
    }

    public final void b(defpackage.alv alv) {
        this.f = alv.b(this.a);
        this.g = (this.e == null ? 0 : this.e.size()) + 1;
        alv.a(this.a, this.b, this.c, this.d, this.e);
    }

    public final void a(defpackage.amb amb) {
        defpackage.dih dih;
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        java.lang.String str4 = this.d;
        java.util.Map map = this.e;
        defpackage.dbo[] dboArr = new defpackage.dbo[1];
        defpackage.dii a2 = ((defpackage.dii) defpackage.daw.h.a(defpackage.bg.ao)).c(str).a(0);
        a2.b();
        defpackage.daw daw = (defpackage.daw) a2.a;
        if (str3 == null) {
            throw new java.lang.NullPointerException();
        }
        daw.c = str3;
        a2.b();
        defpackage.daw daw2 = (defpackage.daw) a2.a;
        if (str4 == null) {
            throw new java.lang.NullPointerException();
        }
        daw2.f = str4;
        a2.b();
        defpackage.daw daw3 = (defpackage.daw) a2.a;
        if (!daw3.g.a) {
            daw3.g = daw3.g.a();
        }
        daw3.g.putAll(map);
        defpackage.dii f2 = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(str2).f(a2);
        if (f2.b) {
            dih = f2.a;
        } else {
            defpackage.dih dih2 = f2.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            f2.b = true;
            dih = f2.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dboArr[0] = (defpackage.dbo) dih3;
        amb.a(dboArr);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        java.lang.String str4 = this.d;
        java.lang.String valueOf = java.lang.String.valueOf(this.e);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 77 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length() + java.lang.String.valueOf(str4).length() + java.lang.String.valueOf(valueOf).length()).append("MoveTaskToList(listId, taskId, toListId, newTaskId, subtaskIdMap): {").append(str).append(", ").append(str2).append(", ").append(str3).append(", ").append(str4).append(", ").append(valueOf).append("}").toString();
    }

    public final boolean a() {
        return this.h;
    }

    public final void a(defpackage.alv alv) {
        if (this.g == 0) {
            throw new java.lang.IllegalStateException("Cannot undo before operation is applied locally");
        }
        alv.d(this.c, this.d);
        alv.a(this.a, this.f);
        defpackage.alq.a().a(alv.a, this.c);
        defpackage.alq.a().a(alv.a, this.a);
    }

    public final java.lang.String a(android.content.Context context) {
        return defpackage.aaz.a(context, 2131951794, "taskCount", java.lang.Integer.valueOf(this.g));
    }
}
