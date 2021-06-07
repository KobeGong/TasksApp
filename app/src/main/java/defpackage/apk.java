package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import android.transition.Fade;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.TaskListsActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: apk  reason: default package */
final /* synthetic */ class apk implements Runnable {
    private final TaskListsActivity a;
    private final aoe b;
    private final cdu c;
    private final cyi d;

    apk(TaskListsActivity taskListsActivity, aoe aoe, cdu cdu, cyi cyi) {
        this.a = taskListsActivity;
        this.b = aoe;
        this.c = cdu;
        this.d = cyi;
    }

    public final void run() {
        aqa d2;
        boolean z;
        Fade fade = null;
        TaskListsActivity taskListsActivity = this.a;
        aoe aoe = this.b;
        cdu cdu = this.c;
        cyi cyi = this.d;
        if (taskListsActivity.r()) {
            aoe.a(cdu.b());
            return;
        }
        taskListsActivity.getWindow().clearFlags(16);
        try {
            if (((ajh) cyi.get()).a()) {
                String b2 = cdu.b();
                boolean z2 = !aiw.b(taskListsActivity.getBaseContext()).a();
                taskListsActivity.p();
                if (!any.a().c().a()) {
                    taskListsActivity.a((String) null);
                }
                any.a().c().c();
                lc lcVar = taskListsActivity.n;
                if ((!(lcVar instanceof aqa) || !z2) && Build.VERSION.SDK_INT >= 21) {
                    fade = new Fade();
                }
                if (!taskListsActivity.l && (lcVar instanceof arb)) {
                    ((arb) lcVar).O();
                }
                if (lcVar == null || (lcVar instanceof aqa)) {
                    taskListsActivity.c().e();
                    if (lcVar != null) {
                        lcVar.b(fade);
                        taskListsActivity.i.a_(fade);
                    }
                    taskListsActivity.c().a().a(R.id.fragment_container, taskListsActivity.i, "tasksfragment").c();
                    taskListsActivity.b(taskListsActivity.i);
                }
                List<dcb> d3 = any.a().c().d();
                HashSet hashSet = new HashSet();
                for (dcb dcb : d3) {
                    hashSet.add(dcb.b);
                }
                ain b3 = ain.b(taskListsActivity, b2);
                ArrayList arrayList = new ArrayList();
                for (String str : b3.a.getAll().keySet()) {
                    if (str.startsWith("task-list-order:") && !hashSet.contains(str.substring(16))) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    SharedPreferences.Editor edit = b3.a.edit();
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        edit.remove((String) obj);
                    }
                    edit.apply();
                }
                taskListsActivity.l = true;
                aof a2 = aoe.a(taskListsActivity, b2);
                String a3 = a2.a();
                if (a3 != null && !a3.equals(taskListsActivity.h.b)) {
                    for (dcb dcb2 : d3) {
                        if (a3.equals(dcb2.b)) {
                            taskListsActivity.b(dcb2);
                        }
                    }
                }
                lc b4 = a2.b();
                if (b4 != null) {
                    taskListsActivity.c().e();
                    taskListsActivity.a(b4);
                } else if (z2) {
                    taskListsActivity.c().e();
                    if (lcVar instanceof aqa) {
                        taskListsActivity.c().b();
                        d2 = (aqa) lcVar;
                        d2.e(bg.Q);
                        d2.a_(null);
                        d2.b((Object) null);
                        z = true;
                    } else {
                        d2 = aqa.d(bg.Q);
                        z = false;
                    }
                    taskListsActivity.b(d2);
                    mj a4 = taskListsActivity.c().a();
                    a4.a(R.id.fragment_container, d2, "cannotInitializeAccount");
                    a4.a();
                    a4.c();
                    if (z) {
                        taskListsActivity.c().b();
                    }
                } else if (lcVar instanceof auj) {
                    taskListsActivity.b(taskListsActivity.i);
                }
            } else {
                taskListsActivity.b(bg.P);
                aoe.a(cdu.b());
            }
        } catch (Exception e) {
            taskListsActivity.b(bg.P);
            aoe.a(cdu.b());
        }
    }
}
