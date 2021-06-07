package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.google.android.apps.tasks.R;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cdm  reason: default package */
/* compiled from: PG */
public class cdm {
    public void a(List list, List list2) {
    }

    public void a(Object obj, Object obj2, Object obj3) {
    }

    public void h_() {
    }

    public static String a(Object obj, cdf cdf) {
        String a = a(((cdu) obj).a());
        String a2 = a(((cdu) obj).b());
        if (a.isEmpty() && a2.isEmpty()) {
            return ((cdu) obj).b();
        }
        if (a.isEmpty()) {
            return a2;
        }
        if (a2.isEmpty()) {
            return a;
        }
        return a.equals(a2) ? a : new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(a2).length()).append(a).append(" ").append(a2).toString();
    }

    private static String a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public static Activity a(Context context) {
        Activity activity;
        cky.b(context, "context cannot be null");
        if (!(context instanceof Service) && !(context instanceof Application)) {
            int i = 0;
            while (true) {
                if (i < 1000) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                        i++;
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    activity = null;
                    break;
                }
            }
        } else {
            activity = null;
        }
        return (Activity) cky.b(activity, "Could not extract activity from context");
    }

    public static void a(RecyclerView recyclerView, ceo ceo) {
        if (!Boolean.TRUE.equals(recyclerView.getTag(R.id.tag_recycler_view_model_observer_registered))) {
            ceo.a.a(ceo.f);
            ceo.b();
            ceo.d.b();
            recyclerView.setTag(R.id.tag_recycler_view_model_observer_registered, true);
        }
    }

    public static View.OnClickListener a(cdg cdg, cdj cdj) {
        return new ceu(cdg, cdj);
    }

    public static ScheduledExecutorService a(ScheduledExecutorService scheduledExecutorService) {
        return new cla(scheduledExecutorService, new cld());
    }

    public static efa h() {
        try {
            ckp ckp = cko.a;
            efb[] efbArr = (efb[]) new ckn().a(1, ckp.a, ckp.e).a(2, ckp.a, ckp.b).a(3, ckp.b, ckp.c).a(4, ckp.c, ckp.d).a.toArray(new efb[0]);
            if (efbArr == null || efbArr.length == 0) {
                return null;
            }
            efa efa = new efa();
            efa.a = efbArr;
            return efa;
        } catch (RuntimeException e) {
            b("PrimesForPrimes", "Exception getting Primes Init timers", e, new Object[0]);
            return null;
        }
    }

    public static File b(Context context) {
        cky.a((Object) context);
        File cacheDir = context.getCacheDir();
        String e = e(context);
        return new File(cacheDir, new StringBuilder(String.valueOf(e).length() + 12).append(e).append("_primeshprof").toString());
    }

    public static void c(Context context) {
        File b = b(context);
        if (b.exists()) {
            b.delete();
        }
    }

    public static void d(Context context) {
        cky.a((Object) context);
        File cacheDir = context.getCacheDir();
        String e = e(context);
        File file = new File(cacheDir, new StringBuilder(String.valueOf(e).length() + 17).append(e).append("_primes_mhd.hprof").toString());
        if (file.exists()) {
            file.delete();
        }
    }

    private static String e(Context context) {
        String d = cnx.d(context);
        if (d == null) {
            return "";
        }
        String replaceAll = d.replaceAll("[^a-zA-Z0-9\\._]", "_");
        return replaceAll.substring(0, Math.min(32, replaceAll.length()));
    }

    public static String a(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(Locale.US, str, objArr);
    }

    public static void a(int i, String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            Log.println(i, str, a(str2, objArr));
        }
    }

    private static void a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
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
                    Log.w(str, a(str2, objArr), th);
                    return;
                case 6:
                    Log.e(str, a(str2, objArr), th);
                    return;
                default:
                    a(5, "PrimesLog", "unexpected priority: %d for log %s: %s", Integer.valueOf(i), str, a(str2, objArr));
                    return;
            }
        }
    }

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        a(3, str, th, str2, objArr);
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        a(5, str, th, str2, objArr);
    }

    public static void a(String str, String str2, Object... objArr) {
        a(6, str, str2, objArr);
    }

    public static void c(String str, String str2, Throwable th, Object... objArr) {
        a(6, str, th, str2, objArr);
    }
}
