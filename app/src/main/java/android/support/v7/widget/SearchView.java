package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import java.util.WeakHashMap;

/* compiled from: PG */
public class SearchView extends adu implements ye {
    public static final agk p = new agk();
    private final Intent A;
    private final CharSequence B;
    private boolean C;
    private CharSequence D;
    private boolean E;
    private int F;
    private boolean G;
    private int H;
    private final Runnable I;
    private Runnable J;
    private final View.OnClickListener K;
    private View.OnKeyListener L;
    private final TextView.OnEditorActionListener M;
    private final AdapterView.OnItemClickListener N;
    private final AdapterView.OnItemSelectedListener O;
    private TextWatcher P;
    public final SearchAutoComplete a;
    public final View b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final View g;
    public View.OnFocusChangeListener l;
    public boolean m;
    public uk n;
    public SearchableInfo o;
    private final View q;
    private final View r;
    private ago s;
    private Rect t;
    private Rect u;
    private int[] v;
    private int[] w;
    private final ImageView x;
    private final Drawable y;
    private final Intent z;

    public SearchView(Context context) {
        this(context, null);
    }

    /* compiled from: PG */
    public class SearchAutoComplete extends abf {
        public SearchView a;
        public boolean b;
        private int c;
        private final Runnable d;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.d = new agn(this);
            this.c = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            int i;
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                i = 256;
            } else if (i2 >= 600 || (i2 >= 640 && i3 >= 480)) {
                i = 192;
            } else {
                i = 160;
            }
            setMinWidth((int) TypedValue.applyDimension(1, (float) i, displayMetrics));
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.c = i;
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.a.hasFocus() && getVisibility() == 0) {
                this.b = true;
                if (SearchView.a(getContext())) {
                    agk agk = SearchView.p;
                    if (agk.c != null) {
                        try {
                            agk.c.invoke(this, true);
                        } catch (Exception e) {
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.a.h();
        }

        public boolean enoughToFilter() {
            return this.c <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
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

        @Override // defpackage.abf
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.b) {
                removeCallbacks(this.d);
                post(this.d);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
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

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new Rect();
        this.u = new Rect();
        this.v = new int[2];
        this.w = new int[2];
        this.I = new aga(this);
        this.J = new agc(this);
        new WeakHashMap();
        this.K = new agf(this);
        this.L = new agg(this);
        this.M = new agh(this);
        this.N = new agi(this);
        this.O = new agj(this);
        this.P = new agb(this);
        agw a2 = agw.a(context, attributeSet, xu.bO, i, 0);
        LayoutInflater.from(context).inflate(a2.g(xu.bY, R.layout.abc_search_view), (ViewGroup) this, true);
        this.a = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.a.a = this;
        this.q = findViewById(R.id.search_edit_frame);
        this.b = findViewById(R.id.search_plate);
        this.r = findViewById(R.id.submit_area);
        this.c = (ImageView) findViewById(R.id.search_button);
        this.d = (ImageView) findViewById(R.id.search_go_btn);
        this.e = (ImageView) findViewById(R.id.search_close_btn);
        this.f = (ImageView) findViewById(R.id.search_voice_btn);
        this.x = (ImageView) findViewById(R.id.search_mag_icon);
        sn.a(this.b, a2.a(xu.bZ));
        sn.a(this.r, a2.a(xu.cd));
        this.c.setImageDrawable(a2.a(xu.cc));
        this.d.setImageDrawable(a2.a(xu.bW));
        this.e.setImageDrawable(a2.a(xu.bT));
        this.f.setImageDrawable(a2.a(xu.cf));
        this.x.setImageDrawable(a2.a(xu.cc));
        this.y = a2.a(xu.cb);
        aaz.a(this.c, getResources().getString(R.string.abc_searchview_description_search));
        a2.g(xu.ce, R.layout.abc_search_dropdown_item_icons_2line);
        a2.g(xu.bU, 0);
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
        this.a.setOnFocusChangeListener(new agd(this));
        boolean a3 = a2.a(xu.bX, true);
        if (this.m != a3) {
            this.m = a3;
            a(a3);
            p();
        }
        int e2 = a2.e(xu.bS, -1);
        if (e2 != -1) {
            this.F = e2;
            requestLayout();
        }
        this.B = a2.c(xu.bV);
        this.D = a2.c(xu.ca);
        int a4 = a2.a(xu.bQ, -1);
        if (a4 != -1) {
            this.a.setImeOptions(a4);
        }
        int a5 = a2.a(xu.bR, -1);
        if (a5 != -1) {
            this.a.setInputType(a5);
        }
        setFocusable(a2.a(xu.bP, true));
        a2.b.recycle();
        this.z = new Intent("android.speech.action.WEB_SEARCH");
        this.z.addFlags(268435456);
        this.z.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.A = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.A.addFlags(268435456);
        this.g = findViewById(this.a.getDropDownAnchor());
        if (this.g != null) {
            this.g.addOnLayoutChangeListener(new age(this));
        }
        a(this.m);
        p();
    }

    public boolean requestFocus(int i, Rect rect) {
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
    @Override // defpackage.adu
    public void onMeasure(int i, int i2) {
        if (this.C) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.F <= 0) {
                    size = Math.min(j(), size);
                    break;
                } else {
                    size = Math.min(this.F, size);
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
                    size = Math.min(this.F, size);
                    break;
                }
                break;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        switch (mode2) {
            case Integer.MIN_VALUE:
                size2 = Math.min(k(), size2);
                break;
            case 0:
                size2 = k();
                break;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.a;
            Rect rect = this.t;
            searchAutoComplete.getLocationInWindow(this.v);
            getLocationInWindow(this.w);
            int i5 = this.v[1] - this.w[1];
            int i6 = this.v[0] - this.w[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            this.u.set(this.t.left, 0, this.t.right, i4 - i2);
            if (this.s == null) {
                this.s = new ago(this.u, this.t, this.a);
                setTouchDelegate(this.s);
                return;
            }
            this.s.a(this.u, this.t);
        }
    }

    private final int j() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private final int k() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private final void a(boolean z2) {
        int i;
        int i2 = 0;
        this.C = z2;
        int i3 = z2 ? 0 : 8;
        TextUtils.isEmpty(this.a.getText());
        this.c.setVisibility(i3);
        l();
        View view = this.q;
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
        boolean z3 = !TextUtils.isEmpty(this.a.getText());
        if (!z3 && (!this.m || this.G)) {
            z2 = false;
        }
        ImageView imageView = this.e;
        if (!z2) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private final void o() {
        post(this.I);
    }

    public final void c() {
        int[] iArr = this.a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.r.getBackground();
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
        SpannableStringBuilder spannableStringBuilder;
        if (this.D != null) {
            spannableStringBuilder = this.D;
        } else {
            spannableStringBuilder = this.B;
        }
        SearchAutoComplete searchAutoComplete = this.a;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        if (this.m && this.y != null) {
            int textSize = (int) (((double) this.a.getTextSize()) * 1.25d);
            this.y.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("   ");
            spannableStringBuilder2.setSpan(new ImageSpan(this.y), 1, 2, 33);
            spannableStringBuilder2.append(spannableStringBuilder);
            spannableStringBuilder = spannableStringBuilder2;
        }
        searchAutoComplete.setHint(spannableStringBuilder);
    }

    private final void q() {
        this.f.setVisibility(8);
    }

    public final void a(CharSequence charSequence) {
        TextUtils.isEmpty(this.a.getText());
        l();
        q();
        n();
        m();
        charSequence.toString();
    }

    public final void e() {
        Editable text = this.a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            this.a.a(false);
            this.a.dismissDropDown();
        }
    }

    public final void f() {
        if (!TextUtils.isEmpty(this.a.getText())) {
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

    /* access modifiers changed from: package-private */
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

    @Override // defpackage.ye
    public final void b() {
        this.a.setText("");
        this.a.setSelection(this.a.length());
        clearFocus();
        a(true);
        this.a.setImeOptions(this.H);
        this.G = false;
    }

    @Override // defpackage.ye
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
    public Parcelable onSaveInstanceState() {
        agl agl = new agl(super.onSaveInstanceState());
        agl.a = this.C;
        return agl;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof agl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        agl agl = (agl) parcelable;
        super.onRestoreInstanceState(agl.e);
        a(agl.a);
        requestLayout();
    }

    public final void i() {
        agk agk = p;
        SearchAutoComplete searchAutoComplete = this.a;
        if (agk.a != null) {
            try {
                agk.a.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception e2) {
            }
        }
        agk agk2 = p;
        SearchAutoComplete searchAutoComplete2 = this.a;
        if (agk2.b != null) {
            try {
                agk2.b.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception e3) {
            }
        }
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
