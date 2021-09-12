package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

import com.google.android.apps.tasks.R;

/* renamed from: ajd reason: default package */
/* compiled from: PG */
public final class ajd {
    private static final defpackage.doy a = defpackage.doy.a("google.internal.tasks.v1.errorinfo-bin", defpackage.eaa.b(defpackage.czy.f));

    public static boolean a(defpackage.dby dby) {
        defpackage.dca dca;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        return dca.a;
    }

    public static boolean a(java.lang.String str) {
        return str.equals("~default");
    }

    public static defpackage.dmk a(long j) {
        defpackage.dih dih;
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.setTimeInMillis(j);
        defpackage.dii e = ((defpackage.dii) defpackage.dmk.d.a(defpackage.bg.ao)).g(instance.get(5)).f(instance.get(2) + 1).e(instance.get(1));
        if (e.b) {
            dih = e.a;
        } else {
            defpackage.dih dih2 = e.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            e.b = true;
            dih = e.a;
        }
        defpackage.dih dih3 = dih;
        if (defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.dmk) dih3;
        }
        throw new defpackage.dkw();
    }

    public static long a(defpackage.dmk dmk) {
        return b(dmk).getTimeInMillis();
    }

    public static java.util.Calendar b(defpackage.dmk dmk) {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.set(1, dmk.a);
        instance.set(2, dmk.b - 1);
        instance.set(5, dmk.c);
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        return instance;
    }

    public static android.accounts.Account getAccountByName(android.content.Context context, java.lang.String str) {
        for (android.accounts.Account account : a(context)) {
            if (account.name.equals(str)) {
                return account;
            }
        }
        return null;
    }

    public static android.accounts.Account b(android.content.Context context, java.lang.String str) {
        try {
            for (android.accounts.Account account : a(context)) {
                if (str.equals(defpackage.avb.b(context, account.name))) {
                    new java.lang.Object[1][0] = defpackage.azb.a(account.name);
                    return account;
                }
            }
        } catch (defpackage.ava | java.io.IOException e) {
            defpackage.azb.a("Failed to find account ID", e, new java.lang.String[0]);
        }
        return null;
    }

    public static java.util.List<Account> a(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Collections.addAll(arrayList, defpackage.avb.c(context, "com.google"));
        } catch (android.os.RemoteException | defpackage.axw | defpackage.axx e) {
            defpackage.azb.a("Failed to obtain account", e, new java.lang.String[0]);
        }
        return arrayList;
    }

    public static java.lang.String a(android.content.Context context, java.util.Calendar calendar) {
        java.lang.String str;
        defpackage.bdk.a(calendar);
        java.util.Calendar a2 = defpackage.bdk.a();
        a2.add(5, 1);
        if (calendar.equals(a2)) {
            return context.getString(2131951727);
        }
        java.util.Calendar a3 = defpackage.bdk.a();
        a3.add(5, 7);
        if (!calendar.before(a3) || calendar.before(defpackage.bdk.a())) {
            str = "MMM dd";
        } else {
            str = "EEEE";
        }
        return new java.text.SimpleDateFormat(str, java.util.Locale.getDefault()).format(calendar.getTime());
    }

    public static void a(View view) {
        defpackage.cos.a(view.getContext()).a.a(4, view);
    }

    public static boolean b(java.lang.String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }

    public static boolean b(defpackage.dby dby) {
        defpackage.dca dca;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        return a(dca);
    }

    public static boolean a(defpackage.dca dca) {
        boolean z;
        if (!(dca.d != null) && TextUtils.isEmpty(dca.b) && TextUtils.isEmpty(dca.c)) {
            if (dca.f != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public static void a(defpackage.wl wlVar) {
        wlVar.show();
        View findViewById = wlVar.findViewById(android.R.id.message);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextSize(0, findViewById.getResources().getDimension(R.dimen.small_font_size));
        }
    }

    public static defpackage.czy a(defpackage.dqb dqb) {
        boolean z = false;
        defpackage.dor dor = dqb.b;
        defpackage.doy doy = a;
        int i = 0;
        while (true) {
            if (i >= dor.d) {
                break;
            } else if (defpackage.dor.a(doy.b, dor.a(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return (defpackage.czy) dqb.b.a(a);
        }
        return null;
    }

    public static boolean b(defpackage.dqb dqb) {
        if (dqb.a.l == defpackage.dpx.FAILED_PRECONDITION) {
            defpackage.czy a2 = a(dqb);
            if (a2 != null && a2.e) {
                return true;
            }
        }
        return false;
    }

    public static java.util.concurrent.ThreadFactory c(java.lang.String str) {
        defpackage.cyv a2 = new defpackage.cyv().a(false).a(str);
        java.lang.String str2 = a2.a;
        return new defpackage.aje(new defpackage.cyw(java.util.concurrent.Executors.defaultThreadFactory(), str2, str2 != null ? new java.util.concurrent.atomic.AtomicLong(0) : null, a2.b));
    }

    public static boolean c(android.content.Context context, java.lang.String str) {
        defpackage.aya a2 = defpackage.aya.a(context);
        context.getPackageManager();
        return a2.a(str);
    }

    public static int a(java.util.Calendar calendar, java.util.Calendar calendar2) {
        return java.lang.Math.round((((((float) (calendar.getTimeInMillis() - calendar2.getTimeInMillis())) / 1000.0f) / 60.0f) / 60.0f) / 24.0f);
    }

    public static defpackage.ajg b(android.content.Context context) {
        return (defpackage.ajg) context.getApplicationContext();
    }

    public static boolean a(java.util.concurrent.Future future) {
        if (!future.isDone()) {
            return false;
        }
        try {
            future.get();
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    static final /* synthetic */ void a(int i, java.lang.Runnable runnable) {
        android.os.Process.setThreadPriority(i);
        runnable.run();
    }
}
