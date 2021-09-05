package android.support.v7.view.menu;

import defpackage.MenuItemImpl;
import defpackage.ViewCompat;

/* compiled from: PG */
public class ListMenuItemView extends android.widget.LinearLayout implements android.widget.AbsListView.SelectionBoundsAdjuster, defpackage.zw {
    public MenuItemImpl a;
    public android.widget.ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private android.widget.ImageView f;
    private android.widget.RadioButton g;
    private android.widget.TextView h;
    private android.widget.CheckBox i;
    private android.widget.TextView j;
    private android.widget.ImageView k;
    private android.widget.LinearLayout l;
    private android.graphics.drawable.Drawable m;
    private int n;
    private android.content.Context o;
    private android.graphics.drawable.Drawable p;
    private android.view.LayoutInflater q;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772243);
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        defpackage.agw a2 = defpackage.agw.a(getContext(), attributeSet, defpackage.xu.bD, i2, 0);
        this.m = a2.a(defpackage.xu.bE);
        this.n = a2.g(defpackage.xu.bF, -1);
        this.c = a2.a(defpackage.xu.bG, false);
        this.o = context;
        this.p = a2.a(defpackage.xu.bH);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, 2130772203, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        a2.b.recycle();
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.a((android.view.View) this, this.m);
        this.h = (android.widget.TextView) findViewById(2131755042);
        if (this.n != -1) {
            this.h.setTextAppearance(this.o, this.n);
        }
        this.j = (android.widget.TextView) findViewById(2131755197);
        this.k = (android.widget.ImageView) findViewById(2131755201);
        if (this.k != null) {
            this.k.setImageDrawable(this.p);
        }
        this.b = (android.widget.ImageView) findViewById(2131755199);
        this.l = (android.widget.LinearLayout) findViewById(2131755200);
    }

    public final void a(MenuItemImpl ziVar) {
        int i2;
        java.lang.String sb;
        android.widget.CompoundButton compoundButton;
        android.widget.CompoundButton compoundButton2;
        boolean z = true;
        int i3 = 0;
        this.a = ziVar;
        setVisibility(ziVar.isVisible() ? 0 : 8);
        java.lang.CharSequence a2 = ziVar.a((defpackage.zw) this);
        if (a2 != null) {
            this.h.setText(a2);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean isCheckable = ziVar.isCheckable();
        if (!(!isCheckable && this.g == null && this.i == null)) {
            if (this.a.e()) {
                if (this.g == null) {
                    this.g = (android.widget.RadioButton) c().inflate(2131034128, this, false);
                    a(this.g, -1);
                }
                compoundButton = this.g;
                compoundButton2 = this.i;
            } else {
                if (this.i == null) {
                    this.i = (android.widget.CheckBox) c().inflate(2131034125, this, false);
                    a(this.i, -1);
                }
                compoundButton = this.i;
                compoundButton2 = this.g;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility() == 8)) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (this.i != null) {
                    this.i.setVisibility(8);
                }
                if (this.g != null) {
                    this.g.setVisibility(8);
                }
            }
        }
        boolean d2 = ziVar.d();
        ziVar.c();
        if (!d2 || !this.a.d()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            android.widget.TextView textView = this.j;
            MenuItemImpl ziVar2 = this.a;
            char c2 = ziVar2.c();
            if (c2 == 0) {
                sb = "";
            } else {
                android.content.res.Resources resources = ziVar2.d.a.getResources();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                if (android.view.ViewConfiguration.get(ziVar2.d.a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(2131951670));
                }
                int i4 = ziVar2.d.c() ? ziVar2.c : ziVar2.b;
                MenuItemImpl.a(sb2, i4, 65536, resources.getString(2131951666));
                MenuItemImpl.a(sb2, i4, 4096, resources.getString(2131951662));
                MenuItemImpl.a(sb2, i4, 2, resources.getString(2131951661));
                MenuItemImpl.a(sb2, i4, 1, resources.getString(2131951667));
                MenuItemImpl.a(sb2, i4, 4, resources.getString(2131951669));
                MenuItemImpl.a(sb2, i4, 8, resources.getString(2131951665));
                switch (c2) {
                    case 8:
                        sb2.append(resources.getString(2131951663));
                        break;
                    case 10:
                        sb2.append(resources.getString(2131951664));
                        break;
                    case ' ':
                        sb2.append(resources.getString(2131951668));
                        break;
                    default:
                        sb2.append(c2);
                        break;
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.j.getVisibility() != i2) {
            this.j.setVisibility(i2);
        }
        android.graphics.drawable.Drawable icon = ziVar.getIcon();
        if (!this.e) {
            z = false;
        }
        if ((z || this.c) && !(this.f == null && icon == null && !this.c)) {
            if (this.f == null) {
                this.f = (android.widget.ImageView) c().inflate(2131034126, this, false);
                a(this.f, 0);
            }
            if (icon != null || this.c) {
                this.f.setImageDrawable(z ? icon : null);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        setEnabled(ziVar.isEnabled());
        boolean hasSubMenu = ziVar.hasSubMenu();
        if (this.k != null) {
            android.widget.ImageView imageView = this.k;
            if (!hasSubMenu) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
        setContentDescription(ziVar.getContentDescription());
    }

    private final void a(android.view.View view, int i2) {
        if (this.l != null) {
            this.l.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    public final MenuItemImpl a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f != null && this.c) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    public final boolean c_() {
        return false;
    }

    private final android.view.LayoutInflater c() {
        if (this.q == null) {
            this.q = android.view.LayoutInflater.from(getContext());
        }
        return this.q;
    }

    public void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        if (this.b != null && this.b.getVisibility() == 0) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.b.getLayoutParams();
            rect.top = layoutParams.bottomMargin + this.b.getHeight() + layoutParams.topMargin + rect.top;
        }
    }
}
