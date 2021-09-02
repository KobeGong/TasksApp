package defpackage;

/* renamed from: amz reason: default package */
/* compiled from: PG */
public final class amz implements defpackage.amn {
    public static final long serialVersionUID = 1;
    private final java.lang.String a;
    private final java.lang.String[] b;
    private final boolean c;
    private transient defpackage.ajq d;
    private transient int e;

    public amz(java.lang.String str, boolean z, java.lang.String... strArr) {
        this.a = str;
        this.b = strArr;
        this.c = z;
    }

    public final void b(defpackage.alv alv) {
        this.d = alv.b(this.a);
        this.e = this.b.length;
        for (int length = this.b.length - 1; length >= 0; length--) {
            alv.a(this.a, this.b[length], this.c);
        }
    }

    public final void a(defpackage.amb amb) {
        defpackage.dbg dbg;
        defpackage.dih dih;
        java.lang.String str = this.a;
        boolean z = this.c;
        java.lang.String[] strArr = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int length = strArr.length - 1; length >= 0; length--) {
            defpackage.dii e2 = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(strArr[length]).e(((defpackage.dii) defpackage.dbb.e.a(defpackage.bg.ao)).b(((defpackage.dii) defpackage.dca.g.a(defpackage.bg.ao)).a(z)).a(defpackage.cqz.a().a(1).a().b()));
            if (e2.b) {
                dih = e2.a;
            } else {
                defpackage.dih dih2 = e2.a;
                defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                e2.b = true;
                dih = e2.a;
            }
            defpackage.dih dih3 = dih;
            if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            arrayList.add((defpackage.dbo) dih3);
            if (!z) {
                arrayList.add(defpackage.amb.a(str, strArr[length], 0, null));
            }
        }
        defpackage.dbp dbp = (defpackage.dbp) amb.a((defpackage.dbo[]) arrayList.toArray(new defpackage.dbo[0])).b.get(0);
        if (dbp.a == 8) {
            dbg = (defpackage.dbg) dbp.b;
        } else {
            dbg = defpackage.dbg.d;
        }
        if (dbg.b != null) {
            defpackage.dby dby = dbg.b;
        }
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.b)), java.lang.Boolean.valueOf(this.c)});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.amz)) {
            return false;
        }
        defpackage.amz amz = (defpackage.amz) obj;
        if (!defpackage.cru.d(this.a, amz.a) || !java.util.Arrays.equals(this.b, amz.b) || !defpackage.cru.d(java.lang.Boolean.valueOf(this.c), java.lang.Boolean.valueOf(amz.c))) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        boolean z = this.c;
        java.lang.String join = android.text.TextUtils.join(", ", this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 56 + java.lang.String.valueOf(join).length()).append("UpdateTaskStatus(listId, status, taskId...): {").append(str).append(", ").append(z).append(", ").append(join).append("}").toString();
    }

    public final boolean a() {
        return this.b.length > 1;
    }

    public final void a(defpackage.alv alv) {
        if (this.e == 0) {
            throw new defpackage.amh();
        }
        alv.a(this.a, this.d);
        this.d = null;
        this.e = 0;
        defpackage.alq.a().a(alv.a, this.a);
    }

    public final java.lang.String a(android.content.Context context) {
        return defpackage.aaz.a(context, this.c ? 2131951791 : 2131951796, "taskCount", java.lang.Integer.valueOf(this.e));
    }
}
