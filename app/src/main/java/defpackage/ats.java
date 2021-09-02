package defpackage;

/* renamed from: ats reason: default package */
/* compiled from: PG */
public final class ats extends defpackage.afc {
    private final android.graphics.drawable.LayerDrawable a;
    private final int b;
    private final int c;

    public ats(android.content.Context context) {
        this((android.graphics.drawable.LayerDrawable) defpackage.ob.a(context, 2130837632), (int) context.getResources().getDimension(2131689615), (int) context.getResources().getDimension(2131689887));
    }

    private ats(android.graphics.drawable.LayerDrawable layerDrawable, int i, int i2) {
        this.a = layerDrawable;
        this.b = i;
        this.c = i2;
    }

    public final void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView) {
        defpackage.afv b2 = recyclerView.b(view);
        if (a(b2)) {
            if (a(recyclerView, b2.d())) {
                rect.bottom = this.b;
            }
        } else if (!(b2 instanceof defpackage.atp) && !(b2 instanceof defpackage.atk)) {
            rect.bottom = this.b;
        }
    }

    private static boolean a(android.support.v7.widget.RecyclerView recyclerView, int i) {
        boolean z;
        if (i == recyclerView.k.a() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z || recyclerView.k.b(i + 1) == 0) {
            return true;
        }
        return false;
    }

    public final void b(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        boolean z;
        int i;
        defpackage.atg atg = (defpackage.atg) recyclerView.k;
        if (defpackage.sn.a.j(recyclerView) == 1) {
            z = true;
        } else {
            z = false;
        }
        int width = recyclerView.getWidth();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            defpackage.afv b2 = recyclerView.b(childAt);
            if (!(b2 instanceof defpackage.atp) && !(b2 instanceof defpackage.atk)) {
                if (!a(b2)) {
                    int bottom = childAt.getBottom() + ((int) childAt.getTranslationY());
                    int i3 = bottom + this.b;
                    int i4 = 0;
                    if (!((atg instanceof defpackage.atv) && ((defpackage.atv) atg).l(android.support.v7.widget.RecyclerView.d(childAt)))) {
                        i = width;
                    } else if (z) {
                        i = width - this.c;
                    } else {
                        i4 = this.c;
                        i = width;
                    }
                    a(canvas, width, childAt, bottom, i3, i4, i, (int) childAt.getTranslationX());
                } else if (a(recyclerView, b2.d())) {
                    int bottom2 = childAt.getBottom() + ((int) childAt.getTranslationY());
                    a(canvas, width, childAt, bottom2, bottom2 + this.b, 0, width, 0);
                }
            }
        }
    }

    private final void a(android.graphics.Canvas canvas, int i, android.view.View view, int i2, int i3, int i4, int i5, int i6) {
        this.a.getDrawable(0).setBounds(i6, i2, i + i6, i3);
        this.a.getDrawable(1).setBounds(i4 + i6, i2, i5 + i6, i3);
        this.a.setAlpha((int) (255.0f * view.getAlpha()));
        this.a.draw(canvas);
    }

    private static boolean a(defpackage.afv afv) {
        boolean z;
        if (afv instanceof defpackage.atx) {
            defpackage.atx atx = (defpackage.atx) afv;
            if (atx.q.getParent() == atx.p) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
