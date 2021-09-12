package defpackage;

/* renamed from: auo reason: default package */
final /* synthetic */ class auo implements java.util.concurrent.Callable {
    private final TasksFragment a;

    auo(TasksFragment auj) {
        this.a = auj;
    }

    public final java.lang.Object call() {
        TasksFragment auj = this.a;
        if (auj.rootView != null) {
            auj.rootView.post(new defpackage.aut(auj));
        }
        return null;
    }
}
