package defpackage;

/* renamed from: anb reason: default package */
/* compiled from: PG */
public final class anb extends android.content.AbstractThreadedSyncAdapter {
    public anb(android.content.Context context) {
        super(context, true);
    }

    public final void onPerformSync(android.accounts.Account account, android.os.Bundle bundle, java.lang.String str, android.content.ContentProviderClient contentProviderClient, android.content.SyncResult syncResult) {
        defpackage.cyi a;
        java.lang.String a2 = defpackage.azb.a(account.name);
        new java.lang.Object[1][0] = a2;
        defpackage.anc b = defpackage.any.a().b(account);
        synchronized (b) {
            a = b.a("sync", (defpackage.csd) new defpackage.ano(b));
        }
        try {
            a.get();
            syncResult.stats.numUpdates++;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            syncResult.stats.numIoExceptions++;
        }
        new java.lang.Object[1][0] = a2;
    }
}
