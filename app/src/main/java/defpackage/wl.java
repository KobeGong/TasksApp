package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* renamed from: wl  reason: default package */
/* compiled from: PG */
public final class wl extends xg implements DialogInterface {
    public final AlertController a = new AlertController(getContext(), this, getWindow());

    protected wl(Context context, int i) {
        super(context, a(context, i));
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog, defpackage.xg
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.xg
    public final void onCreate(Bundle bundle) {
        boolean z;
        View findViewById;
        int i;
        int i2;
        View findViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.a;
        alertController.b.setContentView(alertController.B);
        View findViewById3 = alertController.c.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        alertController.c.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a2 = AlertController.a(findViewById7, findViewById4);
        ViewGroup a3 = AlertController.a(findViewById8, findViewById5);
        ViewGroup a4 = AlertController.a(findViewById9, findViewById6);
        alertController.t = (NestedScrollView) alertController.c.findViewById(R.id.scrollView);
        alertController.t.setFocusable(false);
        alertController.t.setNestedScrollingEnabled(false);
        alertController.x = (TextView) a3.findViewById(16908299);
        if (alertController.x != null) {
            if (alertController.f != null) {
                alertController.x.setText(alertController.f);
            } else {
                alertController.x.setVisibility(8);
                alertController.t.removeView(alertController.x);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.t.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.t);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a3.setVisibility(8);
                }
            }
        }
        boolean z2 = false;
        alertController.h = (Button) a4.findViewById(16908313);
        alertController.h.setOnClickListener(alertController.G);
        if (TextUtils.isEmpty(alertController.i)) {
            alertController.h.setVisibility(8);
        } else {
            alertController.h.setText(alertController.i);
            alertController.h.setVisibility(0);
            z2 = true;
        }
        alertController.l = (Button) a4.findViewById(16908314);
        alertController.l.setOnClickListener(alertController.G);
        if (TextUtils.isEmpty(alertController.m)) {
            alertController.l.setVisibility(8);
        } else {
            alertController.l.setText(alertController.m);
            alertController.l.setVisibility(0);
            z2 |= true;
        }
        alertController.p = (Button) a4.findViewById(16908315);
        alertController.p.setOnClickListener(alertController.G);
        if (TextUtils.isEmpty(alertController.q)) {
            alertController.p.setVisibility(8);
        } else {
            alertController.p.setText(alertController.q);
            alertController.p.setVisibility(0);
            z2 |= true;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z2) {
                AlertController.a(alertController.h);
            } else if (z2) {
                AlertController.a(alertController.l);
            } else if (z2) {
                AlertController.a(alertController.p);
            }
        }
        if (!(z2)) {
            a4.setVisibility(8);
        }
        if (alertController.y != null) {
            a2.addView(alertController.y, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.v = (ImageView) alertController.c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.e)) || !alertController.E) {
                alertController.c.findViewById(R.id.title_template).setVisibility(8);
                alertController.v.setVisibility(8);
                a2.setVisibility(8);
            } else {
                alertController.w = (TextView) alertController.c.findViewById(R.id.alertTitle);
                alertController.w.setText(alertController.e);
                if (alertController.u != null) {
                    alertController.v.setImageDrawable(alertController.u);
                } else {
                    alertController.w.setPadding(alertController.v.getPaddingLeft(), alertController.v.getPaddingTop(), alertController.v.getPaddingRight(), alertController.v.getPaddingBottom());
                    alertController.v.setVisibility(8);
                }
            }
        }
        boolean z3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z4 = (a2 == null || a2.getVisibility() == 8) ? false : true;
        if (a4 == null || a4.getVisibility() == 8) {
            z = false;
        } else {
            z = true;
        }
        if (!(z || a3 == null || (findViewById2 = a3.findViewById(R.id.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z4) {
            if (alertController.t != null) {
                alertController.t.setClipToPadding(true);
            }
            View view = null;
            if (!(alertController.f == null && alertController.g == null)) {
                view = a2.findViewById(R.id.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a3 == null || (findViewById = a3.findViewById(R.id.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        if (alertController.g instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertController.g;
            if (!z || !z4) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), z4 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z ? recycleListView.getPaddingBottom() : recycleListView.b);
            }
        }
        if (!z3) {
            ViewGroup viewGroup3 = alertController.g != null ? alertController.g : alertController.t;
            if (viewGroup3 != null) {
                if (z4) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                int i3 = i | i2;
                View findViewById10 = alertController.c.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = alertController.c.findViewById(R.id.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    sn.a.d(viewGroup3, i3);
                    if (findViewById10 != null) {
                        a3.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        a3.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i3 & 1) == 0) {
                        a3.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 != null && (i3 & 2) == 0) {
                        a3.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (!(findViewById10 == null && findViewById11 == null)) {
                        if (alertController.f != null) {
                            alertController.t.a = new we(findViewById10, findViewById11);
                            alertController.t.post(new wf(alertController, findViewById10, findViewById11));
                        } else if (alertController.g != null) {
                            alertController.g.setOnScrollListener(new wg(findViewById10, findViewById11));
                            alertController.g.post(new wh(alertController, findViewById10, findViewById11));
                        } else {
                            if (findViewById10 != null) {
                                a3.removeView(findViewById10);
                            }
                            if (findViewById11 != null) {
                                a3.removeView(findViewById11);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.g;
        if (listView != null && alertController.z != null) {
            listView.setAdapter(alertController.z);
            int i4 = alertController.A;
            if (i4 >= 0) {
                listView.setItemChecked(i4, true);
                listView.setSelection(i4);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.a;
        if (alertController.t != null && alertController.t.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.a;
        if (alertController.t != null && alertController.t.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
