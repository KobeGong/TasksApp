package defpackage;

@java.lang.Deprecated
/* renamed from: ee reason: default package */
/* compiled from: PG */
public class ee extends defpackage.xg {
    public boolean a;
    public boolean b;
    public boolean c;
    private android.support.design.bottomsheet.BottomSheetBehavior d;
    private defpackage.ea e;

    public ee(android.content.Context context, int i) {
        if (i == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (context.getTheme().resolveAttribute(2130771970, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = 2132017584;
            }
        }
        super(context, i);
        this.a = true;
        this.b = true;
        this.e = new defpackage.ea(this);
        a();
    }

    public void setContentView(int i) {
        super.setContentView(a(i, null, null));
    }

    /* access modifiers changed from: protected */
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void setContentView(android.view.View view) {
        super.setContentView(a(0, view, null));
    }

    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.a != z) {
            this.a = z;
            if (this.d != null) {
                this.d.e = z;
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (this.d != null) {
            this.d.b(4);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.a) {
            this.a = true;
        }
        this.b = z;
        this.c = true;
    }

    private final android.view.View a(int i, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(getContext(), 2131034156, null);
        android.support.design.widget.CoordinatorLayout coordinatorLayout = (android.support.design.widget.CoordinatorLayout) frameLayout.findViewById(2131755280);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) coordinatorLayout.findViewById(2131755282);
        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (!(layoutParams2 instanceof defpackage.ha)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        defpackage.gx gxVar = ((defpackage.ha) layoutParams2).a;
        if (!(gxVar instanceof android.support.design.bottomsheet.BottomSheetBehavior)) {
            throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        this.d = (android.support.design.bottomsheet.BottomSheetBehavior) gxVar;
        this.d.k = this.e;
        this.d.e = this.a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(2131755281).setOnClickListener(new defpackage.ef(this));
        defpackage.sn.a((android.view.View) frameLayout2, (defpackage.rn) new defpackage.eg(this));
        frameLayout2.setOnTouchListener(new defpackage.eh());
        return frameLayout;
    }

    public ee(android.content.Context context, int i, byte b2) {
        this(context, i);
    }
}
