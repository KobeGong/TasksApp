package defpackage;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: acd  reason: default package */
/* compiled from: PG */
final class acd implements ListAdapter, SpinnerAdapter {
    private SpinnerAdapter a;
    private ListAdapter b;

    public acd(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.b = (ListAdapter) spinnerAdapter;
        }
        if (theme == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        } else if (spinnerAdapter instanceof ags) {
            ags ags = (ags) spinnerAdapter;
            if (ags.b() == null) {
                ags.a();
            }
        }
    }

    public final int getCount() {
        if (this.a == null) {
            return 0;
        }
        return this.a.getCount();
    }

    public final Object getItem(int i) {
        if (this.a == null) {
            return null;
        }
        return this.a.getItem(i);
    }

    public final long getItemId(int i) {
        if (this.a == null) {
            return -1;
        }
        return this.a.getItemId(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.a == null) {
            return null;
        }
        return this.a.getDropDownView(i, view, viewGroup);
    }

    public final boolean hasStableIds() {
        return this.a != null && this.a.hasStableIds();
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.a != null) {
            this.a.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.a != null) {
            this.a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }
}
