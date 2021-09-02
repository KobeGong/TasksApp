package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ajd  reason: default package */
/* compiled from: PG */
public final class ajd {
    private static final doy a = doy.a("google.internal.tasks.v1.errorinfo-bin", eaa.b(czy.f));

    public static boolean a(dby dby) {
        dca dcaInst;
        if (dby.e == null) {
            dcaInst = dca.g;
        } else {
            dcaInst = dby.e;
        }
        return dcaInst.a;
    }

    public static boolean a(String str) {
        return str.equals("~default");
    }

    public static dmk a(long j) {
        dih dih;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        dii e = ((dii) dmk.d.a(bg.ao)).g(instance.get(5)).f(instance.get(2) + 1).e(instance.get(1));
        if (e.b) {
            dih = e.a;
        } else {
            dih dih2 = e.a;
            djz.a.a(dih2).c(dih2);
            e.b = true;
            dih = e.a;
        }
        dih dih3 = dih;
        if (dih.a(dih3, Boolean.TRUE.booleanValue())) {
            return (dmk) dih3;
        }
        throw new dkw();
    }

    public static long a(dmk dmk) {
        return b(dmk).getTimeInMillis();
    }

    public static Calendar b(dmk dmk) {
        Calendar instance = Calendar.getInstance();
        instance.set(1, dmk.a);
        instance.set(2, dmk.b - 1);
        instance.set(5, dmk.c);
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        return instance;
    }

    public static Account a(Context context, String str) {
        for (Account account : a(context)) {
            if (account.name.equals(str)) {
                return account;
            }
        }
        return null;
    }

    public static Account b(Context context, String str) {
        try {
            for (Account account : a(context)) {
                if (str.equals(avb.b(context, account.name))) {
                    new Object[1][0] = azb.a(account.name);
                    return account;
                }
            }
        } catch (ava | IOException e) {
            azb.a("Failed to find account ID", e, new String[0]);
        }
        return null;
    }

    public static List a(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            Collections.addAll(arrayList, avb.c(context, "com.google"));
        } catch (RemoteException | axw | axx e) {
            azb.a("Failed to obtain account", e, new String[0]);
        }
        return arrayList;
    }

    public static String a(Context context, Calendar calendar) {
        String str;
        bdk.a(calendar);
        Calendar a2 = bdk.a();
        a2.add(5, 1);
        if (calendar.equals(a2)) {
            return context.getString(R.string.due_date_tomorrow);
        }
        Calendar a3 = bdk.a();
        a3.add(5, 7);
        if (!calendar.before(a3) || calendar.before(bdk.a())) {
            str = "MMM dd";
        } else {
            str = "EEEE";
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(calendar.getTime());
    }

    public static void a(View view) {
        cos.a(view.getContext()).a.a(4, view);
    }

    public static boolean b(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }

    public static boolean b(dby dby) {
        dca dcaInst;
        if (dby.e == null) {
            dcaInst = dca.g;
        } else {
            dcaInst = dby.e;
        }
        return a(dcaInst);
    }

    public static boolean a(dca dca) {
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

    public static void a(wl wlVar) {
        wlVar.show();
        View findViewById = wlVar.findViewById(16908299);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextSize(0, findViewById.getResources().getDimension(R.dimen.small_font_size));
        }
    }

    public static czy a(dqb dqb) {
        boolean z = false;
        dor dor = dqb.b;
        doy doy = a;
        int i = 0;
        while (true) {
            if (i >= dor.d) {
                break;
            } else if (dor.a(doy.b, dor.a(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return (czy) dqb.b.a(a);
        }
        return null;
    }

    public static boolean b(dqb dqb) {
        czy a2;
        if (dqb.a.l != dpx.FAILED_PRECONDITION || (a2 = a(dqb)) == null || !a2.e) {
            return false;
        }
        return true;
    }

    public static ThreadFactory c(String str) {
        cyv a2 = new cyv().a(false).a(str);
        String str2 = a2.a;
        return new aje(new cyw(Executors.defaultThreadFactory(), str2, str2 != null ? new AtomicLong(0) : null, a2.b));
    }

    public static boolean c(Context context, String str) {
        aya a2 = aya.a(context);
        context.getPackageManager();
        return a2.a(str);
    }

    public static int a(Calendar calendar, Calendar calendar2) {
        return Math.round((((((float) (calendar.getTimeInMillis() - calendar2.getTimeInMillis())) / 1000.0f) / 60.0f) / 60.0f) / 24.0f);
    }

    public static ajg b(Context context) {
        return (ajg) context.getApplicationContext();
    }

    public static boolean a(Future future) {
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

    static final /* synthetic */ void a(int i, Runnable runnable) {
        Process.setThreadPriority(i);
        runnable.run();
    }
}
