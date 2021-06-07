package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public final class AlertController {
    public int A = -1;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public Handler F;
    public final View.OnClickListener G = new wd(this);
    public final Context a;
    public final xg b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public Button h;
    public CharSequence i;
    public Message j;
    public Drawable k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Drawable o;
    public Button p;
    public CharSequence q;
    public Message r;
    public Drawable s;
    public NestedScrollView t;
    public Drawable u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public View y;
    public ListAdapter z;

    public AlertController(Context context, xg xgVar, Window window) {
        this.a = context;
        this.b = xgVar;
        this.c = window;
        this.F = new wj(xgVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, xu.D, R.attr.alertDialogStyle, 0);
        this.B = obtainStyledAttributes.getResourceId(xu.E, 0);
        obtainStyledAttributes.getResourceId(xu.G, 0);
        this.C = obtainStyledAttributes.getResourceId(xu.I, 0);
        obtainStyledAttributes.getResourceId(xu.J, 0);
        obtainStyledAttributes.getResourceId(xu.L, 0);
        this.D = obtainStyledAttributes.getResourceId(xu.H, 0);
        this.E = obtainStyledAttributes.getBoolean(xu.K, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(xu.F, 0);
        obtainStyledAttributes.recycle();
        xgVar.a();
    }

    /* compiled from: PG */
    public class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.bL);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(xu.bM, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(xu.bN, -1);
        }
    }

    public final void a(CharSequence charSequence) {
        this.e = charSequence;
        if (this.w != null) {
            this.w.setText(charSequence);
        }
    }

    public final void a(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
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
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public static ViewGroup a(View view, View view2) {
        View view3;
        View view4;
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view4 = ((ViewStub) view2).inflate();
            } else {
                view4 = view2;
            }
            return (ViewGroup) view4;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view3 = ((ViewStub) view).inflate();
        } else {
            view3 = view;
        }
        return (ViewGroup) view3;
    }

    public static void a(View view, View view2, View view3) {
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

    public static void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
