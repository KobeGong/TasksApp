package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: ahj  reason: default package */
/* compiled from: PG */
public final class ahj {
    public final Context a;
    public final View b;
    public final TextView c;
    public final WindowManager.LayoutParams d = new WindowManager.LayoutParams();
    public final Rect e = new Rect();
    public final int[] f = new int[2];
    public final int[] g = new int[2];

    ahj(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(this.a).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.c = (TextView) this.b.findViewById(R.id.message);
        this.d.setTitle(getClass().getSimpleName());
        this.d.packageName = this.a.getPackageName();
        this.d.type = 1002;
        this.d.width = -2;
        this.d.height = -2;
        this.d.format = -3;
        this.d.windowAnimations = 2132017162;
        this.d.flags = 24;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (b()) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.b.getParent() != null;
    }
}
