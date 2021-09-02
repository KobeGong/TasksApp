package defpackage;

/* renamed from: di reason: default package */
/* compiled from: PG */
public class di extends defpackage.gx {
    private defpackage.dj a;
    private int b = 0;

    public di() {
    }

    public di(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        b(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new defpackage.dj(view);
        }
        this.a.a();
        if (this.b != 0) {
            this.a.a(this.b);
            this.b = 0;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        coordinatorLayout.a(view, i);
    }

    public final boolean a_(int i) {
        if (this.a != null) {
            return this.a.a(i);
        }
        this.b = i;
        return false;
    }

    public final int c() {
        if (this.a != null) {
            return this.a.b;
        }
        return 0;
    }
}
