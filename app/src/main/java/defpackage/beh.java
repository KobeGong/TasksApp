package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.util.Log;

/* renamed from: beh  reason: default package */
/* compiled from: PG */
public abstract class beh implements DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    public abstract void a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
