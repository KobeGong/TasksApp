package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.res.TypedArray;

import com.google.android.apps.tasks.R;

import defpackage.AbsDeviceOwner;

/* compiled from: PG */
public class SelectedAccountHeaderView extends android.widget.FrameLayout {
    public final android.view.View a;
    public final android.view.View b;
    public final android.widget.TextView c;
    public final boolean expandable;
    public final android.widget.ImageView e;
    public final android.widget.ImageView f;
    public final android.widget.ImageView closeButton;
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
        android.view.LayoutInflater.from(context).inflate(R.layout.selected_account_header, this);
        this.a = findViewById(R.id.no_selected_account);
        this.b = findViewById(R.id.has_selected_account);
        this.c = findViewById(R.id.no_selected_account_text);
        this.e = findViewById(R.id.avatar_recents_one);
        this.f = findViewById(R.id.avatar_recents_two);
        this.closeButton = findViewById(R.id.close_button);
        this.p = findViewById(R.id.account_display_name);
        this.q = findViewById(R.id.account_name);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.cfw.a, 0, 0);
        try {
            this.expandable = obtainStyledAttributes.getBoolean(defpackage.cfw.b, false);
            obtainStyledAttributes.recycle();
            findViewById(R.id.close_and_recents).setVisibility(this.expandable ? 0 : 8);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        defpackage.cky.b(onClickListener == null || this.expandable, "Click listener should only be set if the header is expandable");
        super.setOnClickListener(onClickListener);
    }

    public final void a(boolean z) {
        defpackage.cky.b(this.expandable, "Cannot change expand state on non expandable view");
        if (this.h != z) {
            this.h = z;
            a();
            b();
        }
    }

    public final void a(android.view.View.OnClickListener onClickListener) {
        this.closeButton.setOnClickListener(onClickListener);
    }

    public final void a() {
        int i2;
        if (this.expandable && this.n != null) {
            android.widget.TextView textView = this.c;
            if (this.n.b()) {
                if (this.h) {
                    i2 = R.drawable.quantum_ic_keyboard_arrow_up_grey600_24;
                } else {
                    i2 = R.drawable.quantum_ic_keyboard_arrow_down_grey600_24;
                }
                textView = this.q.getVisibility() == 0 ? this.q : this.p;
                if (textView == this.q) {
                    defpackage.vo.a(this.p, 0);
                }
            } else {
                i2 = this.n.getSize() > 0 ? this.h ? R.drawable.quantum_ic_keyboard_arrow_up_googblue_24 : R.drawable.quantum_ic_keyboard_arrow_down_googblue_24 : 0;
            }
            defpackage.vo.a(textView, i2);
        }
    }

    public final void b() {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        if (this.expandable) {
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
                linkedHashSet.addAll(this.n.availableAccounts);
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
        imageView.setContentDescription(getContext().getString(R.string.og_switch_account_to_recent_a11y, ((AbsDeviceOwner) obj).accountName()));
        imageView.setOnClickListener(new defpackage.cfy(this, obj));
    }
}
