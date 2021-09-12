package defpackage;

/* renamed from: dj reason: default package */
/* compiled from: PG */
public final class ViewOffsetHelper {
    public int a;
    public int b;
    private final android.view.View c;
    private int d;

    public ViewOffsetHelper(android.view.View view) {
        this.c = view;
    }

    public final void a() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
        b();
    }

    private final void b() {
        ViewCompat.b(this.c, this.b - (this.c.getTop() - this.a));
        ViewCompat.c(this.c, 0 - (this.c.getLeft() - this.d));
    }

    public final boolean setTopAndBottomOffset(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        b();
        return true;
    }
}
