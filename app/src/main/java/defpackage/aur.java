package defpackage;

/* renamed from: aur reason: default package */
final /* synthetic */ class aur implements java.lang.Runnable {
    private final TasksFragment a;

    aur(TasksFragment auj) {
        this.a = auj;
    }

    public final void run() {
        TasksFragment auj = this.a;
        auj.a(false);
        auj.flattenSubtasksView.setEnabled(true);
    }
}
