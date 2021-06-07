package defpackage;

import android.app.Application;

/* renamed from: dmo  reason: default package */
/* compiled from: PG */
public abstract class dmo extends Application {
    public volatile boolean f;

    public dmo() {
        this.f = true;
    }

    public abstract dmm a();

    public void onCreate() {
        super.onCreate();
        if (this.f) {
            synchronized (this) {
                if (this.f) {
                    a().a(this);
                    if (this.f) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    public dmo(byte b) {
        this();
    }
}
