package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apg  reason: default package */
public final /* synthetic */ class apg implements DialogInterface.OnClickListener {
    private final String a;
    private final auj b;

    public apg(TaskListsActivity taskListsActivity, String str, auj auj) {
        this.a = str;
        this.b = auj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.a;
        auj auj = this.b;
        any.a().c().e(str);
        auj.a(str, auj.Y, true);
    }
}
