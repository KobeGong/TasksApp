package com.google.android.libraries.onegoogle.accountmenu.internal;

/* compiled from: PG */
public class SelectedAccountHeaderView extends android.widget.FrameLayout {
    public final android.view.View a;
    public final android.view.View b;
    public final android.widget.TextView c;
    public final boolean d;
    public final android.widget.ImageView e;
    public final android.widget.ImageView f;
    public final android.widget.ImageView g;
    public boolean h;
    public boolean i;
    public defpackage.cer j;
    public defpackage.cdj k;
    public defpackage.cei l;
    public defpackage.cdf m;
    public defpackage.cdl n;
    public defpackage.cfb o;
    private final android.widget.TextView p;
    private final android.widget.TextView q;

    public SelectedAccountHeaderView(android.content.Context context) {
        this(context, null);
    }

    /* JADX INFO: finally extract failed */
    public SelectedAccountHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(context).inflate(2131034203, this);
        this.a = findViewById(2131755340);
        this.b = findViewById(2131755344);
        this.c = (android.widget.TextView) findViewById(2131755343);
        this.e = (android.widget.ImageView) findViewById(2131755345);
        this.f = (android.widget.ImageView) findViewById(2131755346);
        this.g = (android.widget.ImageView) findViewById(2131755227);
        this.p = (android.widget.TextView) findViewById(2131755224);
        this.q = (android.widget.TextView) findViewById(2131755225);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.cfw.a, 0, 0);
        try {
            this.d = obtainStyledAttributes.getBoolean(defpackage.cfw.b, false);
            obtainStyledAttributes.recycle();
            findViewById(2131755341).setVisibility(this.d ? 0 : 8);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        defpackage.cky.b(onClickListener == null || this.d, (java.lang.Object) "Click listener should only be set if the header is expandable");
        super.setOnClickListener(onClickListener);
    }

    public final void a(boolean z) {
        defpackage.cky.b(this.d, (java.lang.Object) "Cannot change expand state on non expandable view");
        if (this.h != z) {
            this.h = z;
            a();
            b();
        }
    }

    public final void a(android.view.View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    public final void a() {
        int i2;
        if (this.d && this.n != null) {
            android.widget.TextView textView = this.c;
            if (this.n.b()) {
                if (this.h) {
                    i2 = 2130837678;
                } else {
                    i2 = 2130837676;
                }
                textView = this.q.getVisibility() == 0 ? this.q : this.p;
                if (textView == this.q) {
                    defpackage.vo.a(this.p, 0);
                }
            } else {
                i2 = this.n.a() > 0 ? this.h ? 2130837677 : 2130837675 : 0;
            }
            defpackage.vo.a(textView, i2);
        }
    }

    public final void b() {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        if (this.d) {
            if (this.i || this.h) {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                return;
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (this.n.b()) {
                if (this.n.d()) {
                    linkedHashSet.add(this.n.e());
                }
                if (this.n.f()) {
                    linkedHashSet.add(this.n.g());
                }
                linkedHashSet.addAll(this.n.c);
                linkedHashSet.remove(this.n.c());
            }
            java.util.Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                obj = it.next();
            } else {
                obj = null;
            }
            if (it.hasNext()) {
                obj2 = it.next();
            }
            a(this.e, obj);
            a(this.f, obj2);
        }
    }

    private final void a(android.widget.ImageView imageView, java.lang.Object obj) {
        if (obj == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        this.l.a(imageView, obj, imageView.getWidth());
        imageView.setContentDescription(getContext().getString(2131951784, new java.lang.Object[]{((defpackage.cdu) obj).b()}));
        imageView.setOnClickListener(new defpackage.cfy(this, obj));
    }
}
