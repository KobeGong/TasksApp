package android.support.v7.widget;

import defpackage.ViewCompat;

/* compiled from: PG */
public class SearchView extends defpackage.adu implements defpackage.ye {
    public static final defpackage.agk p = new defpackage.agk();
    private final android.content.Intent A;
    private final java.lang.CharSequence B;
    private boolean C;
    private java.lang.CharSequence D;
    private boolean E;
    private int F;
    private boolean G;
    private int H;
    private final java.lang.Runnable I;
    private java.lang.Runnable J;
    private final android.view.View.OnClickListener K;
    private android.view.View.OnKeyListener L;
    private final android.widget.TextView.OnEditorActionListener M;
    private final android.widget.AdapterView.OnItemClickListener N;
    private final android.widget.AdapterView.OnItemSelectedListener O;
    private android.text.TextWatcher P;
    public final android.support.v7.widget.SearchView.SearchAutoComplete a;
    public final android.view.View b;
    public final android.widget.ImageView c;
    public final android.widget.ImageView d;
    public final android.widget.ImageView e;
    public final android.widget.ImageView f;
    public final android.view.View g;
    public android.view.View.OnFocusChangeListener l;
    public boolean m;
    public defpackage.uk n;
    public android.app.SearchableInfo o;
    private final android.view.View q;
    private final android.view.View r;
    private defpackage.ago s;
    private android.graphics.Rect t;
    private android.graphics.Rect u;
    private int[] v;
    private int[] w;
    private final android.widget.ImageView x;
    private final android.graphics.drawable.Drawable y;
    private final android.content.Intent z;

    /* compiled from: PG */
    public class SearchAutoComplete extends defpackage.abf {
        public android.support.v7.widget.SearchView a;
        public boolean b;
        private int c;
        private final java.lang.Runnable d;

        public SearchAutoComplete(android.content.Context context) {
            this(context, null);
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, 2130772230);
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.d = new defpackage.agn(this);
            this.c = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            int i;
            super.onFinishInflate();
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            android.content.res.Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                i = 256;
            } else if (i2 >= 600 || (i2 >= 640 && i3 >= 480)) {
                i = 192;
            } else {
                i = 160;
            }
            setMinWidth((int) android.util.TypedValue.applyDimension(1, (float) i, displayMetrics));
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.c = i;
        }

        /* access modifiers changed from: protected */
        public void replaceText(java.lang.CharSequence charSequence) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.a.hasFocus() && getVisibility() == 0) {
                this.b = true;
                if (android.support.v7.widget.SearchView.a(getContext())) {
                    defpackage.agk agk = android.support.v7.widget.SearchView.p;
                    if (agk.c != null) {
                        try {
                            agk.c.invoke(this, new java.lang.Object[]{java.lang.Boolean.valueOf(true)});
                        } catch (java.lang.Exception e) {
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.a.h();
        }

        public boolean enoughToFilter() {
            return this.c <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.a.clearFocus();
                        a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
            android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.b) {
                removeCallbacks(this.d);
                post(this.d);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: 0000 */
        public final void a(boolean z) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.b = false;
                removeCallbacks(this.d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.b = false;
                removeCallbacks(this.d);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.b = true;
            }
        }
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772197);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new android.graphics.Rect();
        this.u = new android.graphics.Rect();
        this.v = new int[2];
        this.w = new int[2];
        this.I = new defpackage.aga(this);
        this.J = new defpackage.agc(this);
        new java.util.WeakHashMap();
        this.K = new defpackage.agf(this);
        this.L = new defpackage.agg(this);
        this.M = new defpackage.agh(this);
        this.N = new defpackage.agi(this);
        this.O = new defpackage.agj(this);
        this.P = new defpackage.agb(this);
        defpackage.agw a2 = defpackage.agw.a(context, attributeSet, defpackage.xu.bO, i, 0);
        android.view.LayoutInflater.from(context).inflate(a2.g(defpackage.xu.bY, 2131034136), this, true);
        this.a = (android.support.v7.widget.SearchView.SearchAutoComplete) findViewById(2131755216);
        this.a.a = this;
        this.q = findViewById(2131755213);
        this.b = findViewById(2131755215);
        this.r = findViewById(2131755218);
        this.c = (android.widget.ImageView) findViewById(2131755212);
        this.d = (android.widget.ImageView) findViewById(2131755219);
        this.e = (android.widget.ImageView) findViewById(2131755217);
        this.f = (android.widget.ImageView) findViewById(2131755220);
        this.x = (android.widget.ImageView) findViewById(2131755214);
        ViewCompat.a(this.b, a2.a(defpackage.xu.bZ));
        ViewCompat.a(this.r, a2.a(defpackage.xu.cd));
        this.c.setImageDrawable(a2.a(defpackage.xu.cc));
        this.d.setImageDrawable(a2.a(defpackage.xu.bW));
        this.e.setImageDrawable(a2.a(defpackage.xu.bT));
        this.f.setImageDrawable(a2.a(defpackage.xu.cf));
        this.x.setImageDrawable(a2.a(defpackage.xu.cc));
        this.y = a2.a(defpackage.xu.cb);
        defpackage.aaz.a((android.view.View) this.c, (java.lang.CharSequence) getResources().getString(2131951674));
        a2.g(defpackage.xu.ce, 2131034135);
        a2.g(defpackage.xu.bU, 0);
        this.c.setOnClickListener(this.K);
        this.e.setOnClickListener(this.K);
        this.d.setOnClickListener(this.K);
        this.f.setOnClickListener(this.K);
        this.a.setOnClickListener(this.K);
        this.a.addTextChangedListener(this.P);
        this.a.setOnEditorActionListener(this.M);
        this.a.setOnItemClickListener(this.N);
        this.a.setOnItemSelectedListener(this.O);
        this.a.setOnKeyListener(this.L);
        this.a.setOnFocusChangeListener(new defpackage.agd(this));
        boolean a3 = a2.a(defpackage.xu.bX, true);
        if (this.m != a3) {
            this.m = a3;
            a(a3);
            p();
        }
        int e2 = a2.e(defpackage.xu.bS, -1);
        if (e2 != -1) {
            this.F = e2;
            requestLayout();
        }
        this.B = a2.c(defpackage.xu.bV);
        this.D = a2.c(defpackage.xu.ca);
        int a4 = a2.a(defpackage.xu.bQ, -1);
        if (a4 != -1) {
            this.a.setImeOptions(a4);
        }
        int a5 = a2.a(defpackage.xu.bR, -1);
        if (a5 != -1) {
            this.a.setInputType(a5);
        }
        setFocusable(a2.a(defpackage.xu.bP, true));
        a2.b.recycle();
        this.z = new android.content.Intent("android.speech.action.WEB_SEARCH");
        this.z.addFlags(268435456);
        this.z.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.A = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.A.addFlags(268435456);
        this.g = findViewById(this.a.getDropDownAnchor());
        if (this.g != null) {
            this.g.addOnLayoutChangeListener(new defpackage.age(this));
        }
        a(this.m);
        p();
    }

    public boolean requestFocus(int i, android.graphics.Rect rect) {
        if (this.E || !isFocusable()) {
            return false;
        }
        if (this.C) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.a.requestFocus(i, rect);
        if (requestFocus) {
            a(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.E = true;
        super.clearFocus();
        this.a.clearFocus();
        this.a.a(false);
        this.E = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.C) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.F <= 0) {
                    size = java.lang.Math.min(j(), size);
                    break;
                } else {
                    size = java.lang.Math.min(this.F, size);
                    break;
                }
            case 0:
                if (this.F <= 0) {
                    size = j();
                    break;
                } else {
                    size = this.F;
                    break;
                }
            case 1073741824:
                if (this.F > 0) {
                    size = java.lang.Math.min(this.F, size);
                    break;
                }
                break;
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        switch (mode2) {
            case Integer.MIN_VALUE:
                size2 = java.lang.Math.min(k(), size2);
                break;
            case 0:
                size2 = k();
                break;
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            android.support.v7.widget.SearchView.SearchAutoComplete searchAutoComplete = this.a;
            android.graphics.Rect rect = this.t;
            searchAutoComplete.getLocationInWindow(this.v);
            getLocationInWindow(this.w);
            int i5 = this.v[1] - this.w[1];
            int i6 = this.v[0] - this.w[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            this.u.set(this.t.left, 0, this.t.right, i4 - i2);
            if (this.s == null) {
                this.s = new defpackage.ago(this.u, this.t, this.a);
                setTouchDelegate(this.s);
                return;
            }
            this.s.a(this.u, this.t);
        }
    }

    private final int j() {
        return getContext().getResources().getDimensionPixelSize(2131689524);
    }

    private final int k() {
        return getContext().getResources().getDimensionPixelSize(2131689523);
    }

    private final void a(boolean z2) {
        int i;
        int i2 = 0;
        this.C = z2;
        int i3 = z2 ? 0 : 8;
        android.text.TextUtils.isEmpty(this.a.getText());
        this.c.setVisibility(i3);
        l();
        android.view.View view = this.q;
        if (z2) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (this.x.getDrawable() == null || this.m) {
            i2 = 8;
        }
        this.x.setVisibility(i2);
        n();
        q();
        m();
    }

    private final void l() {
        this.d.setVisibility(8);
    }

    private final void m() {
        this.r.setVisibility(8);
    }

    private final void n() {
        boolean z2 = true;
        int i = 0;
        boolean z3 = !android.text.TextUtils.isEmpty(this.a.getText());
        if (!z3 && (!this.m || this.G)) {
            z2 = false;
        }
        android.widget.ImageView imageView = this.e;
        if (!z2) {
            i = 8;
        }
        imageView.setVisibility(i);
        android.graphics.drawable.Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private final void o() {
        post(this.I);
    }

    public final void c() {
        int[] iArr = this.a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        android.graphics.drawable.Drawable background = this.b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        android.graphics.drawable.Drawable background2 = this.r.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.I);
        post(this.J);
        super.onDetachedFromWindow();
    }

    private final void p() {
        java.lang.CharSequence charSequence;
        if (this.D != null) {
            charSequence = this.D;
        } else {
            charSequence = this.B;
        }
        android.support.v7.widget.SearchView.SearchAutoComplete searchAutoComplete = this.a;
        if (charSequence == 0) {
            charSequence = "";
        }
        if (this.m && this.y != null) {
            int textSize = (int) (((double) this.a.getTextSize()) * 1.25d);
            this.y.setBounds(0, 0, textSize, textSize);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new android.text.style.ImageSpan(this.y), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence = spannableStringBuilder;
        }
        searchAutoComplete.setHint(charSequence);
    }

    private final void q() {
        this.f.setVisibility(8);
    }

    public final void a(java.lang.CharSequence charSequence) {
        android.text.TextUtils.isEmpty(this.a.getText());
        l();
        q();
        n();
        m();
        charSequence.toString();
    }

    public final void e() {
        android.text.Editable text = this.a.getText();
        if (text != null && android.text.TextUtils.getTrimmedLength(text) > 0) {
            this.a.a(false);
            this.a.dismissDropDown();
        }
    }

    public final void f() {
        if (!android.text.TextUtils.isEmpty(this.a.getText())) {
            this.a.setText("");
            this.a.requestFocus();
            this.a.a(true);
        } else if (this.m) {
            clearFocus();
            a(true);
        }
    }

    public final void g() {
        a(false);
        this.a.requestFocus();
        this.a.a(true);
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        a(this.C);
        o();
        if (this.a.hasFocus()) {
            i();
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        o();
    }

    public final void b() {
        this.a.setText("");
        this.a.setSelection(this.a.length());
        clearFocus();
        a(true);
        this.a.setImeOptions(this.H);
        this.G = false;
    }

    public final void a() {
        if (!this.G) {
            this.G = true;
            this.H = this.a.getImeOptions();
            this.a.setImeOptions(this.H | 33554432);
            this.a.setText("");
            g();
        }
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        defpackage.agl agl = new defpackage.agl(super.onSaveInstanceState());
        agl.a = this.C;
        return agl;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof defpackage.agl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        defpackage.agl agl = (defpackage.agl) parcelable;
        super.onRestoreInstanceState(agl.e);
        a(agl.a);
        requestLayout();
    }

    public final void i() {
        defpackage.agk agk = p;
        android.support.v7.widget.SearchView.SearchAutoComplete searchAutoComplete = this.a;
        if (agk.a != null) {
            try {
                agk.a.invoke(searchAutoComplete, new java.lang.Object[0]);
            } catch (java.lang.Exception e2) {
            }
        }
        defpackage.agk agk2 = p;
        android.support.v7.widget.SearchView.SearchAutoComplete searchAutoComplete2 = this.a;
        if (agk2.b != null) {
            try {
                agk2.b.invoke(searchAutoComplete2, new java.lang.Object[0]);
            } catch (java.lang.Exception e3) {
            }
        }
    }

    static boolean a(android.content.Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
