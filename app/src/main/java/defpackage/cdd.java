package defpackage;

/* renamed from: cdd reason: default package */
/* compiled from: PG */
final class cdd extends android.os.AsyncTask {
    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private final android.content.Context a;
    private final java.lang.ref.WeakReference b;

    cdd(android.content.Context context, defpackage.cdc cdc) {
        this.a = context.getApplicationContext();
        this.b = new java.lang.ref.WeakReference(cdc);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(java.lang.Object obj) {
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) obj;
        defpackage.cdc cdc = (defpackage.cdc) this.b.get();
        if (cdc != null) {
            cdc.b = sharedPreferences.getString("selected_account_id", null);
            cdc.c = sharedPreferences.getString("first_recent_account_id", null);
            cdc.d = sharedPreferences.getString("second_recent_account_id", null);
            cdc.a = sharedPreferences;
            cdc.g();
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        return this.a.getSharedPreferences("accountmenu.AccountSelectionRestorer.selectedAccount", 0);
    }
}
