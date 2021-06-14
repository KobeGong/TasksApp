package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* renamed from: aem  reason: default package */
/* compiled from: PG */
public final class aem extends ade {
    public aek c;
    private final int d;
    private final int e;
    private MenuItem f;

    public aem(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.d = 22;
            this.e = 21;
            return;
        }
        this.d = 21;
        this.e = 22;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.d) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.e) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((zd) getAdapter()).a.b(false);
            return true;
        }
    }

    @Override // defpackage.ade
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        zd zdVar;
        MenuItemImpl ziVar;
        int pointToPosition;
        int i2;
        if (this.c != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                int headersCount = headerViewListAdapter.getHeadersCount();
                zd zdVar2 = (zd) headerViewListAdapter.getWrappedAdapter();
                i = headersCount;
                zdVar = zdVar2;
            } else {
                zd zdVar3 = (zd) adapter;
                i = 0;
                zdVar = zdVar3;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= zdVar.getCount()) {
                ziVar = null;
            } else {
                ziVar = (MenuItemImpl) zdVar.getItem(i2);
            }
            MenuItem menuItem = this.f;
            if (menuItem != ziVar) {
                MenuBuilder zeVar = zdVar.a;
                if (menuItem != null) {
                    this.c.a(zeVar, menuItem);
                }
                this.f = ziVar;
                if (ziVar != null) {
                    this.c.b(zeVar, ziVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // defpackage.ade
    public final /* bridge */ /* synthetic */ boolean a(MotionEvent motionEvent, int i) {
        return super.a(motionEvent, i);
    }

    @Override // defpackage.ade
    public final /* bridge */ /* synthetic */ int a(int i, int i2, int i3, int i4, int i5) {
        return super.a(i, i2, i3, i4, i5);
    }

    @Override // defpackage.ade
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.ade, android.widget.AbsListView
    public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }

    @Override // defpackage.ade
    public final /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    @Override // defpackage.ade
    public final /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    @Override // defpackage.ade
    public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    @Override // defpackage.ade
    public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }
}
