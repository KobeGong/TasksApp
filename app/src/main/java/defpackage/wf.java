package defpackage;

/* renamed from: wf reason: default package */
/* compiled from: PG */
final class wf implements java.lang.Runnable {
    private final /* synthetic */ android.view.View a;
    private final /* synthetic */ android.view.View b;
    private final /* synthetic */ android.support.v7.app.AlertController c;

    wf(android.support.v7.app.AlertController alertController, android.view.View view, android.view.View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    public final void run() {
        android.support.v7.app.AlertController.a(this.c.t, this.a, this.b);
    }
}
