package defpackage;

/* renamed from: ahj reason: default package */
/* compiled from: PG */
final class ahj {
    public final android.content.Context a;
    public final android.view.View b;
    public final android.widget.TextView c;
    public final android.view.WindowManager.LayoutParams d = new android.view.WindowManager.LayoutParams();
    public final android.graphics.Rect e = new android.graphics.Rect();
    public final int[] f = new int[2];
    public final int[] g = new int[2];

    ahj(android.content.Context context) {
        this.a = context;
        this.b = android.view.LayoutInflater.from(this.a).inflate(2131034138, null);
        this.c = (android.widget.TextView) this.b.findViewById(2131755222);
        this.d.setTitle(getClass().getSimpleName());
        this.d.packageName = this.a.getPackageName();
        this.d.type = 1002;
        this.d.width = -2;
        this.d.height = -2;
        this.d.format = -3;
        this.d.windowAnimations = 2132017162;
        this.d.flags = 24;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (b()) {
            ((android.view.WindowManager) this.a.getSystemService("window")).removeView(this.b);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.b.getParent() != null;
    }
}
