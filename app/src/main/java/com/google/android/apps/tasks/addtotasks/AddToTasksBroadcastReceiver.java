package com.google.android.apps.tasks.addtotasks;

/* compiled from: PG */
public class AddToTasksBroadcastReceiver extends android.content.BroadcastReceiver {
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        defpackage.anc anc;
        defpackage.anc anc2;
        java.lang.String str2;
        java.lang.String str3 = null;
        try {
            android.os.Bundle extras = intent.getExtras();
            android.os.Messenger messenger = (android.os.Messenger) extras.getParcelable("messenger");
            defpackage.bhq b = defpackage.bhr.b(context, intent);
            if (b == null) {
                anc = defpackage.any.a().c();
                if (anc == null) {
                    defpackage.azb.b("No default SyncEngine", new java.lang.Object[0]);
                    a(context);
                    return;
                }
                str = anc.b();
            } else {
                str = b.a;
                anc = null;
            }
            android.accounts.Account a = defpackage.ajd.getAccountByName(context, str);
            if (a == null) {
                defpackage.azb.a("Specified account was not found: %s", defpackage.azb.a(str));
                a(context);
                anc2 = anc;
            } else if (anc == null) {
                anc2 = defpackage.any.a().b(a);
            } else {
                anc2 = anc;
            }
            if (a != null) {
                if (anc2 != null) {
                    str3 = a(context, anc2, a);
                }
                if (!android.text.TextUtils.isEmpty(str3) || anc2 == null) {
                    str2 = str3;
                    str3 = a(context, anc2, str3, extras);
                } else {
                    defpackage.azb.a("Failed to find task list", new java.lang.Object[0]);
                    anc2.c().a(new defpackage.aim(this, context, anc2, a, extras, messenger), com.google.android.apps.tasks.common.TaskApplication.getApplication().a);
                    return;
                }
            } else {
                str2 = null;
            }
            a(messenger, str2, str3);
        } catch (android.os.BadParcelableException e) {
            defpackage.azb.a("Failed to unparcel", new java.lang.Object[0]);
        }
    }

    private static void a(android.content.Context context) {
        android.widget.Toast.makeText(context, context.getString(2131951732), 0).show();
    }

    public static void a(android.os.Messenger messenger, java.lang.String str, java.lang.String str2) {
        if (messenger != null) {
            try {
                android.os.Message obtain = android.os.Message.obtain();
                android.os.Bundle bundle = new android.os.Bundle(1);
                bundle.putString("taskListId", str);
                bundle.putString("taskId", str2);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (android.os.RemoteException e) {
                defpackage.azb.a("Failed to send add to tasks result", (java.lang.Throwable) e, new java.lang.String[0]);
            }
        }
    }

    public static java.lang.String a(android.content.Context context, defpackage.anc anc, android.accounts.Account account) {
        java.lang.String a = defpackage.ain.b(context, account.name).a();
        if (a != null) {
            return a;
        }
        java.util.Iterator it = anc.d().iterator();
        while (true) {
            java.lang.String str = a;
            if (!it.hasNext()) {
                return str;
            }
            a = ((defpackage.dcb) it.next()).b;
            if (!defpackage.ajd.a(a)) {
                a = str;
            }
        }
    }

    public static java.lang.String a(android.content.Context context, defpackage.anc anc, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String str2;
        defpackage.dih dih;
        java.lang.String string = bundle.getString("title");
        if (android.text.TextUtils.isEmpty(string)) {
            str2 = context.getString(2131951826);
        } else {
            str2 = string;
        }
        defpackage.dii f = ((defpackage.dii) defpackage.dca.g.a(defpackage.bg.ao)).setTitle(str2);
        java.lang.String string2 = bundle.getString("link");
        java.lang.String string3 = bundle.getString("permalink");
        if (!android.text.TextUtils.isEmpty(string2)) {
            if (defpackage.ajd.b(string2)) {
                f.h(((defpackage.dii) defpackage.dan.f.a(defpackage.bg.ao)).a(((defpackage.dii) defpackage.dao.c.a(defpackage.bg.ao)).b(str2).a(string2)));
            } else {
                new java.lang.Object[1][0] = string2;
            }
        } else if (!android.text.TextUtils.isEmpty(string3)) {
            defpackage.dii dii = (defpackage.dii) defpackage.dan.f.a(defpackage.bg.ao);
            defpackage.daq daq = defpackage.daq.GMAIL_PERMALINK;
            dii.b();
            defpackage.dan dan = (defpackage.dan) dii.a;
            if (daq == null) {
                throw new java.lang.NullPointerException();
            }
            dan.e = daq.a();
            dii.b();
            defpackage.dan dan2 = (defpackage.dan) dii.a;
            if (string3 == null) {
                throw new java.lang.NullPointerException();
            }
            dan2.c = string3;
            f.h(dii);
        }
        long j = bundle.getLong("dueDate", 0);
        if (j != 0) {
            f.a(defpackage.ajd.a(j));
        }
        if (anc.d().isEmpty()) {
            return null;
        }
        defpackage.dii g = ((defpackage.dii) defpackage.dby.g.a(defpackage.bg.ao)).g(f);
        if (g.b) {
            dih = g.a;
        } else {
            defpackage.dih dih2 = g.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        defpackage.dby a = anc.a(str, (defpackage.dby) dih3, 0, (java.lang.String) null);
        java.lang.String str3 = "Created task ID: ";
        java.lang.String valueOf = java.lang.String.valueOf(a.d);
        if (valueOf.length() != 0) {
            str3.concat(valueOf);
        } else {
            new java.lang.String(str3);
        }
        java.lang.String str4 = a.d;
        if (android.text.TextUtils.isEmpty(str4)) {
            return str4;
        }
        defpackage.alq.a().a(anc.b(), str);
        return str4;
    }
}
