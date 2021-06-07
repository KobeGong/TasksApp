package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.tasks.R;

/* renamed from: ats  reason: default package */
/* compiled from: PG */
public final class ats extends afc {
    private final LayerDrawable a;
    private final int b;
    private final int c;

    public ats(Context context) {
        this((LayerDrawable) ob.a(context, (int) R.drawable.horizontal_separator), (int) context.getResources().getDimension(R.dimen.default_separator_height), (int) context.getResources().getDimension(R.dimen.task_item_subtask_start_to_border));
    }

    private ats(LayerDrawable layerDrawable, int i, int i2) {
        this.a = layerDrawable;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.afc
    public final void a(Rect rect, View view, RecyclerView recyclerView) {
        afv b2 = recyclerView.b(view);
        if (a(b2)) {
            if (a(recyclerView, b2.d())) {
                rect.bottom = this.b;
            }
        } else if (!(b2 instanceof atp) && !(b2 instanceof atk)) {
            rect.bottom = this.b;
        }
    }

    private static boolean a(RecyclerView recyclerView, int i) {
        boolean z;
        if (i == recyclerView.k.a() - 1) {
            z = true;
        } else {
            z = false;
        }
        return z || recyclerView.k.b(i + 1) == 0;
    }

    @Override // defpackage.afc
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        atg atg = (atg) recyclerView.k;
        boolean z = sn.a.j(recyclerView) == 1;
        int width = recyclerView.getWidth();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            afv b2 = recyclerView.b(childAt);
            if (!(b2 instanceof atp) && !(b2 instanceof atk)) {
                if (!a(b2)) {
                    int bottom = childAt.getBottom() + ((int) childAt.getTranslationY());
                    int i3 = bottom + this.b;
                    int i4 = 0;
                    if (!((atg instanceof atv) && ((atv) atg).l(RecyclerView.d(childAt)))) {
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

    private final void a(Canvas canvas, int i, View view, int i2, int i3, int i4, int i5, int i6) {
        this.a.getDrawable(0).setBounds(i6, i2, i + i6, i3);
        this.a.getDrawable(1).setBounds(i4 + i6, i2, i5 + i6, i3);
        this.a.setAlpha((int) (255.0f * view.getAlpha()));
        this.a.draw(canvas);
    }

    private static boolean a(afv afv) {
        boolean z;
        if (afv instanceof atx) {
            atx atx = (atx) afv;
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
