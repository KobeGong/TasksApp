package com.google.android.apps.tasks.addtotasks;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;

import defpackage.aim;
import defpackage.ain;
import defpackage.ajd;
import defpackage.anc;
import defpackage.any;
import defpackage.azb;
import defpackage.bhq;
import defpackage.bhr;
import defpackage.dan;
import defpackage.dby;
import defpackage.dca;
import defpackage.dcb;
import defpackage.dih;
import defpackage.dii;
import defpackage.djz;
import defpackage.dkw;

/* compiled from: PG */
public class AddToTasksBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        anc anc;
        anc anc2;
        String str2;
        String str3 = null;
        try {
            Bundle extras = intent.getExtras();
            Messenger messenger = (Messenger) extras.getParcelable("messenger");
            bhq b = bhr.b(context, intent);
            if (b == null) {
                anc = any.a().c();
                if (anc == null) {
                    azb.b("No default SyncEngine", new Object[0]);
                    a(context);
                    return;
                }
                str = anc.b();
            } else {
                str = b.a;
                anc = null;
            }
            Account a = ajd.a(context, str);
            if (a == null) {
                azb.a("Specified account was not found: %s", azb.a(str));
                a(context);
                anc2 = anc;
            } else if (anc == null) {
                anc2 = any.a().b(a);
            } else {
                anc2 = anc;
            }
            if (a != null) {
                if (anc2 != null) {
                    str3 = a(context, anc2, a);
                }
                if (!TextUtils.isEmpty(str3) || anc2 == null) {
                    str2 = str3;
                    str3 = a(context, anc2, str3, extras);
                } else {
                    azb.a("Failed to find task list", new Object[0]);
                    anc2.c().a(new aim(this, context, anc2, a, extras, messenger), TaskApplication.b().a);
                    return;
                }
            } else {
                str2 = null;
            }
            a(messenger, str2, str3);
        } catch (BadParcelableException e) {
            azb.a("Failed to unparcel", new Object[0]);
        }
    }

    private static void a(Context context) {
        Toast.makeText(context, context.getString(R.string.error_creating_task), 0).show();
    }

    public static void a(Messenger messenger, String str, String str2) {
        if (messenger != null) {
            try {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle(1);
                bundle.putString("taskListId", str);
                bundle.putString("taskId", str2);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (RemoteException e) {
                azb.a("Failed to send add to tasks result", (Throwable) e, new String[0]);
            }
        }
    }

    public static String a(Context context, anc anc, Account account) {
        String a = ain.b(context, account.name).a();
        if (a != null) {
            return a;
        }
        for (defpackage.dcb dcb : anc.d()) {
            a = dcb.b;
            if (!ajd.a(a)) {
                a = a;
            }
        }
        return a;
    }

    public static String a(Context context, anc anc, String str, Bundle bundle) {
        String str2;
        dih dih;
        String string = bundle.getString("title");
        if (TextUtils.isEmpty(string)) {
            str2 = context.getString(R.string.task_no_title);
        } else {
            str2 = string;
        }
        dii f = ((dii) dca.g.a(bg.ao)).f(str2);
        String string2 = bundle.getString("link");
        String string3 = bundle.getString("permalink");
        if (!TextUtils.isEmpty(string2)) {
            if (ajd.b(string2)) {
                f.h(((dii) dan.f.a(bg.ao)).a(((dii) dao.c.a(bg.ao)).b(str2).a(string2)));
            } else {
                new Object[1][0] = string2;
            }
        } else if (!TextUtils.isEmpty(string3)) {
            dii dii = (dii) dan.f.a(bg.ao);
            daq daq = daq.GMAIL_PERMALINK;
            dii.b();
            dan dan = (dan) dii.a;
            if (daq == null) {
                throw new NullPointerException();
            }
            dan.e = daq.a();
            dii.b();
            dan dan2 = (dan) dii.a;
            if (string3 == null) {
                throw new NullPointerException();
            }
            dan2.c = string3;
            f.h(dii);
        }
        long j = bundle.getLong("dueDate", 0);
        if (j != 0) {
            f.a(ajd.a(j));
        }
        if (anc.d().isEmpty()) {
            return null;
        }
        dii g = ((dii) dby.g.a(bg.ao)).g(f);
        if (g.b) {
            dih = g.a;
        } else {
            dih dih2 = g.a;
            djz.a.a(dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dby a = anc.a(str, (dby) dih3, 0, (String) null);
        String valueOf = String.valueOf(a.d);
        if (valueOf.length() != 0) {
            "Created task ID: ".concat(valueOf);
        } else {
            new String("Created task ID: ");
        }
        String str3 = a.d;
        if (TextUtils.isEmpty(str3)) {
            return str3;
        }
        alq.a().a(anc.b(), str);
        return str3;
    }
}
