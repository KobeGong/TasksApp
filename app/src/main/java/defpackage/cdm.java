package defpackage;

/* renamed from: cdm reason: default package */
/* compiled from: PG */
public class cdm {
    public void a(java.util.List list, java.util.List list2) {
    }

    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
    }

    public void h_() {
    }

    public static java.lang.String a(java.lang.Object obj, defpackage.cdf cdf) {
        java.lang.String a = a((java.lang.CharSequence) ((defpackage.cdu) obj).a());
        java.lang.String a2 = a((java.lang.CharSequence) ((defpackage.cdu) obj).b());
        if (a.isEmpty() && a2.isEmpty()) {
            return ((defpackage.cdu) obj).b();
        }
        if (a.isEmpty()) {
            return a2;
        }
        if (a2.isEmpty()) {
            return a;
        }
        if (a.equals(a2)) {
            return a;
        }
        return new java.lang.StringBuilder(java.lang.String.valueOf(a).length() + 1 + java.lang.String.valueOf(a2).length()).append(a).append(" ").append(a2).toString();
    }

    private static java.lang.String a(java.lang.CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public static android.app.Activity a(android.content.Context context) {
        java.lang.Object obj;
        defpackage.cky.b((java.lang.Object) context, (java.lang.Object) "context cannot be null");
        if (!(context instanceof android.app.Service) && !(context instanceof android.app.Application)) {
            int i = 0;
            while (true) {
                int i2 = i;
                android.content.Context context2 = context;
                if (i2 < 1000) {
                    if (!(context2 instanceof android.app.Activity)) {
                        if (!(context2 instanceof android.content.ContextWrapper)) {
                            obj = null;
                            break;
                        }
                        context = ((android.content.ContextWrapper) context2).getBaseContext();
                        i = i2 + 1;
                    } else {
                        obj = (android.app.Activity) context2;
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } else {
            obj = null;
        }
        return (android.app.Activity) defpackage.cky.b(obj, (java.lang.Object) "Could not extract activity from context");
    }

    public static void a(android.support.v7.widget.RecyclerView recyclerView, defpackage.ceo ceo) {
        if (!java.lang.Boolean.TRUE.equals(recyclerView.getTag(2131755034))) {
            ceo.a.a(ceo.f);
            ceo.b();
            ceo.d.b();
            recyclerView.setTag(2131755034, java.lang.Boolean.valueOf(true));
        }
    }

    public static android.view.View.OnClickListener a(defpackage.cdg cdg, defpackage.cdj cdj) {
        return new defpackage.ceu(cdg, cdj);
    }

    public static java.util.concurrent.ScheduledExecutorService a(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return new defpackage.cla(scheduledExecutorService, new defpackage.cld());
    }

    public static defpackage.efa h() {
        try {
            defpackage.ckp ckp = defpackage.cko.a;
            defpackage.efb[] efbArr = (defpackage.efb[]) new defpackage.ckn().a(1, ckp.a, ckp.e).a(2, ckp.a, ckp.b).a(3, ckp.b, ckp.c).a(4, ckp.c, ckp.d).a.toArray(new defpackage.efb[0]);
            if (efbArr == null || efbArr.length == 0) {
                return null;
            }
            defpackage.efa efa = new defpackage.efa();
            efa.a = efbArr;
            return efa;
        } catch (java.lang.RuntimeException e) {
            b("PrimesForPrimes", "Exception getting Primes Init timers", e, new java.lang.Object[0]);
            return null;
        }
    }

    public static java.io.File b(android.content.Context context) {
        defpackage.cky.a((java.lang.Object) context);
        java.io.File cacheDir = context.getCacheDir();
        java.lang.String e = e(context);
        return new java.io.File(cacheDir, new java.lang.StringBuilder(java.lang.String.valueOf(e).length() + 12).append(e).append("_primeshprof").toString());
    }

    public static void c(android.content.Context context) {
        java.io.File b = b(context);
        if (b.exists()) {
            b.delete();
        }
    }

    public static void d(android.content.Context context) {
        defpackage.cky.a((java.lang.Object) context);
        java.io.File cacheDir = context.getCacheDir();
        java.lang.String e = e(context);
        java.io.File file = new java.io.File(cacheDir, new java.lang.StringBuilder(java.lang.String.valueOf(e).length() + 17).append(e).append("_primes_mhd.hprof").toString());
        if (file.exists()) {
            file.delete();
        }
    }

    private static java.lang.String e(android.content.Context context) {
        java.lang.String d = defpackage.cnx.d(context);
        if (d == null) {
            return "";
        }
        java.lang.String replaceAll = d.replaceAll("[^a-zA-Z0-9\\._]", "_");
        return replaceAll.substring(0, java.lang.Math.min(32, replaceAll.length()));
    }

    public static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        return objArr.length == 0 ? str : java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static void a(int i, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(str, i)) {
            android.util.Log.println(i, str, a(str2, objArr));
        }
    }

    private static void a(int i, java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(str, i)) {
            switch (i) {
                case 2:
                    a(str2, objArr);
                    return;
                case 3:
                    a(str2, objArr);
                    return;
                case 4:
                    a(str2, objArr);
                    return;
                case 5:
                    android.util.Log.w(str, a(str2, objArr), th);
                    return;
                case 6:
                    android.util.Log.e(str, a(str2, objArr), th);
                    return;
                default:
                    a(5, "PrimesLog", "unexpected priority: %d for log %s: %s", java.lang.Integer.valueOf(i), str, a(str2, objArr));
                    return;
            }
        }
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th, java.lang.Object... objArr) {
        a(3, str, th, str2, objArr);
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Throwable th, java.lang.Object... objArr) {
        a(5, str, th, str2, objArr);
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        a(6, str, str2, objArr);
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th, java.lang.Object... objArr) {
        a(6, str, th, str2, objArr);
    }
}
