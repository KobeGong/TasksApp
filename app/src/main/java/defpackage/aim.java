package defpackage;

/* renamed from: aim reason: default package */
public final /* synthetic */ class aim implements java.lang.Runnable {
    private final android.content.Context a;
    private final defpackage.anc b;
    private final android.accounts.Account c;
    private final android.os.Bundle d;
    private final android.os.Messenger e;

    public aim(com.google.android.apps.tasks.addtotasks.AddToTasksBroadcastReceiver addToTasksBroadcastReceiver, android.content.Context context, defpackage.anc anc, android.accounts.Account account, android.os.Bundle bundle, android.os.Messenger messenger) {
        this.a = context;
        this.b = anc;
        this.c = account;
        this.d = bundle;
        this.e = messenger;
    }

    public final void run() {
        android.content.Context context = this.a;
        defpackage.anc anc = this.b;
        android.accounts.Account account = this.c;
        android.os.Bundle bundle = this.d;
        android.os.Messenger messenger = this.e;
        java.lang.String a2 = com.google.android.apps.tasks.addtotasks.AddToTasksBroadcastReceiver.a(context, anc, account);
        java.lang.String str = null;
        if (android.text.TextUtils.isEmpty(a2)) {
            defpackage.azb.a("Failed to find task list, even after requesting a sync!", new java.lang.Object[0]);
        } else {
            defpackage.ain.b(context, account.name).a(a2);
            str = com.google.android.apps.tasks.addtotasks.AddToTasksBroadcastReceiver.a(context, anc, a2, bundle);
        }
        com.google.android.apps.tasks.addtotasks.AddToTasksBroadcastReceiver.a(messenger, a2, str);
    }
}
