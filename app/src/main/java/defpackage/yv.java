package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: yv  reason: default package */
/* compiled from: PG */
public final class yv extends zq implements View.OnKeyListener, PopupWindow.OnDismissListener, MenuPresenter {
    private PopupWindow.OnDismissListener A;
    public final Handler a;
    public final List b = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener c = new yw(this);
    public View d;
    public ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final int k;
    private final boolean l;
    private final List m = new ArrayList();
    private final View.OnAttachStateChangeListener n = new yx(this);
    private final aek o = new yy(this);
    private int p = 0;
    private int q = 0;
    private View r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private zu z;

    public yv(Context context, View view, int i2, int i3, boolean z2) {
        this.h = context;
        this.r = view;
        this.j = i2;
        this.k = i3;
        this.l = z2;
        this.x = false;
        this.s = i();
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    @Override // defpackage.zq
    public final void b(boolean z2) {
        this.x = z2;
    }

    @Override // defpackage.zz
    public final void d() {
        if (!f()) {
            for (MenuBuilder zeVar : this.m) {
                c(zeVar);
            }
            this.m.clear();
            this.d = this.r;
            if (this.d != null) {
                boolean z2 = this.e == null;
                this.e = this.d.getViewTreeObserver();
                if (z2) {
                    this.e.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.n);
            }
        }
    }

    @Override // defpackage.zz
    public final void e() {
        int size = this.b.size();
        if (size > 0) {
            za[] zaVarArr = (za[]) this.b.toArray(new za[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                za zaVar = zaVarArr[i2];
                if (zaVar.a.r.isShowing()) {
                    zaVar.a.e();
                }
            }
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        e();
        return true;
    }

    private final int i() {
        if (sn.a.j(this.r) == 1) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.zq
    public final void a(MenuBuilder zeVar) {
        zeVar.a(this, this.h);
        if (f()) {
            c(zeVar);
        } else {
            this.m.add(zeVar);
        }
    }

    private final void c(MenuBuilder zeVar) {
        View view;
        za zaVar;
        int i2;
        int i3;
        int i4;
        int i5;
        MenuItemImpl ziVar;
        int i6;
        zd zdVar;
        int i7;
        View view2;
        LayoutInflater from = LayoutInflater.from(this.h);
        zd zdVar2 = new zd(zeVar, from, this.l);
        if (!f() && this.x) {
            zdVar2.b = true;
        } else if (f()) {
            zdVar2.b = zq.b(zeVar);
        }
        int a2 = a(zdVar2, null, this.h, this.i);
        ael ael = new ael(this.h, this.j, this.k);
        ael.b = this.o;
        ael.m = this;
        ael.a(this);
        ael.l = this.r;
        ael.j = this.q;
        ael.b();
        ael.h();
        ael.a(zdVar2);
        ael.b(a2);
        ael.j = this.q;
        if (this.b.size() > 0) {
            za zaVar2 = (za) this.b.get(this.b.size() - 1);
            MenuBuilder zeVar2 = zaVar2.b;
            int size = zeVar2.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    ziVar = null;
                    break;
                }
                MenuItem item = zeVar2.getItem(i8);
                if (item.hasSubMenu() && zeVar == item.getSubMenu()) {
                    ziVar = item;
                    break;
                }
                i8++;
            }
            if (ziVar == null) {
                view2 = null;
            } else {
                ade ade = zaVar2.a.e;
                ListAdapter adapter = ade.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i6 = headerViewListAdapter.getHeadersCount();
                    zdVar = (zd) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i6 = 0;
                    zdVar = (zd) adapter;
                }
                int i9 = 0;
                int count = zdVar.getCount();
                while (true) {
                    if (i9 >= count) {
                        i7 = -1;
                        break;
                    } else if (ziVar == ((MenuItemImpl) zdVar.getItem(i9))) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
                if (i7 == -1) {
                    view2 = null;
                } else {
                    int firstVisiblePosition = (i7 + i6) - ade.getFirstVisiblePosition();
                    if (firstVisiblePosition < 0 || firstVisiblePosition >= ade.getChildCount()) {
                        view2 = null;
                    } else {
                        view2 = ade.getChildAt(firstVisiblePosition);
                    }
                }
            }
            view = view2;
            zaVar = zaVar2;
        } else {
            view = null;
            zaVar = null;
        }
        if (view != null) {
            if (ael.a != null) {
                try {
                    ael.a.invoke(ael.r, false);
                } catch (Exception e2) {
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ael.r.setEnterTransition(null);
            }
            ade ade2 = ((za) this.b.get(this.b.size() - 1)).a.e;
            int[] iArr = new int[2];
            ade2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.d.getWindowVisibleDisplayFrame(rect);
            if (this.s == 1) {
                if (ade2.getWidth() + iArr[0] + a2 <= rect.right) {
                    i2 = 1;
                }
                i2 = 0;
            } else {
                if (iArr[0] - a2 < 0) {
                    i2 = 1;
                }
                i2 = 0;
            }
            boolean z2 = i2 == 1;
            this.s = i2;
            if (Build.VERSION.SDK_INT >= 26) {
                ael.l = view;
                i3 = 0;
                i4 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.r.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.q & 7) == 5) {
                    iArr2[0] = iArr2[0] + this.r.getWidth();
                    iArr3[0] = iArr3[0] + view.getWidth();
                }
                i3 = iArr3[0] - iArr2[0];
                i4 = iArr3[1] - iArr2[1];
            }
            if ((this.q & 5) == 5) {
                if (z2) {
                    i5 = i3 + a2;
                } else {
                    i5 = i3 - view.getWidth();
                }
            } else if (z2) {
                i5 = view.getWidth() + i3;
            } else {
                i5 = i3 - a2;
            }
            ael.g = i5;
            ael.i = true;
            ael.h = true;
            ael.a(i4);
        } else {
            if (this.t) {
                ael.g = this.v;
            }
            if (this.u) {
                ael.a(this.w);
            }
            ael.p = this.g;
        }
        this.b.add(new za(ael, zeVar, this.s));
        ael.d();
        ade ade3 = ael.e;
        ade3.setOnKeyListener(this);
        if (zaVar == null && this.y && zeVar.f != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ade3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(zeVar.f);
            ade3.addHeaderView(frameLayout, null, false);
            ael.d();
        }
    }

    @Override // defpackage.zz
    public final boolean f() {
        if (this.b.size() <= 0 || !((za) this.b.get(0)).a.r.isShowing()) {
            return false;
        }
        return true;
    }

    public final void onDismiss() {
        za zaVar;
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                zaVar = null;
                break;
            }
            zaVar = (za) this.b.get(i2);
            if (!zaVar.a.r.isShowing()) {
                break;
            }
            i2++;
        }
        if (zaVar != null) {
            zaVar.b.b(false);
        }
    }

    @Override // defpackage.zt
    public final void a(boolean z2) {
        for (za zaVar : this.b) {
            a(zaVar.a.e.getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.zt
    public final void a(zu zuVar) {
        this.z = zuVar;
    }

    @Override // defpackage.zt
    public final boolean a(aad aad) {
        for (za zaVar : this.b) {
            if (aad == zaVar.b) {
                zaVar.a.e.requestFocus();
                return true;
            }
        }
        if (!aad.hasVisibleItems()) {
            return false;
        }
        a((MenuBuilder) aad);
        if (this.z != null) {
            this.z.a(aad);
        }
        return true;
    }

    @Override // defpackage.zt
    public final void a(MenuBuilder zeVar, boolean z2) {
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (zeVar == ((za) this.b.get(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.b.size()) {
                ((za) this.b.get(i3)).b.b(false);
            }
            za zaVar = (za) this.b.remove(i2);
            zaVar.b.b(this);
            if (this.f) {
                ael ael = zaVar.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    ael.r.setExitTransition(null);
                }
                zaVar.a.r.setAnimationStyle(0);
            }
            zaVar.a.e();
            int size2 = this.b.size();
            if (size2 > 0) {
                this.s = ((za) this.b.get(size2 - 1)).c;
            } else {
                this.s = i();
            }
            if (size2 == 0) {
                e();
                if (this.z != null) {
                    this.z.a(zeVar, true);
                }
                if (this.e != null) {
                    if (this.e.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.n);
                this.A.onDismiss();
            } else if (z2) {
                ((za) this.b.get(0)).b.b(false);
            }
        }
    }

    @Override // defpackage.zt
    public final boolean a() {
        return false;
    }

    @Override // defpackage.zt
    public final Parcelable c() {
        return null;
    }

    @Override // defpackage.zt
    public final void a(Parcelable parcelable) {
    }

    @Override // defpackage.zq
    public final void a(int i2) {
        if (this.p != i2) {
            this.p = i2;
            this.q = jd.a(i2, sn.a.j(this.r));
        }
    }

    @Override // defpackage.zq
    public final void a(View view) {
        if (this.r != view) {
            this.r = view;
            this.q = jd.a(this.p, sn.a.j(this.r));
        }
    }

    @Override // defpackage.zq
    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // defpackage.zz
    public final ListView g() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((za) this.b.get(this.b.size() - 1)).a.e;
    }

    @Override // defpackage.zq
    public final void b(int i2) {
        this.t = true;
        this.v = i2;
    }

    @Override // defpackage.zq
    public final void c(int i2) {
        this.u = true;
        this.w = i2;
    }

    @Override // defpackage.zq
    public final void c(boolean z2) {
        this.y = z2;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.zq
    public final boolean h() {
        return false;
    }
}
