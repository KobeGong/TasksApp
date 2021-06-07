package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: wo  reason: default package */
/* compiled from: PG */
public abstract class wo {
    public static int a = -1;

    static wo a(Context context, Window window, wn wnVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ws(context, window, wnVar);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return new wx(context, window, wnVar);
        }
        return new wu(context, window, wnVar);
    }

    public abstract View a(int i);

    public abstract wa a();

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(int i);

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public abstract boolean c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract boolean k();

    wo() {
    }
}
