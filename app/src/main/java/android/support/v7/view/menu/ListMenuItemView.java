package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, zw {
    public zi a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        agw a2 = agw.a(getContext(), attributeSet, xu.bD, i2, 0);
        this.m = a2.a(xu.bE);
        this.n = a2.g(xu.bF, -1);
        this.c = a2.a(xu.bG, false);
        this.o = context;
        this.p = a2.a(xu.bH);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        a2.b.recycle();
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        sn.a(this, this.m);
        this.h = (TextView) findViewById(R.id.title);
        if (this.n != -1) {
            this.h.setTextAppearance(this.o, this.n);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        this.k = (ImageView) findViewById(R.id.submenuarrow);
        if (this.k != null) {
            this.k.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // defpackage.zw
    public final void a(zi ziVar) {
        int i2;
        String sb;
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        boolean z = true;
        int i3 = 0;
        this.a = ziVar;
        setVisibility(ziVar.isVisible() ? 0 : 8);
        CharSequence a2 = ziVar.a(this);
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
                    this.g = (RadioButton) c().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    a(this.g, -1);
                }
                compoundButton = this.g;
                compoundButton2 = this.i;
            } else {
                if (this.i == null) {
                    this.i = (CheckBox) c().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
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
            TextView textView = this.j;
            zi ziVar2 = this.a;
            char c2 = ziVar2.c();
            if (c2 == 0) {
                sb = "";
            } else {
                Resources resources = ziVar2.d.a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(ziVar2.d.a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = ziVar2.d.c() ? ziVar2.c : ziVar2.b;
                zi.a(sb2, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                zi.a(sb2, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                zi.a(sb2, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                zi.a(sb2, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                zi.a(sb2, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                zi.a(sb2, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                switch (c2) {
                    case '\b':
                        sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        break;
                    case '\n':
                        sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        break;
                    case ' ':
                        sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
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
        Drawable icon = ziVar.getIcon();
        if (!this.e) {
            z = false;
        }
        if ((z || this.c) && !(this.f == null && icon == null && !this.c)) {
            if (this.f == null) {
                this.f = (ImageView) c().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
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
            ImageView imageView = this.k;
            if (!hasSubMenu) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
        setContentDescription(ziVar.getContentDescription());
    }

    private final void a(View view, int i2) {
        if (this.l != null) {
            this.l.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    @Override // defpackage.zw
    public final zi a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // defpackage.zw
    public final boolean c_() {
        return false;
    }

    private final LayoutInflater c() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.b != null && this.b.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            rect.top = layoutParams.bottomMargin + this.b.getHeight() + layoutParams.topMargin + rect.top;
        }
    }
}
