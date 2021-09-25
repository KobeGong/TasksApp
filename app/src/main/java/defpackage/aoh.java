package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: aoh reason: default package */
/* compiled from: PG */
public final class aoh implements defpackage.aoe, java.lang.Runnable {
    public final defpackage.aoj b;
    private final defpackage.cyu c;
    private final defpackage.aoe d;

    public aoh(defpackage.aoj aoj) {
        this(new defpackage.aok(), aoj);
    }

    public aoh(defpackage.aoe aoe, defpackage.aoj aoj) {
        this.d = aoe;
        this.c = new defpackage.cyu();
        this.b = aoj;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                b.a(aoh.this);
            }
        });
        defpackage.cyd.c(this.c);
    }

    public final java.lang.String a(android.content.Context context) {
        return this.d.a(context);
    }

    public final void a(java.lang.String str) {
        this.d.a(str);
        this.c.a((java.lang.Object) null);
    }

    public final AbsActivityConfig a(android.content.Context context, java.lang.String str) {
        AbsActivityConfig a = this.d.a(context, str);
        this.c.a((java.lang.Object) null);
        return a;
    }
}
