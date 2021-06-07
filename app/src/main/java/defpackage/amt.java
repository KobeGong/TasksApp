package defpackage;

/* renamed from: amt  reason: default package */
/* compiled from: PG */
public final class amt extends alp {
    public static final long serialVersionUID = 1;
    private final String a;
    private final String b;
    private final int c;
    private final String d;

    public amt(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    @Override // defpackage.amn
    public final void b(alv alv) {
        alv.a(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.amn
    public final void a(amb amb) {
        day day;
        dbp dbp = (dbp) amb.a(amb.a(this.a, this.b, this.c, this.d)).b.get(0);
        if (dbp.a == 9) {
            day = (day) dbp.b;
        } else {
            day = day.c;
        }
        day.a.get(0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length()).append("MoveTask(listId, taskId, position): {").append(str).append(", ").append(str2).append(", ").append(this.c).append("}").toString();
    }
}
