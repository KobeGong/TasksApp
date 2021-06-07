package defpackage;

/* renamed from: auq  reason: default package */
final /* synthetic */ class auq implements Runnable {
    private final auj a;

    auq(auj auj) {
        this.a = auj;
    }

    public final void run() {
        auj auj = this.a;
        if (auj.O()) {
            auj.J.post(new aur(auj));
        }
    }
}
