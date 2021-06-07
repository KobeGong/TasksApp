package defpackage;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: aqs  reason: default package */
final /* synthetic */ class aqs implements DialogInterface.OnClickListener {
    private final aql a;
    private final Intent b;

    aqs(aql aql, Intent intent) {
        this.a = aql;
        this.b = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(this.b);
    }
}
