package defpackage;

/* renamed from: ajk reason: default package */
/* compiled from: LinkToTask */
public final class LinkToTask extends defpackage.ajo {
    private final java.lang.String account;
    private final java.lang.String taskListId;
    private final java.lang.String taskId;

    public LinkToTask(java.lang.String account, java.lang.String taskListId, java.lang.String taskId) {
        if (account == null) {
            throw new java.lang.NullPointerException("Null account");
        }
        this.account = account;
        if (taskListId == null) {
            throw new java.lang.NullPointerException("Null taskListId");
        }
        this.taskListId = taskListId;
        if (taskId == null) {
            throw new java.lang.NullPointerException("Null taskId");
        }
        this.taskId = taskId;
    }

    public final java.lang.String getAccount() {
        return this.account;
    }

    public final java.lang.String getTaskListId() {
        return this.taskListId;
    }

    public final java.lang.String getTaskId() {
        return this.taskId;
    }

    public final java.lang.String toString() {
        return "LinkToTask{account=" + account + ", taskListId=" + taskListId + ", taskId=" + taskId + "}";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ajo)) {
            return false;
        }
        defpackage.ajo ajo = (defpackage.ajo) obj;
        if (!this.account.equals(ajo.getAccount()) || !this.taskListId.equals(ajo.getTaskListId()) || !this.taskId.equals(ajo.getTaskId())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.account.hashCode() ^ 1000003) * 1000003) ^ this.taskListId.hashCode()) * 1000003) ^ this.taskId.hashCode();
    }
}
