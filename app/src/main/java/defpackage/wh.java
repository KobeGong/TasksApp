package defpackage;

/* renamed from: wh reason: default package */
/* compiled from: PG */
final class wh implements java.lang.Runnable {
    private final /* synthetic */ android.view.View a;
    private final /* synthetic */ android.view.View b;
    private final /* synthetic */ android.support.v7.app.AlertController c;

    wh(android.support.v7.app.AlertController alertController, android.view.View view, android.view.View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    public final void run() {
        android.support.v7.app.AlertController.a(this.c.g, this.a, this.b);
    }
}
