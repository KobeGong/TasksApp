package defpackage;

/* renamed from: beh reason: default package */
/* compiled from: PG */
public abstract class beh implements android.content.DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    public abstract void a();

    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
