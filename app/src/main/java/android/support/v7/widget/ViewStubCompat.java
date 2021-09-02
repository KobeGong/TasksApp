package android.support.v7.widget;

/* compiled from: PG */
public final class ViewStubCompat extends android.view.View {
    public android.view.LayoutInflater a;
    private int b;
    private int c;
    private java.lang.ref.WeakReference d;

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.dh, i, 0);
        this.c = obtainStyledAttributes.getResourceId(defpackage.xu.dj, -1);
        this.b = obtainStyledAttributes.getResourceId(defpackage.xu.dk, 0);
        setId(obtainStyledAttributes.getResourceId(defpackage.xu.di, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @android.annotation.SuppressLint({"MissingSuperCall"})
    public final void draw(android.graphics.Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    public final void setVisibility(int i) {
        if (this.d != null) {
            android.view.View view = (android.view.View) this.d.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new java.lang.IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    public final android.view.View a() {
        android.view.LayoutInflater from;
        android.view.ViewParent parent = getParent();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.b != 0) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if (this.a != null) {
                from = this.a;
            } else {
                from = android.view.LayoutInflater.from(getContext());
            }
            android.view.View inflate = from.inflate(this.b, viewGroup, false);
            if (this.c != -1) {
                inflate.setId(this.c);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.d = new java.lang.ref.WeakReference(inflate);
            return inflate;
        } else {
            throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }
}
