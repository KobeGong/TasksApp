package defpackage;

/* renamed from: apn reason: default package */
public final /* synthetic */ class apn implements OnMenuItemClickListener {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;

    public apn(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r10) {
            r9 = this;
            r2 = 1
            r3 = 0
            com.google.android.apps.tasks.ui.TaskListsActivity r4 = this.a;
            TasksFragment r0 = r4.tasksFragment
            ajr r5 = r0.Y
            dcb r0 = r4.h
            if (r0 == 0) goto L_0x007c
            dcb r0 = r4.h
            java.lang.String r0 = r0.b
            r1 = r0
        L_0x0011:
            TasksFragment r0 = r4.tasksFragment
            boolean r6 = r0.c()
            dcb r0 = r4.h
            if (r0 == 0) goto L_0x0081
            any r0 = defpackage.any.a()
            anc r0 = r0.c()
            dcb r7 = r4.h
            java.lang.String r7 = r7.b
            AbsTaskListStructure r0 = r0.d(r7)
            java.util.List r0 = r0.a()
            java.util.Iterator r7 = r0.iterator()
        L_0x0033:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r7.next()
            dby r0 = (defpackage.dby) r0
            boolean r0 = defpackage.ajd.a(r0)
            if (r0 == 0) goto L_0x0033
            r0 = r2
        L_0x0046:
            if (r0 == 0) goto L_0x0081
            r0 = r2
        L_0x0049:
            BottomSheetMenuDialogFragment r2 = new BottomSheetMenuDialogFragment
            r2.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            if (r5 == 0) goto L_0x005e
            java.lang.String r8 = "taskOrder"
            java.lang.String r5 = r5.name()
            r7.putString(r8, r5)
        L_0x005e:
            if (r1 == 0) goto L_0x0065
            java.lang.String r5 = "selectedTaskList"
            r7.putString(r5, r1)
        L_0x0065:
            java.lang.String r1 = "contentVisible"
            r7.putBoolean(r1, r6)
            java.lang.String r1 = "hasCompletedTasks"
            r7.putBoolean(r1, r0)
            r2.e(r7)
            ln r0 = r4.getSupportFragmentManager()
            java.lang.String r1 = "BottomSheetMenuDialogFragment"
            r2.a(r0, r1)
            return r3
        L_0x007c:
            r0 = 0
            r1 = r0
            goto L_0x0011
        L_0x007f:
            r0 = r3
            goto L_0x0046
        L_0x0081:
            r0 = r3
            goto L_0x0049
    }
}
