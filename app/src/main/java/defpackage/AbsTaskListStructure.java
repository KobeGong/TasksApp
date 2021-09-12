package defpackage;

/* renamed from: ajq reason: default package */
/* compiled from: PG */
public abstract class AbsTaskListStructure {
    public abstract java.util.List<dby> getTasks();

    public abstract defpackage.dce getStructure();

    public abstract long getLastSyncedMs();

    public static AbsTaskListStructure a(java.util.List<dby> list, defpackage.dce dce, long j) {
        return new TaskListStructure(defpackage.csp.a(list), dce, j);
    }

    public static AbsTaskListStructure d() {
        return new TaskListStructure(java.util.Collections.emptyList(), defpackage.dce.b, 0);
    }
}
