package defpackage;

/* renamed from: amt reason: default package */
/* compiled from: PG */
public final class amt extends defpackage.alp {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;
    private final java.lang.String b;
    private final int c;
    private final java.lang.String d;

    public amt(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final void b(defpackage.alv alv) {
        alv.a(this.a, this.b, this.c, this.d);
    }

    public final void a(defpackage.amb amb) {
        defpackage.day day;
        defpackage.dbp dbp = (defpackage.dbp) amb.a(defpackage.amb.a(this.a, this.b, this.c, this.d)).b.get(0);
        if (dbp.a == 9) {
            day = (defpackage.day) dbp.b;
        } else {
            day = defpackage.day.c;
        }
        day.a.get(0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 53 + java.lang.String.valueOf(str2).length()).append("MoveTask(listId, taskId, position): {").append(str).append(", ").append(str2).append(", ").append(this.c).append("}").toString();
    }
}
