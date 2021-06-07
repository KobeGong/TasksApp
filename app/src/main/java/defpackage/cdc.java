package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import java.util.List;

/* renamed from: cdc  reason: default package */
/* compiled from: PG */
public final class cdc extends cdm implements q {
    public SharedPreferences a;
    public String b;
    public String c;
    public String d;
    private final cdl e;
    private final cdf f;
    private boolean g;

    public cdc(Context context, cdj cdj) {
        this.e = cdj.a();
        this.f = cdj.b();
        new cdd(context, this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // defpackage.q
    public final void b() {
    }

    @Override // defpackage.q
    public final void c() {
    }

    @Override // defpackage.q
    public final void d() {
    }

    @Override // defpackage.q
    public final void e() {
    }

    @Override // defpackage.q
    public final void a() {
        cky.b();
        cky.b();
        this.e.a((cdm) this);
        g();
    }

    @Override // defpackage.q
    public final void f() {
        cky.b();
        cky.b();
        this.e.b(this);
    }

    @Override // defpackage.cdm
    public final void a(List list, List list2) {
        g();
    }

    @Override // defpackage.cdm
    public final void h_() {
        g();
    }

    @Override // defpackage.cdm
    public final void a(Object obj, Object obj2, Object obj3) {
        if (!this.g && this.a != null) {
            this.b = a(obj);
            this.c = a(obj2);
            this.d = a(obj3);
            this.a.edit().putString("selected_account_id", this.b).putString("first_recent_account_id", this.c).putString("second_recent_account_id", this.d).apply();
        }
    }

    private final String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return ((cdu) obj).b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void g() {
        boolean z;
        boolean z2;
        Object obj = null;
        boolean z3 = true;
        if (this.a != null) {
            Object a2 = a(this.b);
            Object a3 = a(this.c);
            Object a4 = a(this.d);
            if (a2 != null) {
                try {
                    this.g = true;
                    cdl cdl = this.e;
                    Object[] objArr = new Object[3];
                    objArr[0] = Boolean.valueOf(a2 == null);
                    if (a3 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objArr[1] = Boolean.valueOf(z);
                    if (a4 == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objArr[2] = Boolean.valueOf(z2);
                    String.format("setSelectedAndRecents(). selected is null: %b, first recent is null: %b, second recent is null: %b.", objArr);
                    if (a2 == null) {
                        a4 = null;
                        a3 = null;
                    }
                    if (a3 != null || a4 == null) {
                        obj = a4;
                        a4 = a3;
                    }
                    if (cky.a(a2, cdl.c()) && cky.a(a4, cdl.e()) && cky.a(obj, cdl.g())) {
                        z3 = false;
                    }
                    if (z3) {
                        cdl.d.clear();
                        if (a2 != null) {
                            cky.a(cdl.c.contains(a2), "Selected account must be an available account");
                            cdl.d.add(a2);
                        }
                        if (a4 != null) {
                            cky.a(cdl.c.contains(a4), "First recent account must be an available account");
                            cdl.d.add(a4);
                        }
                        if (obj != null) {
                            cky.a(cdl.c.contains(obj), "Second recent account must be an available account");
                            cdl.d.add(obj);
                        }
                        cdl.h();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            }
        }
    }

    private final Object a(String str) {
        for (Object obj : this.e.c) {
            if (((cdu) obj).b().equals(str)) {
                return obj;
            }
        }
        return null;
    }
}
