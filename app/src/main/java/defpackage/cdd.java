package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* renamed from: cdd  reason: default package */
/* compiled from: PG */
final class cdd extends AsyncTask {
    @SuppressLint({"StaticFieldLeak"})
    private final Context a;
    private final WeakReference b;

    cdd(Context context, cdc cdc) {
        this.a = context.getApplicationContext();
        this.b = new WeakReference(cdc);
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        cdc cdc = (cdc) this.b.get();
        if (cdc != null) {
            cdc.b = sharedPreferences.getString("selected_account_id", null);
            cdc.c = sharedPreferences.getString("first_recent_account_id", null);
            cdc.d = sharedPreferences.getString("second_recent_account_id", null);
            cdc.a = sharedPreferences;
            cdc.g();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.a.getSharedPreferences("accountmenu.AccountSelectionRestorer.selectedAccount", 0);
    }
}
