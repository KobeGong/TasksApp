package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;

/* renamed from: wf  reason: default package */
/* compiled from: PG */
final class wf implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ View b;
    private final /* synthetic */ AlertController c;

    wf(AlertController alertController, View view, View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    public final void run() {
        AlertController.a(this.c.t, this.a, this.b);
    }
}