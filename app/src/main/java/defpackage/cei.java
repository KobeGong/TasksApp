package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.apps.tasks.R;
import java.util.concurrent.Executor;

/* renamed from: cei  reason: default package */
/* compiled from: PG */
public final class cei implements ComponentCallbacks2 {
    public static final ri a = new ri();
    public final cdf b;
    public final cfu c;
    public long d;
    private final Executor e;
    private final Context f;
    private boolean g;
    private long h;

    public cei(Context context, cdf cdf, cfu cfu, Executor executor) {
        this.b = (cdf) cky.a(cdf);
        this.c = (cfu) cky.a(cfu);
        this.e = (Executor) cky.a(executor);
        this.f = ((Context) cky.a((Object) context)).getApplicationContext();
    }

    public final void a() {
        a("open");
        if (!this.g) {
            this.f.registerComponentCallbacks(this);
            this.h++;
            this.g = true;
        }
    }

    public final void b() {
        a("close");
        if (this.g) {
            this.d = this.h;
            this.g = false;
            this.f.unregisterComponentCallbacks(this);
        }
    }

    public final void a(ImageView imageView, Object obj, int i) {
        a("loadImageIntoView");
        cky.b(this.g, "open must be called before loading images");
        long j = this.h;
        this.h = 1 + j;
        cel cel = new cel(this, imageView, obj, i, j);
        a(imageView, cel);
        this.e.execute(new cej(this, cel));
    }

    static void a(ImageView imageView, cel cel) {
        a("resetRequestForView");
        cel cel2 = (cel) imageView.getTag(R.id.tag_account_image_request);
        if (cel2 != null) {
            cel2.c = true;
        }
        imageView.setTag(R.id.tag_account_image_request, cel);
    }

    static void a(String str) {
        cky.b(Looper.getMainLooper() == Looper.myLooper(), String.valueOf(str).concat(" must be called on the UI thread"));
    }

    public final void onTrimMemory(int i) {
        a.clear();
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }
}
