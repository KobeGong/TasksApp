package defpackage;

/* renamed from: ajm reason: default package */
/* compiled from: PG */
final class TaskListStructure extends AbsTaskListStructure {
    private final java.util.List<dby> tasks;
    private final defpackage.dce structure;
    private final long lastSyncedMs;

    TaskListStructure(java.util.List<dby> tasks, defpackage.dce structure, long lastSyncedMs) {
        if (tasks == null) {
            throw new java.lang.NullPointerException("Null tasks");
        }
        this.tasks = tasks;
        if (structure == null) {
            throw new java.lang.NullPointerException("Null structure");
        }
        this.structure = structure;
        this.lastSyncedMs = lastSyncedMs;
    }

    public final java.util.List<dby> getTasks() {
        return this.tasks;
    }

    public final defpackage.dce getStructure() {
        return this.structure;
    }

    public final long getLastSyncedMs() {
        return this.lastSyncedMs;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.tasks);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.structure);
        return "TaskListStructure{tasks=" + valueOf + ", structure=" + valueOf2 + ", lastSyncedMs=" + this.lastSyncedMs + "}";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbsTaskListStructure)) {
            return false;
        }
        AbsTaskListStructure ajq = (AbsTaskListStructure) obj;
        if (!this.tasks.equals(ajq.getTasks()) || !this.structure.equals(ajq.getStructure()) || this.lastSyncedMs != ajq.getLastSyncedMs()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.tasks.hashCode() ^ 1000003) * 1000003) ^ this.structure.hashCode()) * 1000003) ^ ((int) ((this.lastSyncedMs >>> 32) ^ this.lastSyncedMs));
    }
}
