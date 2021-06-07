package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.text.TextUtils;
import com.google.android.apps.tasks.addtotasks.AddToTasksBroadcastReceiver;

/* renamed from: aim  reason: default package */
public final /* synthetic */ class aim implements Runnable {
    private final Context a;
    private final anc b;
    private final Account c;
    private final Bundle d;
    private final Messenger e;

    public aim(AddToTasksBroadcastReceiver addToTasksBroadcastReceiver, Context context, anc anc, Account account, Bundle bundle, Messenger messenger) {
        this.a = context;
        this.b = anc;
        this.c = account;
        this.d = bundle;
        this.e = messenger;
    }

    public final void run() {
        Context context = this.a;
        anc anc = this.b;
        Account account = this.c;
        Bundle bundle = this.d;
        Messenger messenger = this.e;
        String a2 = AddToTasksBroadcastReceiver.a(context, anc, account);
        String str = null;
        if (TextUtils.isEmpty(a2)) {
            azb.a("Failed to find task list, even after requesting a sync!", new Object[0]);
        } else {
            ain.b(context, account.name).a(a2);
            str = AddToTasksBroadcastReceiver.a(context, anc, a2, bundle);
        }
        AddToTasksBroadcastReceiver.a(messenger, a2, str);
    }
}
