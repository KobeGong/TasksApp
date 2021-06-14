package com.google.android.apps.tasks.features.notificationmanager;

import android.accounts.Account;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.PeriodicSync;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import defpackage.ajd;
import defpackage.akl;
import defpackage.any;
import defpackage.azb;

/* compiled from: PG */
public class NotificationManagerImpl extends BroadcastReceiver implements akm {
    private static final Map a;
    private Context b;

    public void onReceive(Context context, Intent intent) {
        this.b = context.getApplicationContext();
        String action = intent.getAction();
        char c = 65535;
        switch (action.hashCode()) {
            case -2056854998:
                if (action.equals("com.google.android.apps.tasks.NOTIFICATION_DISMISSED")) {
                    c = 1;
                    break;
                }
                break;
            case -1005885133:
                if (action.equals("com.google.android.apps.tasks.NOTIFICATIONS")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                List a2 = ajd.a(context);
                a(akl.DUE, a(akl.DUE, a2, any.get()));
                a(akl.OVERDUE, a(akl.OVERDUE, a2, any.get()));
                return;
            case 1:
                String stringExtra = intent.getStringExtra("task_id");
                if (!TextUtils.isEmpty(stringExtra)) {
                    b(stringExtra);
                    return;
                }
                return;
            default:
                azb.b("Unknown intent", new Object[0]);
                return;
        }
    }

    @Override // defpackage.akm
    public final void a(Context context, List list) {
        this.b = context;
        Intent intent = new Intent("com.google.android.apps.tasks.NOTIFICATIONS");
        if (!(PendingIntent.getBroadcast(context, 0, intent, 536870912) != null)) {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 9);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            if (instance.getTimeInMillis() < auz.a()) {
                instance.add(5, 1);
            }
            ((AlarmManager) TaskApplication.b().getApplicationContext().getSystemService("alarm")).setRepeating(0, instance.getTimeInMillis(), 86400000, PendingIntent.getBroadcast(context, 0, intent, 0));
        }
        if (!list.isEmpty()) {
            AsyncTask.execute(new akk(list));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.registerReceiver(this, new IntentFilter("com.google.android.apps.tasks.NOTIFICATIONS"));
        }
    }

    private final NotificationManager a() {
        return (NotificationManager) this.b.getSystemService("notification");
    }

    @Override // defpackage.akm
    public final void a(String str) {
        b(str);
        for (Map.Entry entry : a.entrySet()) {
            akl akl = (akl) entry.getKey();
            Map a2 = a(akl, ajd.a(this.b), any.get());
            Iterator it = a2.keySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                String str2 = ((dby) ((Map.Entry) it.next()).getKey()).d;
                if (str2.equals(str)) {
                    z = true;
                } else if (a(str2.hashCode()) == null && Build.VERSION.SDK_INT >= 24) {
                    it.remove();
                }
            }
            if (z) {
                a(akl, a2);
            }
        }
        b();
    }

    private static akl a(int i) {
        for (Map.Entry entry : a.entrySet()) {
            if (((Set) entry.getValue()).contains(Integer.valueOf(i))) {
                return (akl) entry.getKey();
            }
        }
        return null;
    }

    @Override // defpackage.akm
    public final void b(String str) {
        int hashCode = str.hashCode();
        a().cancel(hashCode);
        new Object[1][0] = Integer.valueOf(hashCode);
        for (Map.Entry entry : a.entrySet()) {
            akl akl = (akl) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set.contains(Integer.valueOf(hashCode))) {
                set.remove(Integer.valueOf(hashCode));
            }
            if (set.size() > 1) {
                Map a2 = a(akl, ajd.a(this.b), any.get());
                if (a2 != null && !a2.isEmpty()) {
                    int i = akl.e;
                    ni a3 = a(akl, a2, b(i));
                    ((Set) a.get(akl)).add(Integer.valueOf(i));
                    new Object[1][0] = this.b.getString(akl.e);
                    a().notify(i, a3.b());
                }
            } else {
                b();
            }
        }
    }

    private final void b() {
        int i;
        for (Map.Entry entry : a.entrySet()) {
            Set set = (Set) entry.getValue();
            int i2 = ((akl) entry.getKey()).e;
            if (Build.VERSION.SDK_INT >= 23) {
                StatusBarNotification[] activeNotifications = a().getActiveNotifications();
                int length = activeNotifications.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    if (this.b.getString(((akl) entry.getKey()).d).equals(activeNotifications[i3].getNotification().getGroup())) {
                        i = i4 + 1;
                    } else {
                        i = i4;
                    }
                    i3++;
                    i4 = i;
                }
                if (i4 == 1) {
                    a().cancel(i2);
                    set.clear();
                }
            }
        }
    }

    private static Map a(akl akl, List list, any any) {
        if (akl == akl.DUE) {
            return a(86400000, list, any);
        }
        if (akl == akl.OVERDUE) {
            return a(-86400000, list, any);
        }
        return cta.a;
    }

    private static Map a(long j, List list, any any) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            new Object[1][0] = azb.a(account.name);
            for (Map.Entry entry : any.b(account).a(j).entrySet()) {
                hashMap.put(entry, account);
            }
        }
        return hashMap;
    }

    private final void a(akl akl, Map map) {
        dca dca;
        dmk dmk;
        dca dca2;
        String str;
        dca dca3;
        dca dca4;
        Set<Integer> set = (Set) a.get(akl);
        for (Integer num : set) {
            a().cancel(num.intValue());
        }
        set.clear();
        if (!map.isEmpty()) {
            Set set2 = (Set) a.get(akl);
            int i = akl.e;
            if (Build.VERSION.SDK_INT >= 24 || map.size() > 1) {
                ni a2 = a(akl, map, b(i));
                set2.add(Integer.valueOf(i));
                a().notify(i, a2.b());
            }
            if (Build.VERSION.SDK_INT >= 24 || map.size() <= 1) {
                if (Build.VERSION.SDK_INT >= 26) {
                    String string = this.b.getString(akl.c);
                    int i2 = akl.e;
                    if (a().getNotificationChannel(string) == null) {
                        a().createNotificationChannel(new NotificationChannel(string, this.b.getString(i2), 3));
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    Map.Entry entry2 = (Map.Entry) entry.getKey();
                    String str2 = ((Account) entry.getValue()).name;
                    dby dby = (dby) entry2.getKey();
                    String str3 = (String) entry2.getValue();
                    Object[] objArr = new Object[2];
                    objArr[0] = dby.d;
                    if (dby.e == null) {
                        dca = dca.g;
                    } else {
                        dca = dby.e;
                    }
                    if (dca.d == null) {
                        dmk = dmk.d;
                    } else {
                        dmk = dca.d;
                    }
                    objArr[1] = dmk;
                    int hashCode = Arrays.hashCode(objArr);
                    akl a3 = a(hashCode);
                    if (a3 != null) {
                        ((Set) a.get(a3)).remove(Integer.valueOf(hashCode));
                    }
                    int size = map.size();
                    Context context = this.b;
                    int hashCode2 = dby.d.hashCode();
                    String str4 = dby.d;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    ajk ajk = new ajk(str2, str3, str4);
                    intent.setData(new Uri.Builder().scheme("https").authority("tasks.google.com").appendPath("task").appendPath(ajk.a()).appendPath(ajk.b()).appendPath(ajk.c()).build());
                    PendingIntent activity = PendingIntent.getActivity(context, hashCode2, intent, 0);
                    Intent intent2 = new Intent(this.b, NotificationManagerImpl.class);
                    intent2.setAction("com.google.android.apps.tasks.NOTIFICATION_DISMISSED");
                    intent2.putExtra("task_id", dby.d);
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.b.getApplicationContext(), dby.d.hashCode(), intent2, 0);
                    if (dby.e == null) {
                        dca2 = dca.g;
                    } else {
                        dca2 = dby.e;
                    }
                    String str5 = dca2.b;
                    if (str5.isEmpty()) {
                        str5 = this.b.getString(R.string.task_no_title);
                    }
                    ni a4 = new ni(this.b, (byte) 0).a(R.drawable.quantum_ic_tasks_white_24).a(str5);
                    if (size != 1) {
                        if (dby.e == null) {
                            dca3 = dca.g;
                        } else {
                            dca3 = dby.e;
                        }
                        if (!TextUtils.isEmpty(dca3.c)) {
                            if (dby.e == null) {
                                dca4 = dca.g;
                            } else {
                                dca4 = dby.e;
                            }
                            str = dca4.c;
                            ni b2 = a4.b(str);
                            b2.f = activity;
                            ni c = b2.a(broadcast).c(str2);
                            c.n = "reminder";
                            c.s = this.b.getString(akl.c);
                            c.k = this.b.getString(akl.d);
                            c.b(16);
                            c.p = ob.c(this.b, akl.g);
                            set2.add(Integer.valueOf(hashCode));
                            a().notify(hashCode, c.b());
                        }
                    }
                    str = this.b.getResources().getQuantityString(akl.f, 1);
                    ni b22 = a4.b(str);
                    b22.f = activity;
                    ni c2 = b22.a(broadcast).c(str2);
                    c2.n = "reminder";
                    c2.s = this.b.getString(akl.c);
                    c2.k = this.b.getString(akl.d);
                    c2.b(16);
                    c2.p = ob.c(this.b, akl.g);
                    set2.add(Integer.valueOf(hashCode));
                    a().notify(hashCode, c2.b());
                }
            }
        }
    }

    private final ni a(akl akl, Map map, PendingIntent pendingIntent) {
        dca dca;
        dca dca2;
        String quantityString = this.b.getResources().getQuantityString(akl.f, map.size(), Integer.valueOf(map.size()));
        ni c = new ni(this.b, (byte) 0).a(R.drawable.quantum_ic_tasks_white_24).c(quantityString);
        c.n = "reminder";
        c.s = this.b.getString(akl.c);
        c.k = this.b.getString(akl.d);
        c.l = true;
        ni d = c.d(quantityString);
        d.p = ob.c(this.b, akl.g);
        if (Build.VERSION.SDK_INT >= 24) {
            return d;
        }
        nj njVar = new nj(d);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (i + 1 == 5 && map.size() > 5) {
                njVar.a(this.b.getString(R.string.notification_more_tasks, Integer.valueOf(map.size() - 4)));
                break;
            }
            dby dby = (dby) ((Map.Entry) entry.getKey()).getKey();
            if (dby.e == null) {
                dca = dca.g;
            } else {
                dca = dby.e;
            }
            String trim = dca.b.trim();
            if (TextUtils.isEmpty(trim)) {
                trim = this.b.getString(R.string.task_no_title);
            }
            if (dby.e == null) {
                dca2 = dca.g;
            } else {
                dca2 = dby.e;
            }
            String str = dca2.c;
            sb.append(i > 0 ? ", " : "");
            sb.append(trim);
            SpannableString spannableString = new SpannableString(String.format("%s %s", trim, str));
            spannableString.setSpan(new TextAppearanceSpan(this.b, R.style.notification_primary_text), 0, trim.length(), 33);
            njVar.a(spannableString);
            i++;
        }
        d.b(16);
        d.a(this.b.getString(R.string.app_name)).b(sb).a(njVar).f = pendingIntent;
        return d;
    }

    private final PendingIntent b(int i) {
        return PendingIntent.getActivity(this.b, i, this.b.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.tasks"), 0);
    }

    public static final /* synthetic */ void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            List<PeriodicSync> periodicSyncs = ContentResolver.getPeriodicSyncs(account, "com.google.android.apps.tasks.sync.provider");
            String a2 = azb.a(account.name);
            if (periodicSyncs.isEmpty()) {
                new Object[1][0] = a2;
                ContentResolver.addPeriodicSync(account, "com.google.android.apps.tasks.sync.provider", Bundle.EMPTY, 43200);
            } else {
                new Object[1][0] = a2;
            }
        }
    }

    static {
        akl akl = akl.DUE;
        HashSet hashSet = new HashSet();
        akl akl2 = akl.OVERDUE;
        HashSet hashSet2 = new HashSet();
        cky.c(akl, hashSet);
        cky.c(akl2, hashSet2);
        a = cta.a(2, new Object[]{akl, hashSet, akl2, hashSet2});
    }
}
