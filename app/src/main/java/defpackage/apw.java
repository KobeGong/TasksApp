package defpackage;

import com.google.android.apps.tasks.ui.TaskListsActivity;
import java.util.List;

/* renamed from: apw  reason: default package */
/* compiled from: PG */
public final class apw extends cdm {
    public final /* synthetic */ TaskListsActivity a;

    public apw(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    @Override // defpackage.cdm
    public final void a(List list, List list2) {
        this.a.runOnUiThread(new apx(this));
    }
}
