package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.tasks.R;
import java.util.List;

/* renamed from: ahy  reason: default package */
/* compiled from: PG */
public abstract class ahy {
    private static final aig a;
    private static final Interpolator b = new ahz();
    private static final Interpolator c = new aia();
    private int d = -1;

    public abstract int a(ViewHolder afv);

    public abstract void a(ViewHolder afv, int i);

    public abstract boolean a(ViewHolder afv, ViewHolder afv2);

    public static int a(int i, int i2) {
        int i3 = i & 789516;
        if (i3 == 0) {
            return i;
        }
        int i4 = (i3 ^ -1) & i;
        if (i2 == 0) {
            return i4 | (i3 << 2);
        }
        return i4 | ((i3 << 1) & -789517) | (((i3 << 1) & 789516) << 2);
    }

    public static int b(int i, int i2) {
        return i2 | i | (i2 << 8) | (i << 16);
    }

    public static int c(int i, int i2) {
        int i3 = i & 3158064;
        if (i3 == 0) {
            return i;
        }
        int i4 = (i3 ^ -1) & i;
        if (i2 == 0) {
            return i4 | (i3 >> 2);
        }
        return i4 | ((i3 >> 1) & -3158065) | (((i3 >> 1) & 3158064) >> 2);
    }

    /* access modifiers changed from: package-private */
    public final int a(RecyclerView recyclerView, ViewHolder afv) {
        return c(a(afv), sn.a.j(recyclerView));
    }

    public static boolean a() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public static int d() {
        return 0;
    }

    public static float e() {
        return 0.5f;
    }

    public static float f() {
        return 0.5f;
    }

    public static float a(float f) {
        return f;
    }

    public static float b(float f) {
        return f;
    }

    public static ViewHolder a(ViewHolder afv, List list, int i, int i2) {
        ViewHolder afv2;
        int i3;
        int i4;
        int i5;
        int i6;
        ViewHolder afv3;
        int bottom;
        int abs;
        int top;
        int left;
        int right;
        int abs2;
        int width = i + afv.a.getWidth();
        int height = i2 + afv.a.getHeight();
        ViewHolder afv4 = null;
        int i7 = -1;
        int left2 = i - afv.a.getLeft();
        int top2 = i2 - afv.a.getTop();
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            ViewHolder afv5 = (ViewHolder) list.get(i8);
            if (left2 <= 0 || (right = afv5.a.getRight() - width) >= 0 || afv5.a.getRight() <= afv.a.getRight() || (abs2 = Math.abs(right)) <= i7) {
                afv2 = afv4;
                i3 = i7;
            } else {
                i3 = abs2;
                afv2 = afv5;
            }
            if (left2 >= 0 || (left = afv5.a.getLeft() - i) <= 0 || afv5.a.getLeft() >= afv.a.getLeft() || (i4 = Math.abs(left)) <= i3) {
                i4 = i3;
            } else {
                afv2 = afv5;
            }
            if (top2 >= 0 || (top = afv5.a.getTop() - i2) <= 0 || afv5.a.getTop() >= afv.a.getTop() || (i5 = Math.abs(top)) <= i4) {
                i5 = i4;
            } else {
                afv2 = afv5;
            }
            if (top2 <= 0 || (bottom = afv5.a.getBottom() - height) >= 0 || afv5.a.getBottom() <= afv.a.getBottom() || (abs = Math.abs(bottom)) <= i5) {
                i6 = i5;
                afv3 = afv2;
            } else {
                afv3 = afv5;
                i6 = abs;
            }
            i8++;
            afv4 = afv3;
            i7 = i6;
        }
        return afv4;
    }

    public void b(ViewHolder afv, int i) {
        if (afv != null) {
            View view = afv.a;
        }
    }

    public static void a(RecyclerView recyclerView, ViewHolder afv, ViewHolder afv2, int i) {
        LayoutManager afd = recyclerView.layoutManager;
        if (afd instanceof aif) {
            ((aif) afd).a(afv.a, afv2.a);
            return;
        }
        if (afd.d()) {
            if (afd.b(afv2.a) <= recyclerView.getPaddingLeft()) {
                recyclerView.c(i);
            }
            if (afd.d(afv2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.c(i);
            }
        }
        if (afd.e()) {
            if (afd.c(afv2.a) <= recyclerView.getPaddingTop()) {
                recyclerView.c(i);
            }
            if (afd.e(afv2.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.c(i);
            }
        }
    }

    public void b(RecyclerView recyclerView, ViewHolder afv) {
        a.a(afv.a);
    }

    public void a(Canvas canvas, RecyclerView recyclerView, ViewHolder afv, float f, float f2, int i, boolean z) {
        a.a(canvas, recyclerView, afv.a, f, f2, i, z);
    }

    public static void b(ViewHolder afv) {
        View view = afv.a;
    }

    public static long a(RecyclerView recyclerView, int i) {
        aey aey = recyclerView.z;
        if (aey == null) {
            return i == 8 ? 200 : 250;
        }
        if (i == 8) {
            return aey.k;
        }
        return aey.j;
    }

    public final int a(RecyclerView recyclerView, int i, int i2, long j) {
        float f = 1.0f;
        if (this.d == -1) {
            this.d = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int signum = (int) (((float) (this.d * ((int) Math.signum((float) i2)))) * c.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
        if (j <= 2000) {
            f = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (b.getInterpolation(f) * ((float) signum));
        if (interpolation != 0) {
            return interpolation;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new aih();
        } else {
            a = new aig();
        }
    }
}
