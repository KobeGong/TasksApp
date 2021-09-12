package com.google.android.apps.tasks.features.notificationmanager;

import android.accounts.Account;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;

import defpackage.LinkToTask;

/* compiled from: PG */
public class NotificationManagerImpl extends android.content.BroadcastReceiver implements defpackage.akm {
    private static final java.util.Map a;
    private android.content.Context b;

    public void onReceive(android.content.Context context, Intent intent) {
        this.b = context.getApplicationContext();
        java.lang.String action = intent.getAction();
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
                java.util.List a2 = defpackage.ajd.a(context);
                a(defpackage.akl.DUE, a(defpackage.akl.DUE, a2, defpackage.any.a()));
                a(defpackage.akl.OVERDUE, a(defpackage.akl.OVERDUE, a2, defpackage.any.a()));
                return;
            case 1:
                java.lang.String stringExtra = intent.getStringExtra("task_id");
                if (!android.text.TextUtils.isEmpty(stringExtra)) {
                    b(stringExtra);
                    return;
                }
                return;
            default:
                defpackage.azb.b("Unknown intent", new java.lang.Object[0]);
                return;
        }
    }

    public final void a(android.content.Context context, java.util.List<Account> list) {
        this.b = context;
        Intent intent = new Intent("com.google.android.apps.tasks.NOTIFICATIONS");
        if (!(PendingIntent.getBroadcast(context, 0, intent, 536870912) != null)) {
            java.util.Calendar instance = java.util.Calendar.getInstance();
            instance.set(11, 9);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            if (instance.getTimeInMillis() < defpackage.auz.a()) {
                instance.add(5, 1);
            }
            ((AlarmManager) com.google.android.apps.tasks.common.TaskApplication.getApplication().getApplicationContext().getSystemService("alarm")).setRepeating(0, instance.getTimeInMillis(), 86400000, PendingIntent.getBroadcast(context, 0, intent, 0));
        }
        if (!list.isEmpty()) {
            android.os.AsyncTask.execute(new defpackage.akk(list));
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            context.registerReceiver(this, new IntentFilter("com.google.android.apps.tasks.NOTIFICATIONS"));
        }
    }

    private final android.app.NotificationManager a() {
        return (android.app.NotificationManager) this.b.getSystemService("notification");
    }

    public final void a(java.lang.String str) {
        b(str);
        for (java.util.Map.Entry key : a.entrySet()) {
            defpackage.akl akl = (defpackage.akl) key.getKey();
            java.util.Map a2 = a(akl, defpackage.ajd.a(this.b), defpackage.any.a());
            java.util.Iterator it = a2.keySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.lang.String str2 = ((defpackage.dby) ((java.util.Map.Entry) it.next()).getKey()).d;
                if (str2.equals(str)) {
                    z = true;
                } else if (a(str2.hashCode()) == null && android.os.Build.VERSION.SDK_INT >= 24) {
                    it.remove();
                }
            }
            if (z) {
                a(akl, a2);
            }
        }
        b();
    }

    private static defpackage.akl a(int i) {
        for (java.util.Map.Entry entry : a.entrySet()) {
            if (((java.util.Set) entry.getValue()).contains(java.lang.Integer.valueOf(i))) {
                return (defpackage.akl) entry.getKey();
            }
        }
        return null;
    }

    public final void b(java.lang.String str) {
        int hashCode = str.hashCode();
        a().cancel(hashCode);
        new java.lang.Object[1][0] = java.lang.Integer.valueOf(hashCode);
        for (java.util.Map.Entry entry : a.entrySet()) {
            defpackage.akl akl = (defpackage.akl) entry.getKey();
            java.util.Set set = (java.util.Set) entry.getValue();
            if (set.contains(java.lang.Integer.valueOf(hashCode))) {
                set.remove(java.lang.Integer.valueOf(hashCode));
            }
            if (set.size() > 1) {
                java.util.Map a2 = a(akl, defpackage.ajd.a(this.b), defpackage.any.a());
                if (a2 != null && !a2.isEmpty()) {
                    int i = akl.e;
                    defpackage.ni a3 = a(akl, a2, b(i));
                    ((java.util.Set) a.get(akl)).add(java.lang.Integer.valueOf(i));
                    new java.lang.Object[1][0] = this.b.getString(akl.e);
                    a().notify(i, a3.b());
                }
            } else {
                b();
            }
        }
    }

    private final void b() {
        int i;
        for (java.util.Map.Entry entry : a.entrySet()) {
            java.util.Set set = (java.util.Set) entry.getValue();
            int i2 = ((defpackage.akl) entry.getKey()).e;
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                android.service.notification.StatusBarNotification[] activeNotifications = a().getActiveNotifications();
                int length = activeNotifications.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    if (this.b.getString(((defpackage.akl) entry.getKey()).d).equals(activeNotifications[i3].getNotification().getGroup())) {
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

    private static java.util.Map a(defpackage.akl akl, java.util.List list, defpackage.any any) {
        if (akl == defpackage.akl.DUE) {
            return a(86400000, list, any);
        }
        if (akl == defpackage.akl.OVERDUE) {
            return a(-86400000, list, any);
        }
        return defpackage.cta.a;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<android.accounts.Account>, for r8v0, types: [java.util.List, java.util.List<android.accounts.Account>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map a(long r6, java.util.List<android.accounts.Account> r8, defpackage.any r9) {
        /*
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r3 = r8.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r3.next()
            android.accounts.Account r0 = (android.accounts.Account) r0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            java.lang.String r5 = r0.name
            java.lang.String r5 = defpackage.azb.a(r5)
            r1[r4] = r5
            anc r1 = r9.b(r0)
            java.util.Map r1 = r1.a(r6)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r4 = r1.iterator()
        L_0x0031:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0009
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r2.put(r1, r0)
            goto L_0x0031
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tasks.features.notificationmanager.NotificationManagerImpl.a(long, java.util.List, any):java.util.Map");
    }

    private final void a(defpackage.akl akl, java.util.Map map) {
        defpackage.dca dca;
        defpackage.dmk dmk;
        defpackage.dca dca2;
        java.lang.String str;
        defpackage.dca dca3;
        defpackage.dca dca4;
        java.util.Set<java.lang.Integer> set = (java.util.Set) a.get(akl);
        for (java.lang.Integer intValue : set) {
            a().cancel(intValue.intValue());
        }
        set.clear();
        if (!map.isEmpty()) {
            java.util.Set set2 = (java.util.Set) a.get(akl);
            int i = akl.e;
            if (android.os.Build.VERSION.SDK_INT >= 24 || map.size() > 1) {
                defpackage.ni a2 = a(akl, map, b(i));
                set2.add(java.lang.Integer.valueOf(i));
                a().notify(i, a2.b());
            }
            if (android.os.Build.VERSION.SDK_INT >= 24 || map.size() <= 1) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    java.lang.String string = this.b.getString(akl.c);
                    int i2 = akl.e;
                    if (a().getNotificationChannel(string) == null) {
                        a().createNotificationChannel(new android.app.NotificationChannel(string, this.b.getString(i2), 3));
                    }
                }
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) entry.getKey();
                    java.lang.String str2 = ((android.accounts.Account) entry.getValue()).name;
                    defpackage.dby dby = (defpackage.dby) entry2.getKey();
                    java.lang.String str3 = (java.lang.String) entry2.getValue();
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = dby.d;
                    if (dby.e == null) {
                        dca = defpackage.dca.g;
                    } else {
                        dca = dby.e;
                    }
                    if (dca.d == null) {
                        dmk = defpackage.dmk.d;
                    } else {
                        dmk = dca.d;
                    }
                    objArr[1] = dmk;
                    int hashCode = java.util.Arrays.hashCode(objArr);
                    defpackage.akl a3 = a(hashCode);
                    if (a3 != null) {
                        ((java.util.Set) a.get(a3)).remove(java.lang.Integer.valueOf(hashCode));
                    }
                    int size = map.size();
                    android.content.Context context = this.b;
                    int hashCode2 = dby.d.hashCode();
                    java.lang.String str4 = dby.d;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    LinkToTask ajk = new LinkToTask(str2, str3, str4);
                    intent.setData(new android.net.Uri.Builder().scheme("https").authority("tasks.google.com").appendPath("task").appendPath(ajk.getAccount()).appendPath(ajk.getTaskListId()).appendPath(ajk.getTaskId()).build());
                    PendingIntent activity = PendingIntent.getActivity(context, hashCode2, intent, 0);
                    Intent intent2 = new Intent(this.b, com.google.android.apps.tasks.features.notificationmanager.NotificationManagerImpl.class);
                    intent2.setAction("com.google.android.apps.tasks.NOTIFICATION_DISMISSED");
                    intent2.putExtra("task_id", dby.d);
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.b.getApplicationContext(), dby.d.hashCode(), intent2, 0);
                    if (dby.e == null) {
                        dca2 = defpackage.dca.g;
                    } else {
                        dca2 = dby.e;
                    }
                    java.lang.String str5 = dca2.b;
                    if (str5.isEmpty()) {
                        str5 = this.b.getString(2131951826);
                    }
                    defpackage.ni a4 = new defpackage.ni(this.b, 0).a(2130837692).a((java.lang.CharSequence) str5);
                    if (size != 1) {
                        if (dby.e == null) {
                            dca3 = defpackage.dca.g;
                        } else {
                            dca3 = dby.e;
                        }
                        if (!android.text.TextUtils.isEmpty(dca3.c)) {
                            if (dby.e == null) {
                                dca4 = defpackage.dca.g;
                            } else {
                                dca4 = dby.e;
                            }
                            str = dca4.c;
                            defpackage.ni b2 = a4.b((java.lang.CharSequence) str);
                            b2.f = activity;
                            defpackage.ni c = b2.a(broadcast).c(str2);
                            c.n = "reminder";
                            c.s = this.b.getString(akl.c);
                            c.k = this.b.getString(akl.d);
                            c.b(16);
                            c.p = defpackage.ob.c(this.b, akl.g);
                            set2.add(java.lang.Integer.valueOf(hashCode));
                            a().notify(hashCode, c.b());
                        }
                    }
                    str = this.b.getResources().getQuantityString(akl.f, 1);
                    defpackage.ni b22 = a4.b((java.lang.CharSequence) str);
                    b22.f = activity;
                    defpackage.ni c2 = b22.a(broadcast).c(str2);
                    c2.n = "reminder";
                    c2.s = this.b.getString(akl.c);
                    c2.k = this.b.getString(akl.d);
                    c2.b(16);
                    c2.p = defpackage.ob.c(this.b, akl.g);
                    set2.add(java.lang.Integer.valueOf(hashCode));
                    a().notify(hashCode, c2.b());
                }
            }
        }
    }

    private final defpackage.ni a(defpackage.akl akl, java.util.Map map, PendingIntent pendingIntent) {
        defpackage.dca dca;
        defpackage.dca dca2;
        java.lang.String quantityString = this.b.getResources().getQuantityString(akl.f, map.size(), new java.lang.Object[]{java.lang.Integer.valueOf(map.size())});
        defpackage.ni c = new defpackage.ni(this.b, 0).a(2130837692).c(quantityString);
        c.n = "reminder";
        c.s = this.b.getString(akl.c);
        c.k = this.b.getString(akl.d);
        c.l = true;
        defpackage.ni d = c.d(quantityString);
        d.p = defpackage.ob.c(this.b, akl.g);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return d;
        }
        defpackage.nj njVar = new defpackage.nj(d);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (i2 + 1 == 5 && map.size() > 5) {
                njVar.a((java.lang.CharSequence) this.b.getString(2131951770, new java.lang.Object[]{java.lang.Integer.valueOf(map.size() - 4)}));
                break;
            }
            defpackage.dby dby = (defpackage.dby) ((java.util.Map.Entry) entry.getKey()).getKey();
            if (dby.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = dby.e;
            }
            java.lang.String trim = dca.b.trim();
            if (android.text.TextUtils.isEmpty(trim)) {
                trim = this.b.getString(2131951826);
            }
            if (dby.e == null) {
                dca2 = defpackage.dca.g;
            } else {
                dca2 = dby.e;
            }
            java.lang.String str = dca2.c;
            sb.append(i2 > 0 ? ", " : "");
            sb.append(trim);
            android.text.SpannableString spannableString = new android.text.SpannableString(java.lang.String.format("%s %s", new java.lang.Object[]{trim, str}));
            spannableString.setSpan(new android.text.style.TextAppearanceSpan(this.b, 2132017818), 0, trim.length(), 33);
            njVar.a((java.lang.CharSequence) spannableString);
            i = i2 + 1;
        }
        d.b(16);
        d.a((java.lang.CharSequence) this.b.getString(2131951686)).b((java.lang.CharSequence) sb).a((defpackage.nk) njVar).f = pendingIntent;
        return d;
    }

    private final PendingIntent b(int i) {
        return PendingIntent.getActivity(this.b, i, this.b.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.tasks"), 0);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<android.accounts.Account>, for r8v0, types: [java.util.List, java.util.List<android.accounts.Account>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void a(java.util.List<android.accounts.Account> r8) {
            r7 = 1
            r6 = 0
            java.util.Iterator r1 = r8.iterator()
        L_0x0006:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            android.accounts.Account r0 = (android.accounts.Account)r1.next()
            java.util.List r2 = android.content.ContentResolver.getPeriodicSyncs(r0, "com.google.android.apps.tasks.sync.provider")
            java.lang.String r3 = defpackage.azb.a(r0.name)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0033
            java.lang.Object[] r2 = new java.lang.Object[1]
            r2[0] = r3
            java.lang.String r2 = "com.google.android.apps.tasks.sync.provider"
            android.os.Bundle r3 = android.os.Bundle.EMPTY
            r4 = 43200(0xa8c0, double:2.13436E-319)
            android.content.ContentResolver.addPeriodicSync(r0, "com.google.android.apps.tasks.sync.provider", android.os.Bundle.EMPTY, 43200)
            goto L_0x0006
        L_0x0033:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r3
            goto L_0x0006
        L_0x0038:
            return
    }

    static {
        defpackage.akl akl = defpackage.akl.DUE;
        java.util.HashSet hashSet = new java.util.HashSet();
        defpackage.akl akl2 = defpackage.akl.OVERDUE;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        defpackage.cky.c((java.lang.Object) akl, (java.lang.Object) hashSet);
        defpackage.cky.c((java.lang.Object) akl2, (java.lang.Object) hashSet2);
        a = defpackage.cta.a(2, new java.lang.Object[]{akl, hashSet, akl2, hashSet2});
    }
}
