package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: aoz  reason: default package */
public final /* synthetic */ class aoz implements DialogInterface.OnClickListener {
    private final TaskListsActivity a;

    public aoz(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        kq.a(this.a, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
    }
}
