package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.google.android.apps.tasks.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: abl  reason: default package */
/* compiled from: PG */
public final class abl {
    private static final PorterDuff.Mode c = PorterDuff.Mode.SRC_IN;
    private static abl d;
    private static final abn e = new abn();
    private static final int[] f = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    private static final int[] g = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] h = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] i = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] j = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    private static final int[] k = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};
    public final Object a = new Object();
    public final WeakHashMap b = new WeakHashMap(0);
    private WeakHashMap l;
    private qr m;
    private rj n;
    private TypedValue o;
    private boolean p;

    public static abl a() {
        if (d == null) {
            abl abl = new abl();
            d = abl;
            if (Build.VERSION.SDK_INT < 24) {
                abl.a("vector", new abp());
                abl.a("animated-vector", new abm());
            }
        }
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(android.content.Context r12, int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abl.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(android.content.Context r10, int r11) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abl.a(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private final Drawable a(Context context, long j2) {
        synchronized (this.a) {
            qx qxVar = (qx) this.b.get(context);
            if (qxVar == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) qxVar.a(j2);
            if (weakReference != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                int a2 = qv.a(qxVar.c, qxVar.e, j2);
                if (a2 >= 0 && qxVar.d[a2] != qx.a) {
                    qxVar.d[a2] = qx.a;
                    qxVar.b = true;
                }
            }
            return null;
        }
    }

    private final boolean a(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.a) {
            qx qxVar = (qx) this.b.get(context);
            if (qxVar == null) {
                qxVar = new qx();
                this.b.put(context, qxVar);
            }
            qxVar.a(j2, new WeakReference(constantState));
        }
        return true;
    }

    static boolean a(Context context, int i2, Drawable drawable) {
        int i3;
        int i4;
        PorterDuff.Mode mode;
        boolean z;
        PorterDuff.Mode mode2 = c;
        if (a(f, i2)) {
            i4 = R.attr.colorControlNormal;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(h, i2)) {
            i4 = R.attr.colorControlActivated;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(i, i2)) {
            z = true;
            mode = PorterDuff.Mode.MULTIPLY;
            i4 = 16842801;
            i3 = -1;
        } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
            i4 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i2 == R.drawable.abc_dialog_material_background) {
            i4 = 16842801;
            mode = mode2;
            z = true;
            i3 = -1;
        } else {
            i3 = -1;
            i4 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (add.b(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(a(agr.a(context, i4), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    private final void a(String str, abo abo) {
        if (this.m == null) {
            this.m = new qr();
        }
        this.m.put(str, abo);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final ColorStateList b(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList a2;
        if (this.l != null) {
            rj rjVar = (rj) this.l.get(context);
            colorStateList = rjVar != null ? (ColorStateList) rjVar.a(i2) : null;
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        if (i2 == R.drawable.abc_edit_text_material) {
            a2 = xw.a(context, R.color.abc_tint_edittext);
        } else if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            a2 = xw.a(context, R.color.abc_tint_switch_track);
        } else if (i2 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList b2 = agr.b(context, R.attr.colorSwitchThumbNormal);
            if (b2 == null || !b2.isStateful()) {
                iArr[0] = agr.a;
                iArr2[0] = agr.c(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = agr.d;
                iArr2[1] = agr.a(context, R.attr.colorControlActivated);
                iArr[2] = agr.e;
                iArr2[2] = agr.a(context, R.attr.colorSwitchThumbNormal);
            } else {
                iArr[0] = agr.a;
                iArr2[0] = b2.getColorForState(iArr[0], 0);
                iArr[1] = agr.d;
                iArr2[1] = agr.a(context, R.attr.colorControlActivated);
                iArr[2] = agr.e;
                iArr2[2] = b2.getDefaultColor();
            }
            a2 = new ColorStateList(iArr, iArr2);
        } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
            a2 = c(context, agr.a(context, R.attr.colorButtonNormal));
        } else if (i2 == R.drawable.abc_btn_borderless_material) {
            a2 = c(context, 0);
        } else if (i2 == R.drawable.abc_btn_colored_material) {
            a2 = c(context, agr.a(context, R.attr.colorAccent));
        } else if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
            a2 = xw.a(context, R.color.abc_tint_spinner);
        } else if (a(g, i2)) {
            a2 = agr.b(context, R.attr.colorControlNormal);
        } else if (a(j, i2)) {
            a2 = xw.a(context, R.color.abc_tint_default);
        } else if (a(k, i2)) {
            a2 = xw.a(context, R.color.abc_tint_btn_checkable);
        } else {
            a2 = i2 == R.drawable.abc_seekbar_thumb_material ? xw.a(context, R.color.abc_tint_seek_thumb) : colorStateList;
        }
        if (a2 != null) {
            if (this.l == null) {
                this.l = new WeakHashMap();
            }
            rj rjVar2 = (rj) this.l.get(context);
            if (rjVar2 == null) {
                rjVar2 = new rj();
                this.l.put(context, rjVar2);
            }
            rjVar2.b(i2, a2);
        }
        return a2;
    }

    private static ColorStateList c(Context context, int i2) {
        int a2 = agr.a(context, R.attr.colorControlHighlight);
        int c2 = agr.c(context, R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{agr.a, agr.c, agr.b, agr.e}, new int[]{c2, os.a(a2, i2), os.a(a2, i2), i2});
    }

    static void a(Drawable drawable, agu agu, int[] iArr) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (!add.b(drawable) || drawable.mutate() == drawable) {
            if (agu.d || agu.c) {
                ColorStateList colorStateList = agu.d ? agu.a : null;
                PorterDuff.Mode mode = agu.c ? agu.b : c;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    private static PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) e.a(Integer.valueOf(abn.a(i2, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i2, mode);
        e.a(Integer.valueOf(abn.a(i2, mode)), porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (add.b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = c;
        }
        drawable.setColorFilter(a(i2, mode));
    }
}
