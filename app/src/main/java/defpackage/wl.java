package defpackage;

/* renamed from: wl reason: default package */
/* compiled from: PG */
public final class wl extends defpackage.xg implements android.content.DialogInterface {
    public final android.support.v7.app.AlertController a = new android.support.v7.app.AlertController(getContext(), this, getWindow());

    protected wl(android.content.Context context, int i) {
        super(context, a(context, i));
    }

    static int a(android.content.Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130772225, typedValue, true);
        return typedValue.resourceId;
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        int i;
        int i2;
        super.onCreate(bundle);
        android.support.v7.app.AlertController alertController = this.a;
        alertController.b.setContentView(alertController.B);
        android.view.View findViewById = alertController.c.findViewById(2131755182);
        android.view.View findViewById2 = findViewById.findViewById(2131755191);
        android.view.View findViewById3 = findViewById.findViewById(2131755183);
        android.view.View findViewById4 = findViewById.findViewById(2131755180);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById.findViewById(2131755189);
        alertController.c.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        android.view.View findViewById5 = viewGroup.findViewById(2131755191);
        android.view.View findViewById6 = viewGroup.findViewById(2131755183);
        android.view.View findViewById7 = viewGroup.findViewById(2131755180);
        android.view.ViewGroup a2 = android.support.v7.app.AlertController.a(findViewById5, findViewById2);
        android.view.ViewGroup a3 = android.support.v7.app.AlertController.a(findViewById6, findViewById3);
        android.view.ViewGroup a4 = android.support.v7.app.AlertController.a(findViewById7, findViewById4);
        alertController.t = (android.support.v4.widget.NestedScrollView) alertController.c.findViewById(2131755185);
        alertController.t.setFocusable(false);
        alertController.t.setNestedScrollingEnabled(false);
        alertController.x = (android.widget.TextView) a3.findViewById(16908299);
        if (alertController.x != null) {
            if (alertController.f != null) {
                alertController.x.setText(alertController.f);
            } else {
                alertController.x.setVisibility(8);
                alertController.t.removeView(alertController.x);
                if (alertController.g != null) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) alertController.t.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.t);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else {
                    a3.setVisibility(8);
                }
            }
        }
        boolean z2 = false;
        alertController.h = (android.widget.Button) a4.findViewById(16908313);
        alertController.h.setOnClickListener(alertController.G);
        if (android.text.TextUtils.isEmpty(alertController.i)) {
            alertController.h.setVisibility(8);
        } else {
            alertController.h.setText(alertController.i);
            alertController.h.setVisibility(0);
            z2 = true;
        }
        alertController.l = (android.widget.Button) a4.findViewById(16908314);
        alertController.l.setOnClickListener(alertController.G);
        if (android.text.TextUtils.isEmpty(alertController.m)) {
            alertController.l.setVisibility(8);
        } else {
            alertController.l.setText(alertController.m);
            alertController.l.setVisibility(0);
            z2 |= true;
        }
        alertController.p = (android.widget.Button) a4.findViewById(16908315);
        alertController.p.setOnClickListener(alertController.G);
        if (android.text.TextUtils.isEmpty(alertController.q)) {
            alertController.p.setVisibility(8);
        } else {
            alertController.p.setText(alertController.q);
            alertController.p.setVisibility(0);
            z2 |= true;
        }
        android.content.Context context = alertController.a;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130772224, typedValue, true);
        if (typedValue.data != 0) {
            if (z2) {
                android.support.v7.app.AlertController.a(alertController.h);
            } else if (z2) {
                android.support.v7.app.AlertController.a(alertController.l);
            } else if (z2) {
                android.support.v7.app.AlertController.a(alertController.p);
            }
        }
        if (!(z2)) {
            a4.setVisibility(8);
        }
        if (alertController.y != null) {
            a2.addView(alertController.y, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            alertController.c.findViewById(2131755192).setVisibility(8);
        } else {
            alertController.v = (android.widget.ImageView) alertController.c.findViewById(16908294);
            if (!(!android.text.TextUtils.isEmpty(alertController.e)) || !alertController.E) {
                alertController.c.findViewById(2131755192).setVisibility(8);
                alertController.v.setVisibility(8);
                a2.setVisibility(8);
            } else {
                alertController.w = (android.widget.TextView) alertController.c.findViewById(2131755193);
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
        if (!z && a3 != null) {
            android.view.View findViewById8 = a3.findViewById(2131755187);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z4) {
            if (alertController.t != null) {
                alertController.t.setClipToPadding(true);
            }
            android.view.View view = null;
            if (!(alertController.f == null && alertController.g == null)) {
                view = a2.findViewById(2131755194);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (a3 != null) {
            android.view.View findViewById9 = a3.findViewById(2131755186);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        if (alertController.g instanceof android.support.v7.app.AlertController.RecycleListView) {
            android.support.v7.app.AlertController.RecycleListView recycleListView = (android.support.v7.app.AlertController.RecycleListView) alertController.g;
            if (!z || !z4) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), z4 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z ? recycleListView.getPaddingBottom() : recycleListView.b);
            }
        }
        if (!z3) {
            android.view.View view2 = alertController.g != null ? alertController.g : alertController.t;
            if (view2 != null) {
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
                android.view.View findViewById10 = alertController.c.findViewById(2131755184);
                android.view.View findViewById11 = alertController.c.findViewById(2131755188);
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    defpackage.sn.a.d(view2, i3);
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
                            alertController.t.a = new defpackage.we(findViewById10, findViewById11);
                            alertController.t.post(new defpackage.wf(alertController, findViewById10, findViewById11));
                        } else if (alertController.g != null) {
                            alertController.g.setOnScrollListener(new defpackage.wg(findViewById10, findViewById11));
                            alertController.g.post(new defpackage.wh(alertController, findViewById10, findViewById11));
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
        android.widget.ListView listView = alertController.g;
        if (listView != null && alertController.z != null) {
            listView.setAdapter(alertController.z);
            int i4 = alertController.A;
            if (i4 >= 0) {
                listView.setItemChecked(i4, true);
                listView.setSelection(i4);
            }
        }
    }

    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        android.support.v7.app.AlertController alertController = this.a;
        if (alertController.t != null && alertController.t.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        android.support.v7.app.AlertController alertController = this.a;
        if (alertController.t != null && alertController.t.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
