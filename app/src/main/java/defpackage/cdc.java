package defpackage;

/* renamed from: cdc reason: default package */
/* compiled from: PG */
public final class cdc extends defpackage.cdm implements defpackage.q {
    public android.content.SharedPreferences a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    private final defpackage.cdl e;
    private final defpackage.cdf f;
    private boolean g;

    public cdc(android.content.Context context, defpackage.cdj cdj) {
        this.e = cdj.a();
        this.f = cdj.b();
        new defpackage.cdd(context, this).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void a() {
        defpackage.cky.b();
        defpackage.cky.b();
        this.e.a((defpackage.cdm) this);
        g();
    }

    public final void f() {
        defpackage.cky.b();
        defpackage.cky.b();
        this.e.b(this);
    }

    public final void a(java.util.List list, java.util.List list2) {
        g();
    }

    public final void h_() {
        g();
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (!this.g && this.a != null) {
            this.b = a(obj);
            this.c = a(obj2);
            this.d = a(obj3);
            this.a.edit().putString("selected_account_id", this.b).putString("first_recent_account_id", this.c).putString("second_recent_account_id", this.d).apply();
        }
    }

    private final java.lang.String a(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return ((defpackage.cdu) obj).b();
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        boolean z;
        boolean z2;
        java.lang.Object obj = null;
        boolean z3 = true;
        if (this.a != null) {
            java.lang.Object a2 = a(this.b);
            java.lang.Object a3 = a(this.c);
            java.lang.Object a4 = a(this.d);
            if (a2 != null) {
                try {
                    this.g = true;
                    defpackage.cdl cdl = this.e;
                    java.lang.String str = "setSelectedAndRecents(). selected is null: %b, first recent is null: %b, second recent is null: %b.";
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = java.lang.Boolean.valueOf(a2 == null);
                    if (a3 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objArr[1] = java.lang.Boolean.valueOf(z);
                    if (a4 == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objArr[2] = java.lang.Boolean.valueOf(z2);
                    java.lang.String.format(str, objArr);
                    if (a2 == null) {
                        a4 = null;
                        a3 = null;
                    }
                    if (a3 != null || a4 == null) {
                        obj = a4;
                        a4 = a3;
                    }
                    if (defpackage.cky.a(a2, cdl.c()) && defpackage.cky.a(a4, cdl.e()) && defpackage.cky.a(obj, cdl.g())) {
                        z3 = false;
                    }
                    if (z3) {
                        cdl.d.clear();
                        if (a2 != null) {
                            defpackage.cky.a(cdl.c.contains(a2), (java.lang.Object) "Selected account must be an available account");
                            cdl.d.add(a2);
                        }
                        if (a4 != null) {
                            defpackage.cky.a(cdl.c.contains(a4), (java.lang.Object) "First recent account must be an available account");
                            cdl.d.add(a4);
                        }
                        if (obj != null) {
                            defpackage.cky.a(cdl.c.contains(obj), (java.lang.Object) "Second recent account must be an available account");
                            cdl.d.add(obj);
                        }
                        cdl.h();
                    }
                } finally {
                    this.g = false;
                }
            }
        }
    }

    private final java.lang.Object a(java.lang.String str) {
        for (java.lang.Object next : this.e.c) {
            if (((defpackage.cdu) next).b().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
