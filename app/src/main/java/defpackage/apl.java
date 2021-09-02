package defpackage;

/* renamed from: apl reason: default package */
final /* synthetic */ class apl implements java.lang.Runnable {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;
    private final android.graphics.Typeface b;

    apl(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, android.graphics.Typeface typeface) {
        this.a = taskListsActivity;
        this.b = typeface;
    }

    public final void run() {
        com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity = this.a;
        android.graphics.Typeface typeface = this.b;
        if (!taskListsActivity.r()) {
            defpackage.ew ewVar = taskListsActivity.collapsingToolbarLayout.c;
            if (ewVar.l != typeface) {
                ewVar.l = typeface;
                ewVar.c();
            }
            defpackage.ew ewVar2 = taskListsActivity.collapsingToolbarLayout.c;
            if (ewVar2.k != typeface) {
                ewVar2.k = typeface;
                ewVar2.c();
            }
        }
    }
}
