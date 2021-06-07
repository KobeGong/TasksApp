package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;

/* renamed from: ng  reason: default package */
/* compiled from: PG */
public final class ng extends nk {
    public Bitmap a;

    @Override // defpackage.nk
    public final void a(ne neVar) {
        new Notification.BigPictureStyle(neVar.a).setBigContentTitle(this.b).bigPicture(this.a);
    }
}
