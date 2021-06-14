package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* renamed from: lm  reason: default package */
/* compiled from: PG */
public class lm extends lk {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final lp d;

    lm(FragmentActivity lgVar) {
        this(lgVar, lgVar, lgVar.b);
    }

    private lm(Activity activity, Context context, Handler handler) {
        this.d = new lp();
        this.a = activity;
        this.b = context;
        this.c = handler;
    }

    public void a(String str, PrintWriter printWriter, String[] strArr) {
    }

    public boolean b() {
        return true;
    }

    public LayoutInflater c() {
        return LayoutInflater.from(this.b);
    }

    public void a(lc lcVar, Intent intent, int i) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.b.startActivity(intent);
    }

    public boolean d() {
        return true;
    }

    public int e() {
        return 0;
    }

    @Override // defpackage.lk
    public View a(int i) {
        return null;
    }

    @Override // defpackage.lk
    public boolean a() {
        return true;
    }
}
