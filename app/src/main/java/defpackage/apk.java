package defpackage;

import android.transition.Fade;

import com.google.android.apps.tasks.R;

/* renamed from: apk reason: default package */
final /* synthetic */ class apk implements java.lang.Runnable {
    private final com.google.android.apps.tasks.ui.TaskListsActivity a;
    private final defpackage.aoe b;
    private final defpackage.cdu c;
    private final defpackage.cyi d;

    apk(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, defpackage.aoe aoe, defpackage.cdu cdu, defpackage.cyi cyi) {
        this.a = taskListsActivity;
        this.b = aoe;
        this.c = cdu;
        this.d = cyi;
    }

    public final void run() {
        WelcomeFragment d2;
        boolean z;
        java.lang.Object obj = null;
        com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity = this.a;
        defpackage.aoe aoe = this.b;
        defpackage.cdu cdu = this.c;
        defpackage.cyi cyi = this.d;
        if (taskListsActivity.r()) {
            aoe.a(cdu.b());
            return;
        }
        taskListsActivity.getWindow().clearFlags(16);
        try {
            if (((defpackage.ajh) cyi.get()).a()) {
                java.lang.String b2 = cdu.b();
                boolean z2 = !defpackage.aiw.b(taskListsActivity.getBaseContext()).a();
                taskListsActivity.p();
                if (!defpackage.any.a().c().a()) {
                    taskListsActivity.a((java.lang.String) null);
                }
                defpackage.any.a().c().c();
                Fragment lcVar = taskListsActivity.n;
                if ((!(lcVar instanceof WelcomeFragment) || !z2) && android.os.Build.VERSION.SDK_INT >= 21) {
                    obj = new Fade();
                }
                if (!taskListsActivity.l && (lcVar instanceof defpackage.arb)) {
                    ((defpackage.arb) lcVar).O();
                }
                if (lcVar == null || (lcVar instanceof WelcomeFragment)) {
                    taskListsActivity.getSupportFragmentManager().e();
                    if (lcVar != null) {
                        lcVar.b(obj);
                        taskListsActivity.tasksFragment.a_(obj);
                    }
                    taskListsActivity.getSupportFragmentManager()
                            .a().a(R.id.fragment_container, taskListsActivity.tasksFragment, "tasksfragment").c();
                    taskListsActivity.b(taskListsActivity.tasksFragment);
                }
                java.util.List<defpackage.dcb> d3 = defpackage.any.a().c().d();
                java.util.HashSet hashSet = new java.util.HashSet();
                for (defpackage.dcb dcb : d3) {
                    hashSet.add(dcb.b);
                }
                defpackage.ain b3 = defpackage.ain.b(taskListsActivity, b2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : b3.a.getAll().keySet()) {
                    if (str.startsWith("task-list-order:") && !hashSet.contains(str.substring(16))) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    android.content.SharedPreferences.Editor edit = b3.a.edit();
                    java.util.ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj2 = arrayList2.get(i);
                        i++;
                        edit.remove((java.lang.String) obj2);
                    }
                    edit.apply();
                }
                taskListsActivity.l = true;
                defpackage.aof a2 = aoe.a(taskListsActivity, b2);
                java.lang.String a3 = a2.a();
                if (a3 != null && !a3.equals(taskListsActivity.h.b)) {
                    for (defpackage.dcb dcb2 : d3) {
                        if (a3.equals(dcb2.b)) {
                            taskListsActivity.b(dcb2);
                        }
                    }
                }
                Fragment b4 = a2.b();
                if (b4 != null) {
                    taskListsActivity.getSupportFragmentManager().e();
                    taskListsActivity.a(b4);
                } else if (z2) {
                    taskListsActivity.getSupportFragmentManager().e();
                    if (lcVar instanceof WelcomeFragment) {
                        taskListsActivity.getSupportFragmentManager().b();
                        d2 = (WelcomeFragment) lcVar;
                        d2.e(defpackage.bg.Q);
                        d2.a_(null);
                        d2.b((java.lang.Object) null);
                        z = true;
                    } else {
                        d2 = WelcomeFragment.d(defpackage.bg.Q);
                        z = false;
                    }
                    taskListsActivity.b((Fragment) d2);
                    defpackage.mj a4 = taskListsActivity.getSupportFragmentManager().a();
                    a4.a(2131755276, d2, "cannotInitializeAccount");
                    a4.a();
                    a4.c();
                    if (z) {
                        taskListsActivity.getSupportFragmentManager().b();
                    }
                } else if (lcVar instanceof TasksFragment) {
                    taskListsActivity.b((Fragment) taskListsActivity.tasksFragment);
                }
            } else {
                taskListsActivity.b(defpackage.bg.P);
                aoe.a(cdu.b());
            }
        } catch (java.lang.Exception e) {
            taskListsActivity.b(defpackage.bg.P);
            aoe.a(cdu.b());
        }
    }
}
