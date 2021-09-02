package android.support.v7.app;

/* compiled from: PG */
public final class AlertController {
    public int A = -1;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public android.os.Handler F;
    public final android.view.View.OnClickListener G = new defpackage.wd(this);
    public final android.content.Context a;
    public final defpackage.xg b;
    public final android.view.Window c;
    public final int d;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public android.widget.ListView g;
    public android.widget.Button h;
    public java.lang.CharSequence i;
    public android.os.Message j;
    public android.graphics.drawable.Drawable k;
    public android.widget.Button l;
    public java.lang.CharSequence m;
    public android.os.Message n;
    public android.graphics.drawable.Drawable o;
    public android.widget.Button p;
    public java.lang.CharSequence q;
    public android.os.Message r;
    public android.graphics.drawable.Drawable s;
    public android.support.v4.widget.NestedScrollView t;
    public android.graphics.drawable.Drawable u;
    public android.widget.ImageView v;
    public android.widget.TextView w;
    public android.widget.TextView x;
    public android.view.View y;
    public android.widget.ListAdapter z;

    /* compiled from: PG */
    public class RecycleListView extends android.widget.ListView {
        public final int a;
        public final int b;

        public RecycleListView(android.content.Context context) {
            this(context, null);
        }

        public RecycleListView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.bL);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(defpackage.xu.bM, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(defpackage.xu.bN, -1);
        }
    }

    public AlertController(android.content.Context context, defpackage.xg xgVar, android.view.Window window) {
        this.a = context;
        this.b = xgVar;
        this.c = window;
        this.F = new defpackage.wj(xgVar);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, defpackage.xu.D, 2130772222, 0);
        this.B = obtainStyledAttributes.getResourceId(defpackage.xu.E, 0);
        obtainStyledAttributes.getResourceId(defpackage.xu.G, 0);
        this.C = obtainStyledAttributes.getResourceId(defpackage.xu.I, 0);
        obtainStyledAttributes.getResourceId(defpackage.xu.J, 0);
        obtainStyledAttributes.getResourceId(defpackage.xu.L, 0);
        this.D = obtainStyledAttributes.getResourceId(defpackage.xu.H, 0);
        this.E = obtainStyledAttributes.getBoolean(defpackage.xu.K, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(defpackage.xu.F, 0);
        obtainStyledAttributes.recycle();
        xgVar.a();
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.e = charSequence;
        if (this.w != null) {
            this.w.setText(charSequence);
        }
    }

    public final void a(int i2, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener, android.os.Message message) {
        if (onClickListener != null) {
            message = this.F.obtainMessage(i2, onClickListener);
        }
        switch (i2) {
            case -3:
                this.q = charSequence;
                this.r = message;
                this.s = null;
                return;
            case -2:
                this.m = charSequence;
                this.n = message;
                this.o = null;
                return;
            case -1:
                this.i = charSequence;
                this.j = message;
                this.k = null;
                return;
            default:
                throw new java.lang.IllegalArgumentException("Button does not exist");
        }
    }

    public static android.view.ViewGroup a(android.view.View view, android.view.View view2) {
        android.view.View view3;
        android.view.View view4;
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view4 = ((android.view.ViewStub) view2).inflate();
            } else {
                view4 = view2;
            }
            return (android.view.ViewGroup) view4;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view3 = ((android.view.ViewStub) view).inflate();
        } else {
            view3 = view;
        }
        return (android.view.ViewGroup) view3;
    }

    public static void a(android.view.View view, android.view.View view2, android.view.View view3) {
        int i2 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public static void a(android.widget.Button button) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
