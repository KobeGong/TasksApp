package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: nz  reason: default package */
/* compiled from: PG */
public abstract class nz extends oc {
    public volatile oa a;
    public long b;
    private final Executor j;
    private volatile oa k;

    public nz(Context context) {
        this(context, oe.b);
    }

    public abstract Object d();

    private nz(Context context, Executor executor) {
        super(context);
        this.b = -10000;
        this.j = executor;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.oc
    public final void a() {
        super.a();
        b();
        this.a = new oa(this);
        c();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.oc
    public final boolean b() {
        Handler handler = null;
        boolean z = false;
        if (this.a != null) {
            if (!this.f) {
                this.i = true;
            }
            if (this.k != null) {
                if (this.a.a) {
                    this.a.a = false;
                    handler.removeCallbacks(this.a);
                }
                this.a = null;
            } else if (this.a.a) {
                this.a.a = false;
                handler.removeCallbacks(this.a);
                this.a = null;
            } else {
                oa oaVar = this.a;
                oaVar.f.set(true);
                z = oaVar.d.cancel(false);
                if (z) {
                    this.k = this.a;
                }
                this.a = null;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        Handler handler = null;
        if (this.k == null && this.a != null) {
            if (this.a.a) {
                this.a.a = false;
                handler.removeCallbacks(this.a);
            }
            if (0 <= 0 || SystemClock.uptimeMillis() >= this.b) {
                oa oaVar = this.a;
                Executor executor = this.j;
                if (oaVar.e != bg.A) {
                    switch (oaVar.e - 1) {
                        case 1:
                            throw new IllegalStateException("Cannot execute task: the task is already running.");
                        case 2:
                            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                        default:
                            throw new IllegalStateException("We should never reach this state");
                    }
                } else {
                    oaVar.e = bg.B;
                    oj ojVar = oaVar.c;
                    executor.execute(oaVar.d);
                }
            } else {
                this.a.a = true;
                handler.postAtTime(this.a, this.b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(oa oaVar) {
        if (this.k == oaVar) {
            this.b = SystemClock.uptimeMillis();
            this.k = null;
            c();
        }
    }

    @Override // defpackage.oc
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            printWriter.println(this.a.a);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.a);
        }
        if (0 != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            rk.a(printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            rk.a(this.b, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
