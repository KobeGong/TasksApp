package defpackage;

/* renamed from: auq reason: default package */
final /* synthetic */ class auq implements java.lang.Runnable {
    private final TasksFragment a;

    auq(TasksFragment auj) {
        this.a = auj;
    }

    public final void run() {
        TasksFragment auj = this.a;
        if (auj.O()) {
            auj.J.post(new defpackage.aur(auj));
        }
    }
}
