package defpackage;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;

/* renamed from: anb  reason: default package */
/* compiled from: PG */
public final class anb extends AbstractThreadedSyncAdapter {
    public anb(Context context) {
        super(context, true);
    }

    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        cyi a;
        String a2 = azb.a(account.name);
        new Object[1][0] = a2;
        anc b = any.get().b(account);
        synchronized (b) {
            a = b.a("sync", new ano(b));
        }
        try {
            a.get();
            syncResult.stats.numUpdates++;
        } catch (InterruptedException | ExecutionException e) {
            syncResult.stats.numIoExceptions++;
        }
        new Object[1][0] = a2;
    }
}
